lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: ('\r') ?'\n'-> skip;
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];

PROGRAMA: 'PROGRAMA';
VARIABLES: 'VARIABLES';
SUBPROGRAMAS: 'SUBPROGRAMAS';
INSTRUCCIONES: 'INSTRUCCIONES';

NUM: 'NUM';
ENTERO: DIGITO+;
SEQ: 'SEQ';
OP_MULT: '*';
OP_SR: '+' | '-';
CIERTO: 'T';
FALSO: 'F';
SI: 'si';
ENTONCES: 'entonces';
SINO: 'sino';
FSI: 'fsi';
MIENTRAS: 'mientras';
FMIENTRAS: 'fmientras';
HACER: 'hacer';
ULTIMAPOSICION: 'ULTIMAPOSICION';
VACIO: 'VACIO';

COMPARADORES: '<' | '>' | '>=' | '<=' | '==' | '!=' | '&&' | '||' | '!' ;
IGUAL: '=';

GUION : '-';
COMA : ',';
PYC : ';';
CA: '[';
CC: ']';
LA: '{';
LC: '}';
DPS: ':';

PA: '(';
PC: ')';

COMENTARIO_BLOQUE: '/' .? '*/' -> skip ;
COMENTARIO_LINEA:'//' .*? FIN_LINEA -> skip ;
IDENTIFICADOR: LETRA (LETRA | DIGITO | '_')*;