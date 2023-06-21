//---------------------------------------------------------------------------------
//********************************** PARCIAL 2 ************************************
//---------------------------------------------------------------------------------

/*
 
Creado por:  Constanza Gigli-Jonathan Mora Colodrero 
Fecha: 21/06/23
Materia: Técnicas de Compilación
*/

/*
    Consigna:
    Dado un archivo de entrada en lenguaje C, se debe generar como salida el Árbol Sintáctico (ANTLR) correcto. 
    Para lograr esto se debe construir un parser que tenga como mínimo la implementación de los siguientes puntos:
        
Reconocimiento de un bloque de código, que puede estar en cualquier parte del código fuente, controlando balance de llaves.
Verificación de :# declaraciones y asignaciones, # operaciones aritmético/lógicas, # declaración/llamada a función.

        
Verificación de las estructuras de control if, for y while. 
  Ante el primer error léxico o sintáctico el programa deberá terminar.
*/

grammar compiladores;


@header {
package compiladores;
}

fragment DIGITO : [0-9] ;

//Tokens Caracteres especiales
PA : '(';
PC : ')';
LA : '{';
LC : '}';
PyC: ';';
IGU: '=';
COM: ',';

//Tokens Comparadores
EQ: '==';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
NEQ: '!=';

//Tokens Expresiones logicas
AND: '&&';
OR: '||';

// Tokens Aritmetica
SUMA: '+';
RESTA: '-';
MULT: '*'; 
DIV: '/'; 
MOD: '%'; 

// Tokens palabras reservadas de tipo
INT : 'int' ;
DOUBLE: 'double';
BOOL: 'boolean';

// Tokens palabras reservadas
IIF: 'if';
IRETURN: 'return';
TRUE: 'true';
FALSE: 'false';

// Tokens de palabras reservadas de ciclos
IWHILE: 'while';
IFOR: 'for';

// Nombre de variables
VAR: [a-zA-Z]+ ;

// Caracteres Especiales
WS : [ \t\n\r] -> skip;

// Declaracion de entero, doble y bool en numeros
ENTERO : DIGITO+ ;
DOBLE: DIGITO+ '.' DIGITO+;
BOOLEANO: ( TRUE | FALSE );

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : declaracion PyC
            | asignacion PyC
            | bucle_while 
            | condicional_if
            | bucle_for
            | declaracion_funcion
            | asignacion_funcion
            ;

declaracion: INT VAR concatenacion 
            | DOUBLE VAR concatenacion 
            | BOOL VAR concatenacion 
            | INT asignacion concatenacion 
            | DOUBLE asignacion concatenacion 
            | BOOL asignacion concatenacion 
            ;

concatenacion: COM VAR concatenacion 
              | COM asignacion
              |
              ;

asignacion: VAR IGU VAR
            | VAR IGU ENTERO
            | VAR IGU DOBLE
            | VAR IGU BOOLEANO
            ;

bloque: LA instrucciones LC;

op_logicos: AND
          | OR
          ;

op_booleanas: TRUE
            | FALSE
            ;

bucle_while: IWHILE PA cond PC bloque;

condicional_if: IIF PA cond PC bloque;

bucle_for: IFOR PA (declaracion PyC cond PyC post_pre_incremento ) PC bloque;

declaracion_funcion: tipo_var VAR PA declaracion_argumentos PC PyC;

declaracion_argumentos: tipo_var concatenacion_argumentos_declaracion;

concatenacion_argumentos_declaracion: COM declaracion_argumentos
                                    | 
                                    ;


asignacion_funcion: tipo_var VAR PA asignacion_argumentos PC bloque_funcion;

asignacion_argumentos: INT VAR concatenacion_argumentos_asignacion 
                                 | DOUBLE VAR concatenacion_argumentos_asignacion 
                                 | INT asignacion concatenacion_argumentos_asignacion 
                                 | DOUBLE asignacion concatenacion_argumentos_asignacion 
                                 ;

concatenacion_argumentos_asignacion: COM asignacion_argumentos
              |
              ;

bloque_funcion: LA instrucciones_funcion LC;

instrucciones_funcion: instruccion_funcion instrucciones_funcion
                     |
                     ;

instruccion_funcion : declaracion PyC
            | asignacion PyC
            | bucle_while 
            | condicional_if
            | bucle_for
            | return_tipo PyC
            ;

return_tipo: IRETURN VAR
           | IRETURN factor
           | IRETURN
           ;

tipo_var: INT
        | DOUBLE
        | BOOL
        ;

post_pre_incremento: VAR SUMA SUMA
                   | VAR RESTA RESTA
                   | SUMA SUMA VAR
                   | RESTA RESTA VAR
                   | VAR IGU VAR SUMA factor 
                   | VAR IGU VAR RESTA factor     
                   ;

cond: e comparadores e 
    | cond op_logicos cond
    | op_booleanas op_logicos op_booleanas
    | op_booleanas
    ;

comparadores : GT
             | GE
             | LT
             | LE
             | EQ
             | NEQ
             ;

e: term exp;

exp: SUMA e
    | RESTA e
    |
    ;

term: factor t;

t: MULT term
 | DIV term
 | MOD term
 |
 ;

factor: ENTERO
      | DOBLE
      | BOOLEANO
      | VAR
      | PA e PC
      ;
