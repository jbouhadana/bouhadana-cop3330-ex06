/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String inputAge = in.nextLine();

        int age = Integer.parseInt(inputAge);

        System.out.print("At what age would you like to retire? ");
        String inputGoal = in.nextLine();

        int goal = Integer.parseInt(inputGoal);
        int remaining = goal - age;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int goalYear = currentYear + age;

        String output = "You have " + remaining + " left unit you can retire.\n" + "It's " + currentYear + " so you can retire in " + goalYear +  ".";

        System.out.print(output);
    }
}
