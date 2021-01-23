parser grammar Anasint;
options{
    tokenVocab=Analex;
}

sentencia: PROGRAMA variables SUBPROGRAMAS INSTRUCCIONES instrucciones EOF;

variables: VARIABLES (declaraciones)*;

tipo: NUM | SEQ PA NUM PC;

declaraciones: IDENTIFICADOR (COMA IDENTIFICADOR)* DPS tipo PYC;

instrucciones:  (operacion PYC
               | asignacion PYC
               | condicional PYC
               | iteracion PYC
               | ruptura PYC
               )*;

operacion: operacion OP_SR (operacion)+
         | operacion OP_MULT (operacion)+
         | (ENTERO | IDENTIFICADOR)
         | ultima_posicion
         ;

ultima_posicion: ULTIMAPOSICION CA IDENTIFICADOR CC;

operaciones: operacion (COMA operacion)*; //Se hace esto para incluir operaciones separadas entre comas
secuencia: CA operaciones CC;

expr: operacion | secuencia;
exprs: expr (COMA expr)*;

asignacion: IDENTIFICADOR (COMA IDENTIFICADOR)* IGUAL (exprs);

condicional: SI PA expr_bool PC ENTONCES instrucciones (SINO instrucciones)? FSI;

expr_bool: CIERTO
         | FALSO
         | expr COMPARADORES expr
         | vacio;

vacio: VACIO CA IDENTIFICADOR CC;

iteracion: MIENTRAS PA expr_bool PC HACER instrucciones FMIENTRAS;

ruptura: RUPTURA;

