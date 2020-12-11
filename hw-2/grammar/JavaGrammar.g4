grammar JavaGrammar;

file : (classBody | javaClass)* EOF;

javaClass : classDeclaration '{' Breaks* classBody* '}' Breaks*;

classDeclaration : (modifier Breaks+)* 'class' Breaks+ Name Breaks*;

classBody : (function | functionStatement | javaClass)+;



function : functionDeclaration Breaks* '{'  Breaks* functionBody* '}' Breaks*;

functionDeclaration : (modifier Breaks+)*  functionType Breaks+ Name Breaks* '(' functionParameters* ')';

functionType : 'void' | type;

functionParameters : variableTypeAndName Breaks* (',' Breaks* variableTypeAndName Breaks*)*;

functionBody : (functionStatement+ returnStatement? | returnStatement) Breaks*;

functionStatement : Breaks* (variableDeclaration | ifStatement | functionInvoke | forCycle | whileCycle) Breaks*;


variableDeclaration : variableTypeAndName Breaks* ';';

variableTypeAndName : type Breaks+ Name;

variableName : Name;


ifStatement : 'if' Breaks* '(' Breaks* Name Breaks* ')' thenStatement ('else' elseStatement)?;

thenStatement : Breaks* '{' functionStatement+ '}' Breaks*;

elseStatement : Breaks* '{' functionStatement+ '}' Breaks*;


functionInvoke : Name Breaks* '(' Breaks* functionInvokeParameters ')' Breaks* ';';

functionInvokeParameters : variableName Breaks* (',' Breaks* variableName Breaks*)*;


// for and while
forCycle : forCycleDeclaration cycleBody;

forCycleDeclaration : 'for' Breaks* '(' variableTypeAndName Breaks* ';' Breaks* forLogicStatement Breaks* ';' Breaks* variableName ('++' | '--') Breaks* ')';

whileCycle : whileCycleDeclaration cycleBody;

whileCycleDeclaration : 'while' Breaks* '(' Breaks* whileLogicStatement Breaks* ')';

forLogicStatement : variableName Breaks* equalityOperator Breaks* variableName;

whileLogicStatement : variableName Breaks* equalityOperator Breaks* variableName;

equalityOperator : '<' | '==' | '>' | '<=' | '>=';

cycleBody : Breaks* '{' functionStatement+ '}' Breaks*;


returnStatement : 'return' Breaks+ returnValue Breaks* ';';

returnValue : Name | Number;

// Common attributes
modifier : 'public' | 'private' | 'protected' | 'static' | 'abstract';

type : primitiveType | referenceType;

primitiveType : 'int' | 'long' | 'float' | 'double' | 'boolean' | 'char';

referenceType : 'Object' | 'Array' | 'String' | customType;

customType : Name;

// Keywords

ABSTRACT : 'abstract';
ARRAY : 'Array';
BOOLEAN : 'boolean';
CHAR : 'char';
CLASS : 'class';
DOUBLE : 'double';
FLOAT : 'float';
IF : 'if';
INT : 'int';
LONG : 'long';
OBJECT : 'Object';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
RETURN : 'return';
STATIC : 'static';
STRING : 'String';
VOID : 'void';

// Literals

LCurlyBracket : '{';
RCurlyBracket : '}';
LCircleBracket : '(';
RCircleBracket : ')';
Comma : ',';
Semicolon : ';';
Breaks :  (' ' | '\n' | '\r')+;

Name : Letter LetterOrDigit*;
Number : Digit+;

fragment Letter : [A-Za-z_$];

fragment Digit : [0-9];

fragment LetterOrDigit: Letter | Digit;