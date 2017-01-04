package sintatico;
import java_cup.runtime.Symbol;


//secao do usuario, nao coloquei nada
%%

//Adição de comunicação com o cup
%cup
//nome da classe
%class Yylex
//formato do scanner
%unicode
//ativa contagem de linhas
%line
//ativa contaagem de colunas
%column
//Para retornar 0 tipo Tokens criados.
//%type Tokens
//coloca em modo de debug que permite usar de forma isolada para testes

%debug
//macros sao escritas em expresoes regulares

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
Comment = "--"{InputCharacter}* {LineTerminator}?
BlockComment = {Comment}"["{InputCharacter}* {LineTerminator}?{Comment}"]"
TraditionalComment = {Comment}|{BlockComment}

number = [0-9]+
name = [A-Za-z][A-Za-z0-9]*
string = ["][A-Za-z0-9]*["]

%%
//regras
<YYINITIAL> {

 ";"          { return new Symbol ( sym.t_SEMICOLON, yychar, yyline, yytext()); }
 "="          { return new Symbol ( sym.t_ATTRIBUTION, yychar, yyline, yytext()); }
 ("END")      { return new Symbol ( sym.t_END, yychar, yyline, yytext()); }
 ("DO")       { return new Symbol ( sym.t_DO, yychar, yyline, yytext()); }
 ("WHILE")    { return new Symbol ( sym.t_WHILE, yychar, yyline, yytext()); }
 ("REPEAT")   { return new Symbol ( sym.t_REPEAT, yychar, yyline, yytext()); }
 ("UNTIL")    { return new Symbol ( sym.t_UNTIL, yychar, yyline, yytext()); }
 ("IF")       { return new Symbol ( sym.t_IF, yychar, yyline, yytext()); }
 ("THEN")     { return new Symbol ( sym.t_THEN, yychar, yyline, yytext()); }
 ("ELSEIF")   { return new Symbol ( sym.t_ELSEIF, yychar, yyline, yytext()); }
 ("ELSE")     { return new Symbol ( sym.t_ELSE, yychar, yyline, yytext()); }
 ("FOR")      { return new Symbol ( sym.t_FOR, yychar, yyline, yytext()); }
 ("IN")       { return new Symbol ( sym.t_IN, yychar, yyline, yytext()); }
 ("FUNCTION") { return new Symbol ( sym.t_FUNCTION, yychar, yyline, yytext()); }
 ("LOCAL")    { return new Symbol ( sym.t_LOCAL, yychar, yyline, yytext()); }
 ("RETURN")   { return new Symbol ( sym.t_RETURN, yychar, yyline, yytext()); }
 ("BREAK")    { return new Symbol ( sym.t_BREAK, yychar, yyline, yytext()); }
 "."          { return new Symbol ( sym.t_DOT, yychar, yyline, yytext()); }
 ":"          { return new Symbol ( sym.t_COLON, yychar, yyline, yytext()); }
 ","          { return new Symbol ( sym.t_COMMA, yychar, yyline, yytext()); }
 "["          { return new Symbol ( sym.t_BRACKET_OPEN, yychar, yyline, yytext()); }
 "]"          { return new Symbol ( sym.t_BRACKET_CLOSE, yychar, yyline, yytext()); }
 "NIL"        { return new Symbol ( sym.t_NIL, yychar, yyline, yytext()); }
 "TRUE"       { return new Symbol ( sym.t_TRUE, yychar, yyline, yytext()); }
 "FALSE"      { return new Symbol ( sym.t_FALSE, yychar, yyline, yytext()); }
 {number}     { return new Symbol ( sym.t_NUMBER, yychar, yyline, new Integer (yytext())); }
 {string}     { return new Symbol ( sym.t_STRING, yychar, yyline, yytext()); }
 {name}       { return new Symbol ( sym.t_NAME, yychar, yyline, yytext()); }
 "("          { return new Symbol ( sym.t_PARENTHESE_OPEN, yychar, yyline, yytext()); }
 ")"          { return new Symbol ( sym.t_PARENTHESE_CLOSE, yychar, yyline, yytext()); }
 "["          { return new Symbol ( sym.t_BRACERS_OPEN, yychar, yyline, yytext()); }
 "]"          { return new Symbol ( sym.t_BRACERS_CLOSE, yychar, yyline, yytext()); }
 "..."        { return new Symbol ( sym.t_DOTDOTDOT, yychar, yyline, yytext()); }
 ("+")        { return new Symbol ( sym.t_PLUS, yychar, yyline, yytext()); }
 ("-")        { return new Symbol ( sym.t_MINUS, yychar, yyline, yytext()); }
 ("*")        { return new Symbol ( sym.t_TIMES, yychar, yyline, yytext()); }
 ("/")        { return new Symbol ( sym.t_DEVIDED, yychar, yyline, yytext()); }
 ("^")        { return new Symbol ( sym.t_EXP, yychar, yyline, yytext()); }
 ("%")        { return new Symbol ( sym.t_PERCENT, yychar, yyline, yytext()); }
 ("..")       { return new Symbol ( sym.t_DOTDOT, yychar, yyline, yytext()); }
 ("<")        { return new Symbol ( sym.t_LESS_THEN, yychar, yyline, yytext()); }
 ("<=")       { return new Symbol ( sym.t_LESS_EQUAL, yychar, yyline, yytext()); }
 (">")        { return new Symbol ( sym.t_GREATER_THEN, yychar, yyline, yytext()); }
 (">=")       { return new Symbol ( sym.t_GREATER_EQUAL, yychar, yyline, yytext()); }
 ("==")       { return new Symbol ( sym.t_EQUAL, yychar, yyline, yytext()); }
 ("~=")       { return new Symbol ( sym.t_NOT_EQUAL, yychar, yyline, yytext()); }
 ("AND")      { return new Symbol ( sym.t_AND, yychar, yyline, yytext()); }
 ("OR")       { return new Symbol ( sym.t_OR, yychar, yyline, yytext()); }
 ("NOT")      { return new Symbol ( sym.t_NOT, yychar, yyline, yytext()); }
 ("#")        { return new Symbol ( sym.t_HASHTAG, yychar, yyline, yytext()); }
 (" ")        { return new Symbol ( sym.t_BLANK, yychar, yyline, yytext()); }


 {WhiteSpace}       { /* pula, não faz nada */ }   
}

[^]      { throw new Error("Caracter inválido <"+yytext()+">"); }
