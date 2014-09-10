/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar capiroto;

helloworld:
              'helloworld';

selecao:
           constantes ':' comandos mais_selecao;

mais_selecao:
                (selecao)?;

constantes:
              numero_intervalo mais_constantes;

mais_constantes:
                   (',' constantes)?;

numero_intervalo:
                    op_unario NUM_INT intervalo_opcional;

intervalo_opcional:
                      ('..' op_unario NUM_INT)?;

op_unario:
             ('-')?;

exp_aritmetica:
                  termo outros_termos;

op_multiplicacao:
                    '*' | '/';

op_adicao:
             '+' | '-';

termo:
         fator outros_fatores;