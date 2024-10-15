package Oct.ex_15102024;

public class Lab5 {
    public static void main(String[] args) {
        //Finding the Largest of Three Numbers a,b,c
        // Variable Declaration
        int a = 60, b = 25, c = 15, max;
        // max =(a<b)?"a is larger":(b>c)?"b is lager":(c>a)?"c is larger":"no";
        // Maximum among a, b, c
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        // Print the largest number
        System.out.println("Maximum number among " + a
                + ", " + b + " and " + c + " is "
                + max);




    }
}
