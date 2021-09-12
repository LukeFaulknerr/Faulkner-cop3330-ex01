/*
    UCF COP3330 Fall 2021 Assignment 1 Solution
    Copyright 2021 Luke Faulkner
 */

package FaulknerCOP3330;

import java.util.Scanner;


public class ex01 {

    public static void main(String[] args) {
        // Variables / Objects
        Scanner readName = new Scanner(System.in);
        String name;

        // User Prompt + Input
        System.out.print("What is your name?");
        name = readName.nextLine();

        // System Response
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
