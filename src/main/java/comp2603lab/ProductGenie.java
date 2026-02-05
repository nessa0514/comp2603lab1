//Write a class in Java that will ask the user for 6 numbers. If the product of those 6 numbers are even then return "yOu WiN", else if it is odd then return "Loser" and run the game again until the user gets an even product.

package comp2603lab;

import java.util.Scanner;

public class ProductGenie {

    public static void main(String[] args) {

        Scanner keyb= new Scanner(System.in);
        int product=1;
        boolean isEven= false;

        while (!isEven) {
            System.out.println("Enter 6 numbers: ");
            for (int i = 0; i < 6; i++) {
                int num = keyb.nextInt();
                product = product * num;
            }

            if (product % 2 == 0) {
                System.out.println("YoU wInNeR");
                isEven = true;
            } else {
                System.out.println("Loser");
            }
        }
    }
}
