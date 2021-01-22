parser grammar Anasint;
options{
    tokenVocab=Analex;
}

sentencia: PROGRAMA variables SUBPROGRAMAS INSTRUCCIONES instrucciones EOF;

variables: VARIABLES (declaraciones)*;

declaraciones: IDENTIFICADOR (COMA IDENTIFICADOR)* DPS (NUM | SEQ PA NUM PC) PYC;

instrucciones:  (operacion PYC
               | asignacion PYC
               | condicional PYC
               | iteracion PYC
               | ruptura PYC
               )*;

operacion: (ENTERO | IDENTIFICADOR) OP_SR (operacion)+
         | (ENTERO | IDENTIFICADOR) OP_MULT (operacion)+
         | (ENTERO | IDENTIFICADOR)
         ;
operaciones: operacion (COMA operacion)*; //Se hace esto para incluir operaciones separadas entre comas
secuencia: CA operaciones CC;

expr: operacion | secuencia;
exprs: expr (COMA expr)*;

asignacion: IDENTIFICADOR (COMA IDENTIFICADOR)* IGUAL (exprs);

condicional: SI PA expr_bool PC ENTONCES instrucciones (SINO instrucciones)? FSI;

expr_bool: CIERTO
         | FALSO
         | expr COMPARADORES expr;

iteracion: MIENTRAS PA expr_bool PC HACER instrucciones FMIENTRAS;

ruptura: RUPTURA;

