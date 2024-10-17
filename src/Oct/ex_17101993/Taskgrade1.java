package Oct.ex_17101993;

import java.util.Scanner;

public class Taskgrade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Score:");
        int score = sc.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("Your grade is A");
        } else if (score<=89 && score>=80) {
            System.out.println("Your grade is B");
        } else if (score<=79 && score>=70) {
            System.out.println("Your grade is C");
        } else if (score<=69 && score>=60) {
            System.out.println("your  grade is D");
        }
        else {
            System.out.println("You are Fail");
        }
        sc.close();
    }
}
