/* 
grammar compiladores;

@header {
package compiladores;

}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PYC   : ';'  ;
PA    : '('  ;
PC    : ')'  ;
LLA   : '{'  ;
LLC   : '}'  ;
CA    : '['  ;
CC    : ']'  ;
ASIGN : '='  ;
COMA  : ','  ;
SUMA  : '+'  ;
RESTA : '-'  ;
MULT  : '*'  ;
DIV   : '/'  ;
MOD   : '%'  ;
NOT   : '!'  ;
COMPARADOR: '==' | '!=' | '>' | '>=' | '<' | '<='  ;

// Bucles
WHILE : 'while' ;

//Regla para los espacios en blanco
WS : [ \t\n\r] -> skip ;

// Numeros
NUMERO : DIGITO+ ;

// Tipos de datos
INT :    'int' ;   
DOUBLE : 'double' ;                                   

// OTRO : . ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;

// Tokens o reglas gramaticales: minuscula
// Reglas lexicas: MAYUSCULA

// Analisis sintactico descendente:
// match y derivar

// Analisis sintactico ascendente:
// desplazar y reducir

// si : s 
//    | EOF
//    ;

// // PA (Abre parentesis) PC (Cierra parentesis)
// s : PA s PC s 
//   | LLA s LLC s
//   | CA s CC s
//   |
//   ;

// Un programa es un conjunto de instrucciones hasta final de archivo
programa : instrucciones EOF ;

// las instrucciones 
instrucciones : instruccion instrucciones
              |   
              ;

// las instrucciones son:
instruccion : asignacion 
            | declaracion
            | bloque
            | iwhile
            ;

// Bloque de codigo
bloque : LLA instrucciones LLC ;

// Una asignacion es:
asignacion : ID ASIGN (NUMERO|ID) PYC ;

// Una declaracion es:
// una variable de tal tipo que se llama asi:
// puede ser inicializada o puede ser un listado de variables
declaracion : (INT|DOUBLE) ID inicializacion listaid PYC ;

// una inicializacion
inicializacion : ASIGN NUMERO 
               |    
               ;

// lista de valores
listaid : COMA ID inicializacion listaid
        |
        ;

/*
expresion : termino exp ;

exp : SUMA  termino exp 
    | RESTA termino exp 
    |
    ;

termino : factor term ;

term : MULT factor term
     | DIV  factor term
     | MOD  factor term
     | 
     ;

// con los parentesis se resetea la prioridad 
factor : NUMERO 
       | ID
       | PA expresion PC
       ;
/

iwhile : WHILE PA comparacion PC (bloque|instruccion);

comparacion : (NUMERO|ID) COMPARADOR (NUMERO|ID) ;



---------------------------------------------------------------------------------
**************************** ULTIMA CLASE ***************************************
---------------------------------------------------------------------------------

grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PYC : ';' ;
PA  : '(' ;
PC  : ')' ;
LLA : '{' ;
LLC : '}' ;
ASIGN : '=' ;
COMA  : ',' ;
SUMA  : '+' ;
RESTA : '-' ;
MULT  : '*' ;
DIV   : '/' ;
MOD   : '%' ;
EQ : '==' ;

NUMERO : DIGITO+ ;
// OTRO : . ;

INT : 'int' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

WS : [ \t\n\r] -> skip ;

// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;

// si : s
//    | EOF
//    ;

// s : PA s PC s
//   |
//   ;

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion
            | declaracion
            | bloque
            ;

bloque : LLA instrucciones LLC ;

asignacion : ID ASIGN expresion PYC;

declaracion : INT ID inicializacion listaid PYC ;

inicializacion : ASIGN NUMERO
               |
               ;

listaid : COMA ID inicializacion listaid
        |
        ;

// X = ( 3 + 5 ) / 4; // ID ASSIGN expresion PYC

expresion : termino exp ;

exp : SUMA  termino exp
    | RESTA termino exp
    |
    ;

termino : factor term ;

term : MULT factor term
     | DIV  factor term
     | MOD  factor term
     |
     ;

factor : NUMERO
       | ID
       | PA expresion PC 
       ;

*/

//---------------------------------------------------------------------------------
//**************************** PARCIAL 1 ***************************************
//---------------------------------------------------------------------------------

/*
 * Creado por: Jonathan Mora Colodrero 
 * Fecha: 23/05/23
 * Materia: Técnicas de Compilación
 */
 
 
/*
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

grammar compiladores;

@header {
package compiladores;
}
// Lista de TOKENS

// Caracteres especiales
WS: [ \n\t\r] -> skip;


//TOKENS de palabras reservadas de tipos
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';


// TOKENS de palabras reservadas 
IF : 'if';
ELSE : 'else';
RETURN: 'return';
TRUE: 'true';
FALSE: 'false';


// TOKENS de palabras reservadas de ciclos
WHILE : 'while';
FOR : 'for';


// TOKENS de simbolos de puntuacion
PYC: ';';
COMA: ',';


//TOKENS de Simbolos
PA: '('; 
PC: ')'; 

LLA: '{'; 
LLC: '}'; 
 
CA: '['; 
CC: ']'; 

// TOKENS de Asignaciones
ASSIGN: '=';

// TOKENS de Operaciones Aritmeticas
SUMA: '+';
RESTA: '-';
DIV: '/';
MULT: '*';
MOD: '%';
INCREMENTO: '++';
DECREMENTO: '--';
PREG: '?';
          
// TOKENS de Operaciones Logicas
OR : '||';
AND : '&&';
NOT : '!';

// TOKENS de operaciones relacionales
COMPARADOR: '==' | '!=' | '>' | '>=' | '<' | '<=';

//TOKENS de valores
fragment DIGITO: [0-9];

//Entero
NUMERO: (DIGITO)+;

//Flotante
FLOATNUMBER: NUMERO '.' | NUMERO '.' NUMERO | '.' NUMERO;

fragment LETRA : [a-zA-Z] ;
ID : ('_' | LETRA) ('_' | LETRA | DIGITO)*;

CHARVALUE: '\'' LETRA '\'';



//Lista de reglas gramaticales
programa: instructions
       |
       ;

instructions: instructions intr 
            | intr
            ;

intr: varDeclaration
    | funcDeclaration
    ;

//Declaracion de variables
varDeclaration: especificarType listaVarDecl PYC;

listaVarDecl: listaVarDecl COMA varDeclIni
            | varDeclIni
            ;

//Inicializacion de variables
varDeclIni: varId
          | expresion
          ;

varId: ID;

//Tipos de variables
especificarType: INT | DOUBLE | CHAR;

//Tipos de returns
returnEspecificarType: INT | DOUBLE | CHAR | VOID;


//Declaracion de funcion
funcDeclaration: returnEspecificarType ID PA listaParam PC declaracion
               | ID PA listaParam PC declaracion
               ;

listaParam: especificarType varId listaParam
          | COMA especificarType varId listaParam
          |
          ;

declaracion: declararEspecifica | bloqueInst | selectionDecla | iterationDecla | returnDecla | intr;

//Bloque de instrucciones
bloqueInst: LLA listaDecla LLC;

listaDecla: declaracion listaDecla
          | 
          ;

declararEspecifica: expresion PYC
                   | PYC
                   ;

//Seleccion
selectionDecla: IF PA expresionSimple PC declaracion
              | IF PA expresionSimple PC declaracion ELSE declaracion
              ;

//Ciclos
iterationDecla: whileDecla
              | forDecla
              ;
//While
whileDecla: WHILE PA expresionSimple PC declaracion;

//For
forDecla: FOR PA forDefinicion PC declaracion;
forDefinicion: forInit PYC expresionSimple PYC expresion;
forInit: especificarType listaVarDecl;

//Return
returnDecla: RETURN PYC
           | RETURN expresion PYC
           ;


expresion : varId ASSIGN expresion 
          | varId INCREMENTO 
          | varId DECREMENTO 
          | expresionSimple
          ;

expresionSimple: expresionSimple OR andExpression
               | andExpression
               ;

andExpression: andExpression AND expresionRelUnitaria
             | expresionRelUnitaria
             ;

expresionRelUnitaria: NOT expresionRelUnitaria
                    | expresionRel
                    ;

expresionRel: sumaExpresion COMPARADOR sumaExpresion
            | sumaExpresion
            ;

// Suma Aritmetica
sumaExpresion: sumaExpresion operadorSumaAritm term
             | term
             ;

// Operadores de suma aritmetica
operadorSumaAritm: SUMA | RESTA ;

// Multiplicacion aritmetica
term: term operadorMultiAritm expresionUnitaria
    | expresionUnitaria
    ;

// Operadores de multiplicacion aritmetica
operadorMultiAritm: MULT | DIV | MOD;

// Operacion unaria
expresionUnitaria: operadorUnitaria expresionUnitaria
                 | factor
                 ;

// Operadores unarios
operadorUnitaria: RESTA | MULT | PREG ;

factor: value 
      | varId;

value: PA expresion PC 
     | call
     | resValue
     ;

// Llamada a funcion
call: varId PA argumento PC;

// Argumentos de funcion
argumento: listaArgumento
         |
         ;
// Lista de argumentos de funcion
listaArgumento: listaArgumento COMA expresion
              | expresion
              ;

// Valores posibles
resValue: NUMERO 
        | FLOATNUMBER 
        | CHARVALUE
        | TRUE
        | FALSE
        ;
