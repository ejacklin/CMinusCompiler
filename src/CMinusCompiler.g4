// Define a grammar called Hello
grammar CMinusCompiler;

/*
 * Parser Rules
*/
program             :  declaration_list EOF;
declaration_list    :  declaration (declaration)*;
declaration         :  var_declaration  |  fun_declaration;
var_declaration     :  type_specifier  ID SEMICOLON  |  type_specifier  ID LB NUM RB SEMICOLON;
type_specifier      :  INT | VOID;
fun_declaration     :  type_specifier  ID  LPAREN  params  RPAREN  compound_stmt;
params              :  param_list  |  VOID;
param_list          :  param (COMMA param)*;
param               :  type_specifier  ID  |  type_specifier  ID LB RB;
compound_stmt       :  LCB  local_declarations  statement_list  RCB;
local_declarations  :  (var_declaration)*;
statement_list      :  (statement)*;
statement           :  expression_stmt  |  compound_stmt  |  selection_stmt  |  iteration_stmt  |  return_stmt;
expression_stmt     :  expression  SEMICOLON  |  SEMICOLON;
selection_stmt      :  IF LPAREN  expression  RPAREN  statement  |  IF LPAREN  expression  RPAREN  statement  ELSE  statement;
iteration_stmt      :  WHILE LPAREN  expression  RPAREN  statement;
return_stmt         :  RETURN SEMICOLON  |  RETURN  expression SEMICOLON;
expression          :  var  ASSIGN  expression  |  simple_expression;
var                 :  ID  |  ID LB  expression  RB;
simple_expression   :  additive_expression  relop  additive_expression  |  additive_expression;
relop               :  LTE | LT | GT | GTE | EQ | NOTEQ;
additive_expression :  term  (addop  term)*;
addop               :  ADD | SUB;
term                :  factor  (mulop  factor)*;
mulop               :  MULT | DIV;
factor              :  LPAREN  expression  RPAREN |  var  |  call  |  NUM;
call                :  ID LPAREN  args  RPAREN;
args                :  arg_list  |  ;
arg_list            :  expression (COMMA  expression)*;




/*
 * Lexer Rules
*/

//Keywords
IF: 'if';
ELSE: 'else';
WHILE: 'while';
RETURN: 'return';
INT: 'int';
VOID: 'void';

//Symbols
LB: '[';
RB: ']';
LPAREN: '(';
RPAREN: ')';
SEMICOLON: ';';
COMMA: ',';
LCB: '{';
RCB: '}';
LTE: '<=';
LT: '<';
GT: '>';
GTE:'>=';
EQ: '==';
ASSIGN: '=';
NOTEQ: '!=';
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';

//Comments
LCOMM : '/*';
RCOMM : '*/';
COMMENT : LCOMM .+? RCOMM -> skip;

//REs
NUM: DIGIT DIGIT*;
ID : LETTER LETTER*;             // match lower_case identifiers
fragment DIGIT : [0-9];
fragment LETTER : [A-Za-z];
WS : [ \r\t\n]+->skip; // skip spaces, tabs, newlines
