# rpn-calculator
*A Reverse Polish Notation Calculator*

*Design and implement a command line application that takes in an input file of calculations
and returns the answers. The equations are specified in Reverse Polish Notation. The
parameters should be separated by a space.*


*Core logic:*

The infix expression (5 + 3) * 2 would be written in RPN as: 6 3 * 2 - sqrt.

The evaluation would proceed as follows:

Push 6 onto the stack.

Push 3 onto the stack.

Encounter '*', pop 6 and 3, calculate 6 * 3 = 18, and push 18 onto the stack.

Push 2 onto the stack.

Encounter '-', pop 2 and 18, calculate 18 - 2 = 16, and push 16 onto the stack.

Encounter 'sqrt', pop 16, square root for 16 is 4, and push 4 onto the stack.

The final result, 4, is on the stack.

*Build*

mvn clean package

java -jar target/rpn-calculator-1.0.jar rpn.txt

*Output*

1.0 2.0 + = 3.0

3 4 * = 12

6 3 * 2 - sqrt = 4.0

1 + 1 - Not Reverse Polish Notation try backwards

4 2 - 2 - 1000 * = 0.0


