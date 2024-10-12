package Oct.ex_11102024;

public class Operators {
    public static void main(String[] args) {
        // create variables
        int a=7; int b=11;
        System.out.println("***********Arithmetic Operators*************");
        System.out.println("a-b="+(a-b));//// subtraction operator
        System.out.println("a*b="+(a*b));//multiplication operator
        System.out.println("a/b="+(a/b));//division operator
        System.out.println("a%b="+(a%b));//modulo operator
        System.out.println("*********Java Relational Operators********");
 //Relational operators are used to check the relationship between two operands.
        //// check if a is less than b
        //a < b;
        //value of a and b
        System.out.println("a is +"+a + "and b is"+b);
        // == operator
        System.out.println(a==b);//false
        //Not Equal To
        System.out.println(a!=b);
        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true
        System.out.println("********* Java Logical Operators********");
        //Logical operators are used to check whether an expression is true or false.
        // They are used in decision making.
        System.out.println("******* (&& (Logical AND)) *************");////true only if both expression1 and expression2 are true
        System.out.println((5 > 3) && ( 8 >5));//true
        System.out.println((5 > 3) && (8 < 5));//false
        System.out.println("******* ( || (operator OR) *************");//true if either expression1 or expression2 is true
        System.out.println((5 > 3) || ( 8 > 5));//true
        System.out.println((5 > 3) || (8 < 5));//true
        System.out.println((5 < 3) || (8 < 5));  //false
        System.out.println("******* ( ! (operator NOR) *************");//true if expression is false and vice versa
        System.out.println(!(5 == 3));//true
        System.out.println(!(5 > 3));//false
        System.out.println("******* (Java Unary Operators ) *************");//Unary operators are used with only one operand. For example, ++ is a unary operator that increases the value of a variable by 1. That is, ++5 will return 6.
        System.out.println("Increment and Decrement Operators");
        // declare variable
        int c=12 , d=12;
        int result1,result2;
        // original value
        System.out.println("original value of c :" +c);
        // increment operator
        result1= ++c;
        System.out.println("After increment: " +result1);
        System.out.println("Value of d: "  +d);
        // decrement operator
        result2= --d;
        System.out.println("After decrement: " + result2);

        System.out.println("******* (Java Ternary Operator ) *************");
        //variable = Expression ? expression1 : expression2
        //f the Expression is true, expression1 is assigned to the variable.
        //If the Expression is false, expression2 is assigned to the variable.
        int februaryDays = 29;
        String result4;
         //ternary operator
        //result4 =(februaryDays == 28)? "Not a leap year"  :"Leap year";
       // System.out.println(result4);
        result4 =(februaryDays == 29)? "Not a leap year"  :"Leap year";
        System.out.println(result4);
    }


}
