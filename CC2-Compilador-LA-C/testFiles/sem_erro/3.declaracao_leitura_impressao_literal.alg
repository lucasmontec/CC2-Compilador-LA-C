algoritmo
  declare
    x: literal
  leia(x)
  escreva(x)
fim_algoritmo


funcao demonio(var x : logico): logico
	retorna x  ou nao x
fim_funcao

algoritmo
  declare
    x: logico
  
    x <- (( verdadeiro ou falso ) e verdadeiro ) ou demonio(falso)
    escreva(x)
fim_algoritmo
