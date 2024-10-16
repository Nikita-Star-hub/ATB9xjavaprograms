package Oct.ex_16102024;

import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        int maxvalue = (a>b ?a:b);
        System.out.println( "Maximum number is:" +maxvalue);
        scanner.close();

    }
}
