grammar compiladores;

/*@header {
package compiladores;
}*/

fragment LETRA : [A-Za-z]+;
fragment DIGITO : [0-9] ;
fragment DOUBLE : 'double';
fragment INT : 'int';
COMP: '==' | '!=' | '<' | '<=' | '>' | '>=' | '&&' | '||';
PYC : ';';
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
MOD: '%';
NUMERO :DIGITO+;
TIPO: INT | DOUBLE;
NOMBRE : ('_' | LETRA) (LETRA | DIGITO | '_')* ;
WS: [ \t\n\r]+ -> skip;


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

/*ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;*/

/*s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }        

  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
  | EOF
  ;

*/
programa : instrucciones EOF;
instrucciones : instruccion instrucciones
             |;            
instruccion : simple
            | bloque
            | iwhile
            ;            
simple : asignacion PYC
|declaracion PYC
;
bloque: LLA instrucciones LLC;
/*asignacion :ID ASIGN NUMERO PYC;*/
asignacion :NOMBRE'='(NUMERO|NOMBRE);
declaracion : TIPO var;
var : NOMBRE COMA var 
| NOMBRE | asignacion COMA var
| asignacion;
iwhile : 'while' PA condicion PC;
condicion : NOMBRE COMP (NUMERO |NOMBRE );
/*inicializacion: ASIGN NUMERO
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
       ;*/