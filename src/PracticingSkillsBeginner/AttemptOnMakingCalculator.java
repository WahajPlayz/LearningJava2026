package PracticingSkillsBeginner;

import java.util.Scanner;

public class AttemptOnMakingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calulator Put any numbers so I can calulate your answer!");
        System.out.println("Please enter the value of your first number show up like: Number you picked, By the order of operation then add to the other number you have chosen.");

        int a = scanner.nextInt();

        System.out.println("Please pick your other number");

        int b = scanner.nextInt();

        System.out.println("Here is all of your sum answer");

        int addtion = a + b;
        System.out.println("Addition: " + addtion);

        int subtraction = a - b;
        System.out.println("Subtraction: " + subtraction);

        int multiplication = a * b;
        System.out.println("Multiplication: " + multiplication);

        double c = a;
        double d = b;

        double division = c / d;
        System.out.println("Division: " + division);

    }
}
