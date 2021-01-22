parser grammar Anasint;
options{
    tokenVocab=Analex;
}

programa: PROGRAMA variables SUBPROGRAMAS instrucciones EOF;

variables: VARIABLES declaraciones*;

declaraciones: IDENTIFICADOR (COMA IDENTIFICADOR)* DPS (NUM | SEQ PA NUM PC);

instrucciones:

