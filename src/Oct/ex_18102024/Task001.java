package Oct.ex_18102024;

import java.util.Scanner;


public class Task001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inputs
        System.out.println("Enter the value of num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2 ");
        int num2 = sc.nextInt();
        //choose operation
        System.out.print("Enter the operation to be performed (1: Add, 2: Subtract, 3: Multiply, 4: Divide, 5: Modulus)?");
        int operation = sc.nextInt();
       switch (operation)
       {
           case 1:
               int Add = num1+num2;
               System.out.println("Addition value is:"+Add);
               break;
           case  2:
               int sub = num1-num2;
               System.out.println("Subtraction value is:" +sub);
               break;
           case 3:
               int mul = num1 * num2;
               System.out.println("Multiplication value is:" +mul);
               break;
           case 4:
               if (num2 != 0){
                   double Div = num1 / num2;
                   System.out.println("Division value is:" + Div);
               }else{
                   System.out.println("Error: Division by zero is not allowed.");
               }
               break;
           case  5:
               double Mod = num1 % num2;
               System.out.println("Modulus value is:" + Mod);
               break;
           default:
               System.out.println("Invalid operation. Please enter a number between 1 and 5.");
               break;
       }

               System.out.println("Execution Completed");
               sc.close();
    }
}
