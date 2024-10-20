package Oct.ex_18102024;

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unit Convertor:");
        System.out.println("kilometer to miles");
        System.out.println("Miles to kilometer");
        System.out.println("celsius to Fahrenheit");
        System.out.println("Fahrenheit to celsius");
        System.out.println("Enter your choice (1-4):");
        int choice = sc.nextInt();
        switch (choice){
            case 1: //kilometers to miles
                System.out.println("Enter distance in kilometer:");
                double kilometers = sc.nextDouble();
                double miles = kilometers * 0.62137119;
                System.out.println(kilometers+"kilometers is equal to"+miles +"miles" );
                break;
            case  2:// miles to kilometers
                System.out.println("Enter distance in  miles");
                miles = sc.nextDouble();
                kilometers = miles/0.62137119;
                System.out.println(miles+"Miles is equal to" +kilometers+"kilometers");
                break;
            case 3://celsius to Fahrenheit
                System.out.println("Enter temperature in celsius");
                double celsius = sc.nextDouble();
                double Fahrenheit =(celsius*9/5)+32;
                System.out.println(celsius+"celsius is equal to" +Fahrenheit+"Fahrenheit");
                break;
            case 4://Fahrenheit to celsius
                System.out.println("Enter temperature in  Fahrenheit ");
                Fahrenheit = sc.nextDouble();
                celsius =(Fahrenheit-32)  *5/9;
                System.out.println(Fahrenheit+"Fahrenheit is equal to"+celsius+"Celsius");
                break;
            default:
                System.out.println("invalid choice please select between 1 and 4");
                break;

        }
        sc.close();
    }
}
