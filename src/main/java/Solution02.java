/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sathvik Kuthuru
 */

import java.util.Scanner;

public class Solution02 {
    // ask user for input string
    // get the user input from standard in
    // output the number of characters

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the input string?");
        String input = scan.nextLine();
        System.out.printf("%s has %d characters", input, input.length());
    }
}
