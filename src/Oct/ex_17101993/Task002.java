package Oct.ex_17101993;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side1");
        int a = sc.nextInt();
        System.out.println("Enter the side2");
        int b = sc.nextInt();
        System.out.println("Enter the side 3");
        int c = sc.nextInt();
        if(a==b && b==c && c==a)
        {
            System.out.println("Triangle is equilateral");
        } else if (a==b || b==c || c==a) {
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("the triangle is scalene");
        }
    }
}
