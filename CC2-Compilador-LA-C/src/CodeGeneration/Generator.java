/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeGeneration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lucas M Caarvalhaes
 */
public class Generator {

    private static StringBuilder code = new StringBuilder();
    private static String ident = "";

    public static void enterScope() {
        ident += "\t";
    }

    public static void leaveScope() {
        if (ident.length() > 1) {
            ident = ident.substring(0, ident.length() - 1);
        }
    }

    public static void addCode(String cd) {
        code.append(cd);
    }

    private static String normalizeExpression(String inputExp){
        String result = inputExp;
        Pattern equalPattern = Pattern.compile("[^<>](=)");
        
        Matcher m = equalPattern.matcher(result);
        while (m.find()) {
            String s = m.group();
            result = result.replace(s, s.replace("=", "=="));
        }
        
        return result
                .replace(" ou ", " || ").replace(" e ", " && ")
                .replace("nao","!").replace("verdadeiro", "1")
                .replace("falso", "0");
    }
    
    public static String attrib(String id, String expression){
        String res = "";
        res += ident;
        res += id+" = "+normalizeExpression(expression)+";";
        return res;
    }
    
    public static String whileLoop(String expression, String code){
        String res = "";
        res += ident;
        res += "while("+normalizeExpression(expression)+"){\n";
        enterScope();
        res += code;
        leaveScope();
        res += ident;
        res += "}\n";
        return res;
    }
    
    public static String doWhileLoop(String expression, String code){
        String res = "";
        res += ident;
        res += "do{\n";
        enterScope();
        res += code;
        leaveScope();
        res += ident;
        res += "}while("+normalizeExpression(expression)+");\n";
        return res;
    }
    
    public static String forLoop(String counter, String expIni, String expFim,
            String foreignCode) {
        StringBuilder code = new StringBuilder();
        code.append(ident);
        code.append("for(");
        code.append(counter);
        code.append("=");
        code.append(expIni);
        code.append(";");
        code.append(counter);
        code.append("<");
        code.append(expFim);
        code.append(";");
        code.append(counter);
        code.append("++");
        code.append("){\n");
        code.append(ident);
        code.append(foreignCode);
        code.append(ident);
        code.append("}");
        return code.toString();
    }
    
    public static String write(ArrayList<String> names, ArrayList<String> types) {
        StringBuilder code = new StringBuilder();
        code.append(ident);
        code.append("printf(");
        String mods = "\"";
        //Collections.reverse(names);
        for (String e : types) {
            mods += mod(e)+" ";
        }
        mods = mods.trim()+"\"";
        code.append(mods);
        String vals = "";
        //Collections.reverse(names);
        for (String e : names) {
            vals += ","+e;
        }
        code.append(vals);
        code.append(");");
        return code.toString();
    }
    
    public static String read(HashMap<String, String> nameToType) {
        StringBuilder code = new StringBuilder();
        code.append(ident);
        code.append("scanf(");
        String mods = "\"";
        ArrayList<String> names = new ArrayList<>(nameToType.values());
        Collections.reverse(names);
        for (String e : names) {
            mods += mod(e)+" ";
        }
        mods = mods.trim()+"\"";
        code.append(mods);
        String vals = "";
        names = new ArrayList<>(nameToType.keySet());
        Collections.reverse(names);
        for (String e : names) {
            vals += ",&"+e;
        }
        code.append(vals);
        code.append(");");
        return code.toString();
    }

    private static String mod(String type) {
        String modifier;
        switch (type) {
            case "inteiro":
                modifier = "%d";
                break;
            case "real":
                modifier = "%f";
                break;
            case "literal":
                modifier = "%s";
                break;
            case "logico":
                modifier = "%d";
                break;
            default:
                /*TODO struct e tipos custom*/
                modifier = "";
                break;
        }
        return modifier;
    }

    public static String condition(String conditionExpression, String mainCode,
            String optionalElse) {
        StringBuilder code = new StringBuilder();
        code.append(ident);
        code.append("if(");
        code.append(normalizeExpression(conditionExpression));
        code.append("){\n");
        code.append(ident);
        code.append(mainCode);
        code.append("\n");

        if (optionalElse.length() > 0) {
            code.append(ident);
            code.append("}else{\n");
            code.append(ident);
            code.append(optionalElse);
            code.append(ident);
            code.append("}\n");
        } else {
            code.append(ident);
            code.append("}\n");
        }

        return code.toString();
    }

    public static void declareVariables(ArrayList<String> nomes, String tipo, String dim) {
        for (String nome : nomes) {
            declareVariable(nome, tipo, dim);
        }
    }

    public static void declareVariable(String nome, String tipo) {
        declareVariable(nome, tipo, "");
    }

    public static void declareVariable(String nome, String tipo, String vec) {
        String blob = makeVariable(nome, tipo, vec) + "\n";

        if (blob.length() > 0) {
            code.append(ident);
            code.append(blob);
        }
    }

    private static String makeVariable(String nome, String tipo, String vec){
        String blob = "";
        switch (tipo) {
            case "inteiro":
                blob = "int " + nome + vec + ";";
                break;
            case "real":
                blob = "float " + nome + vec + ";";
                break;
            case "literal":
                blob = "char " + nome + vec + "[150];";
                break;
            case "logico":
                blob = "bool " + nome + vec + ";";
                break;
            default:
                /*TODO struct e tipos custom*/
                blob = "todo " + nome + vec + ";";
                break;
        }
        return blob;
    }
    
    public static void reset() {
        code = new StringBuilder();
    }

    public static void includes() {
        code.append("#include <stdio.h>\n\n");
    }

    public static void startAlgorithm() {
        code.append("int main(){\n");
        enterScope();
    }

    public static void endAlgorithm() {
        code.append(ident);
        code.append("return 0;\n");
        leaveScope();
        code.append("}");
    }

    public static void printCode() {
        System.out.println(code);
    }
}