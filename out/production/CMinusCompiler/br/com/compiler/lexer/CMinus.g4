grammar CMinus;

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/'-> skip;
OPEN_CHA: '{';
CLOSE_CHA: '}';
OPEN_COL: '[';
CLOSE_COL: ']';
OPEN_PAR: '(';
CLOSE_PAR: ')';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
RETURN: 'return';
RELA: '<=' | '<' | '>' | '>=' | '==' | '!=';
MULT: '*' | '/';
SUM: '+' | '-';
EOL: ';';
COMMA: ',';
EQ: '=';
IDENT: LETTER (DIGIT | LETTER)*;
NUM: [+-]? NUM_INT ('.'NUM_INT) ('E' [+-]? NUM_INT)?;
NUM_INT: DIGIT+;

program: statament_list;
statament_list: statament+;
statament: var_decl | func_decl;
var_decl: type IDENT (OPEN_COL NUM_INT CLOSE_COL)* EOL;
type: 'int' | 'float' | 'char' | 'void' | 'struct' IDENT OPEN_CHA attr_decl CLOSE_CHA;
attr_decl: var_decl+;
func_decl: type IDENT OPEN_PAR params? CLOSE_PAR comp_decl;
params: param (COMMA param)*;
param: type IDENT ('[]')*;
comp_decl: OPEN_CHA var_decl* command* CLOSE_CHA;
command: exp_decl | comp_decl | select_decl | inter_decl | return_decl;
exp_decl: exp* EOL;
select_decl: IF OPEN_PAR exp CLOSE_PAR command (ELSE command)?;
inter_decl: WHILE OPEN_PAR exp CLOSE_PAR command;
return_decl: RETURN (exp)? EOL;
exp: var EQ exp | simple_exp;
var: IDENT (OPEN_COL exp CLOSE_COL)*;
simple_exp: exp_sum (RELA exp_sum)?;
exp_sum: term (SUM term)*;
term: factor (MULT factor)*;
factor: OPEN_PAR exp CLOSE_PAR | var | active | NUM | NUM_INT;
active: IDENT OPEN_PAR args CLOSE_PAR;
args: args_list;
args_list: exp (',' exp)*;




