package Oct.ex_17101993;

import java.util.Scanner;

public class Lab005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Side1");
        int side1 = scan.nextInt();

        System.out.println("Enter Side2");
        int side2 = scan.nextInt();

        System.out.println("Enter Side3");
        int side3 = scan.nextInt();



        // Check for equilateral triangle
        if(side1==side2 && side2==side3 ){
            System.out.println("Equilateral");

            // Check for isosceles triangle
        }else if(side1==side2 || side1==side3 || side2==side3){
            System.out.println("isosceles");
        }else {

            System.out.println("scalene");
        }

    }
}
