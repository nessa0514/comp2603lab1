package labexercises;

import java.util.Scanner;

public class SimpleChat {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, what is your name?");
        String name = input.nextLine();

        System.out.println("Nice to meet you, " + name + "!");

        while (true) {
            System.out.println("What would you like to talk about?");
            String topic = input.nextLine();

            if (topic.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break; // Exit the loop
            }

            System.out.println("Interesting! Tell me more about " + topic);
        }

        input.close();
    }
}

