package PracticingSkillsBeginner;

import java.util.Scanner;

public class RatingSystem {
    public static void main(String[] args){
        System.out.println("Hello Sir, What you want to rate out of your day?");
        Scanner scanner = new Scanner(System.in);

        String WhatYouWantToRate = scanner.next();

        System.out.println("You have chosen " + WhatYouWantToRate + "Out of your day to rate Out of 10 what you rate it?");

        int Rating = scanner.nextInt();

        System.out.println("You have rated " + WhatYouWantToRate + "Out of " + Rating + "/10");
    }
}
