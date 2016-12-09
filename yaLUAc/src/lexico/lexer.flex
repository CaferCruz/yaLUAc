package lexico;
import static lexico.Tokens.*; 

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
//Para retornar 0 tipo Tokens criados.
%type Tokens
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

 ";"          { return t_SEMICOLON; }
 "="          { return t_ATTRIBUTION; }
 ("END")      { return t_END; }
 ("DO")       { return t_DO; }
 ("WHILE")    { return t_WHILE; }
 ("REPEAT")   { return t_REPEAT; }
 ("UNTIL")    { return t_UNTIL; }
 ("IF")       { return t_IF; }
 ("THEN")     { return t_THEN; }
 ("ELSEIF")   { return t_ELSEIF; }
 ("FOR")      { return t_FOR; }
 ("IN")       { return t_IN; }
 ("FUNCTION") { return t_FUNCTION; }
 ("LOCAL")    { return t_LOCAL; }
 ("RETURN")   { return t_RETURN; }
 ("BREAK")    { return t_BREAK; }
 "."          { return t_DOT; }
 ":"          { return t_COLON; }
 ","          { return t_COMMA; }
 "["          { return t_BRACKET_OPEN; }
 "]"          { return t_BRACKET_CLOSE; }
 "NIL"        { return t_NIL; }
 "TRUE"       { return t_TRUE; }
 "FALSE"      { return t_FALSE; }
 {number}     { return t_NUMBER; }
 {string}     { return t_STRING; }
 {name}       { return t_NAME; }
 "("          { return t_PARENTHESE_OPEN; }
 ")"          { return t_PARENTHESE_CLOSE; }
 "["          { return t_BRACERS_OPEN; }
 "]"          { return t_BRACERS_CLOSE; }
 "..."        { return t_DOTDOTDOT; }
 ("+")        { return t_PLUS; }
 ("-")        { return t_MINUS; }
 ("*")        { return t_TIMES; }
 ("/")        { return t_DEVIDED; }
 ("^")        { return t_EXP; }
 ("%")        { return t_PERCENT; }
 ("..")       { return t_DOTDOT; }
 ("<")        { return t_LESS_THEN; }
 ("<=")       { return t_LESS_EQUAL; }
 (">")        { return t_GREATER_THEN; }
 (">=")       { return t_GREATER_EQUAL; }
 ("==")       { return t_EQUAL; }
 ("~=")       { return t_NOT_EQUAL; }
 ("AND")      { return t_AND; }
 ("OR")       { return t_OR; }
 ("NOT")      { return t_NOT; }
 ("#")        { return t_HASHTAG; }


 {WhiteSpace}       { /* pula, não faz nada */ }   
}

[^]      { throw new Error("Caracter inválido <"+yytext()+">"); }
