package Oct.ex_16102024;

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your salary:");
        float salary = scanner.nextFloat();
        scanner.close();
        System.out.println("Enter your name" + name);
        System.out.println("Enter your name" + age);
        System.out.println("Enter your name" + salary);
    }
}
