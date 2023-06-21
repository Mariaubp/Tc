grammar compiladores;

@header {
package compiladores;

}
//---------------------------------------------------------------------------------
//******************************** PARCIAL 1 Modificado ***************************
//---------------------------------------------------------------------------------

/*
 * Creado por: Jonathan Mora Colodrero - Constanza Gigli
 * Fecha: 21/06/23
 * Materia: Técnicas de Compilación
 */
 
 
 /*
    Consigna:
    Dado un archivo de entrada en lenguaje C, se debe generar como salida el Árbol Sintáctico (ANTLR) correcto. 
    Para lograr esto se debe construir un parser que tenga como mínimo la implementación de los siguientes puntos:
        - Reconocimiento de un bloque de código, que puede estar en cualquier parte del código fuente, controlando balance de llaves.
        - Verificación de :
            # declaraciones y asignaciones, 
            # operaciones aritmético/lógicas, 
            # declaración/llamada a función.

        - Verificación de las estructuras de control if, for y while. 
    Ante el primer error léxico o sintáctico el programa deberá terminar.
*/
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PYC : ';';
PA : '(';
PC : ')';
LLA : '{';
LLC : '}';
CA : '[';
CC : ']';
ASIGN : '=';
COMA : ',';
SUMA : '+';
RESTA : '-';
MULT : '*';
DIV : '/';
MOD : '%';

MENOR : '<';
MAYOR : '>';
MENORI : '<=';
MAYORI: '>=';
EQ : '==';
DISTINTO : '!=';

NUMERO : DIGITO+ ;

NUMERO_DOUBLE : DIGITO+ '.' DIGITO+;

INT : 'int';
CHAR : 'char';
DOUBLE : 'double';
VOID : 'void';

WHILE : 'while';
IF : 'if' ;
ELSE: 'else';
FOR : 'for' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
WS : [ \t\n\r] -> skip ;


programa : instrucciones EOF ;
instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion 
            | declaracion
            | asignacion_double 
            | declaracion_double
            | bloque        
            | if_else
            | bucle_for
            | while_
            | call
            ;

bloque : LLA instrucciones LLC ;

asignacion : ID ASIGN expresion PYC;
declaracion : INT ID inicializacion listaid PYC;

inicializacion : ASIGN NUMERO
               |
               ;
listaid : COMA ID inicializacion listaid
        |
        ;

expresion : termino exp
          | llamadaF 
          ;

exp : SUMA termino exp
    | RESTA termino exp
    | comp
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
       |
       ;

       

asignacion_double : ID ASIGN expresion PYC;
declaracion_double : DOUBLE ID inicializacion_double listaid PYC;

inicializacion_double : ASIGN NUMERO_DOUBLE
                      | ASIGN NUMERO
                      |
                      ;

comp : MENOR 
     | MAYOR 
     | MENORI
     | MAYORI 
     | EQ
     | DISTINTO 
     ;

while_ : WHILE PA expresion_D PC bloque;         

expresion_D : expresion comp expresion
            | PYC
            | llamadaF
            ;


if_else : IF PA expresion_D PC bloque 
             | ELSE bloque
             ;

bucle_for : FOR PA varTipo asignacion 
         | expresion_D 
         | PC
         | bloque 
         ;

varTipo  : INT 
         | CHAR
         | DOUBLE
         ;


//funciones
call : TiposF ID PA parametros PC bloque ;
parametros : parametro (COMA parametro)*
           |
           ;
parametro : TiposF ID ;

llamadaF : ID PA argumentos PC PYC;
argumentos : expresion (COMA expresion)*; 

TiposF      : INT 
            | CHAR
            | DOUBLE
            | VOID
            ;
      