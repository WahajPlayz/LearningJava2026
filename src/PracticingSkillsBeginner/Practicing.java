package PracticingSkillsBeginner;

import java.util.Scanner;

public class Practicing {
    public static void main(String[] args){
        System.out.println("How is your day please rate your day out of 1 to 10");

        Scanner scanner = new Scanner(System.in);

        int HowGoodDayRate = scanner.nextInt();

        System.out.println("You have rated your day out of " + HowGoodDayRate + "/10");

        System.out.println("What have you done today?");

        String WhatHaveYouDone = scanner.nextLine();

        System.out.println("You have done: " + WhatHaveYouDone);
    }
}
