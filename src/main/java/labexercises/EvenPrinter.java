package labexercises;

import java.util.Scanner;

public class EvenPrinter {

    public static void main(String [] args) {

        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter a positive integer n: ");
        int positiveInt = keyb.nextInt();

        System.out.println("Even numbers: ");

        for (int i=2; i<=positiveInt; i=i+2) {
                System.out.print(i + " ");

        }

    }
}
