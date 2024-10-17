package Oct.ex_17101993;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the score:");
        int score = sc.nextInt();
        //int score = 85;
        String Result =(score>90)?"A":(score>80)?"B":(score>70)?"C":(score>60)?"D":"F";
        System.out.println("your Grade is:" +Result);
        sc.close();

    }

}
