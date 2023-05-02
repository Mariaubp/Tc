grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z]+;
fragment DIGITO : [0-9] ;
COMP: '==' | '!=' | '<' | '<=' | '>' | '>=' | '&&' | '||';
/*PYC : ';';
PA  : '(';
PC  : ')';
LLA : '{';
LLC : '}'; 
ASIGN :'=';
COMA: ',';
SUMA : '+' ;
RESTA: '-' ;
MULT: '*' ;
DIV : '/'; 
MOD: '%';*/
NUMERO :DIGITO+;
DECIMAL: DIGITO + '.' DIGITO+;
EXP: LETRA | NUMERO | DECIMAL;
WS: [ \t\n\r]+ -> skip;
programa: (DEC | ASIG | iwhile)*;

DEC :('int' | 'double') LETRA (',' LETRA)* ('=' LETRA)?;
ASIG: LETRA '=' EXP;
iwhile: 'while' '(' EXP COMP EXP ')' '{' programa'}';




/*CA : '[';
CC : ']';

si : s
| EOF
;

//Es una regla lexica permite saber que abri
s : PA s PC s
| LLA s LLC s
| CA s CC s
|
;*/

/*ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
WS : [ \t\n\r] -> skip;

/*s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }        

  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
  | EOF
  ;


programa : instrucciones EOF;
instrucciones : instruccion instrucciones
             |
             ;
instruccion : asignacion 
|declaracion
;
asignacion :ID ASIGN NUMERO PYC;
declaracion : INT ID inicializacion listaId PYC;

inicializacion: ASIGN NUMERO
         |
         ;  
listaId : COMA ID listaId
 |
 ;
 expresion :exp termino;
  exp:SUMA termino exp
    | RESTA termino exp
    |
    ;

termino : factor term ;

term : MULT factor term
     | DIV factor term
     | MOD factor term
     |
     ;
factor : NUMERO
       | ID 
       | PA expresion PC
       ;
       */



