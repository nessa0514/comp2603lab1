package comp2603lab;

import java.util.Scanner;

public class InputDemo {

    public static void main(String [] args) {

        Scanner keyb= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= keyb.nextLine();

        System.out.println("Your name is "+name);
    }
}
