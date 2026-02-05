package labexercises;

import java.util.Scanner;

public class CircleCalculator {

    public static void main(String [] args) {

        Scanner keyb= new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = keyb.nextDouble();

        double area= Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + String.format("%.2f", area) + " square units.");

        keyb.close();
    }
}
