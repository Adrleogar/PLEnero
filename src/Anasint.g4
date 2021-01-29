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

operacion: operacion OP_SR (operacion)+         #VisitOperacionSumRest
         | operacion OP_MULT (operacion)+       #VisitOperacionMultiplicacion
         | ENTERO                               #VisitEntero
         | IDENTIFICADOR                        #VisitIdentificador
         | ultima_posicion                      #VisitUltimaPos
         | acceso_secuencia                     #VisitAcceso
         ;

ultima_posicion: ULTIMA_POSICION CA IDENTIFICADOR CC;

operaciones: operacion (COMA operacion)*; //Se hace esto para incluir operaciones separadas entre comas
secuencia: CA operaciones CC;

acceso_secuencia: IDENTIFICADOR CA operacion CC;

expr: operacion | secuencia;
exprs: expr (COMA expr)*;

asignacion: IDENTIFICADOR (COMA IDENTIFICADOR)* IGUAL (exprs);

condicional: SI PA expr_bool PC ENTONCES instrucciones (SINO instrucciones)? FSI;

expr_bool: CIERTO
         | FALSO
         | comparacion
         | vacia;

comparacion: expr? COMPARADORES expr;

vacia: VACIA CA IDENTIFICADOR CC;

iteracion: MIENTRAS PA expr_bool PC HACER instrucciones FMIENTRAS;

ruptura: RUPTURA;

