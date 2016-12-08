package yaLUAc;
import static yaLUAc.Tokens.*; 

//secao do usuario, nao coloquei nada
%%

//nome da classe
%class Lexer
//formato do scanner
%unicode
//ativa contagem de linhas
%line
//ativa contaagem de colunas
%column
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

 ";"   { lexema = yytext(); return t_SEMICOLON; }
 "="   { lexema = yytext(); return t_ATTRIBUTION; }
 ("END")   { lexema = yytext(); return t_END; }
 ("DO")   { lexema = yytext(); return t_DO; }
 ("WHILE")   { lexema = yytext(); return t_WHILE; }
 ("REPEAT")   { lexema = yytext(); return t_REPEAT; }
 ("UNTIL")   { lexema = yytext(); return t_UNTIL; }
 ("IF")   { lexema = yytext(); return t_IF; }
 ("THEN")   { lexema = yytext(); return t_THEN; }
 ("ELSEIF")   { lexema = yytext(); return t_ELSEIF; }
 ("FOR")   { lexema = yytext(); return t_FOR; }
 ("IN")   { lexema = yytext(); return t_IN; }
 ("FUNCTION")   { lexema = yytext(); return t_FUNCTION; }
 ("LOCAL")   { lexema = yytext(); return t_LOCAL; }
 ("RETURN")   { lexema = yytext(); return t_RETURN; }
 ("BREAK")   { lexema = yytext(); return t_BREAK; }
 "."   { lexema = yytext(); return t_DOT; }
 ":"   { lexema = yytext(); return t_COLON; }
 ","   { lexema = yytext(); return t_COMMA; }
 "["   { lexema = yytext(); return t_BRACKET_OPEN; }
 "]"   { lexema = yytext(); return t_BRACKET_CLOSE; }
 "NIL" { lexema = yytext(); return t_NIL; }
 "TRUE" { lexema = yytext(); return t_TRUE; }
 "FALSE" { lexema = yytext(); return t_FALSE }
 {number} { lexema = yytext(); return t_NUMBER }
 {string} { lexema = yytext(); return t_STRING }
 {name} { lexema = yytext(); return t_NAME }
 "(" { lexema = yytext(); return t_PARENTHESE_OPEN }
 ")" { lexema = yytext(); return t_PARENTHESE_CLOSE }
 "[" { lexema = yytext(); return t_BRACERS_OPEN }
 "]" { lexema = yytext(); return t_BRACERS_CLOSE }
 "..." { lexema = yytext(); return t_DOTDOTDOT }
 ("+") { lexema = yytext(); return t_PLUS }
 ("-") { lexema = yytext(); return t_MINUS }
 ("*") { lexema = yytext(); return t_TIMES }
 ("/") { lexema = yytext(); return t_DEVIDED }
 ("^") { lexema = yytext(); return t_EXP }
 ("%") { lexema = yytext(); return t_PERCENT }
 ("..") { lexema = yytext(); return t_DOTDOT }
 ("<") { lexema = yytext(); return t_LESS_THEN }
 ("<=") { lexema = yytext(); return t_LESS_EQUAL }
 (">") { lexema = yytext(); return t_GREATER_THEN }
 (">=") { lexema = yytext(); return t_GREATER_EQUAL }
 ("==") { lexema = yytext(); return t_EQUAL }
 ("~=") { lexema = yytext(); return t_NOT_EQUAL }
 ("AND") { lexema = yytext(); return t_AND }
 ("OR") { lexema = yytext(); return t_OR }
 ("NOT") { lexema = yytext(); return t_NOT }
 ("#") { lexema = yytext(); return t_HASHTAG }

 {WhiteSpace}       { /* pula, não faz nada */ }   
}

[^]      { throw new Error("Caracter inválido <"+yytext()+">"); }
