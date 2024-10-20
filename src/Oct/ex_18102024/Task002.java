package Oct.ex_18102024;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Month(1 - 12) needed");
        int month = sc.nextInt();
        switch (month)
        {
            default:
                System.out.println("Error: Not sure Which month requested");
                break;
            case  1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        System.out.println("Program terminated");
        sc.close();
    }
}
