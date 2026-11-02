import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        /* Input and Output */

        // Output
        System.out.println("Hello this is my first output of this lession!!!");

        // Values
        int life = 90;

        System.out.println(life);

        String health = "My Health is at: ";

        System.out.println(health + life);

        // Input
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();

        System.out.println("You just pressed the number: " + Number);

        String string = scanner.next();

        System.out.println("You just have typed the String: " + string);


    }
}
