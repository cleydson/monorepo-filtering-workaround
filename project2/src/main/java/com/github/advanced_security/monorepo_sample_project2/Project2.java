package com.github.advanced_security.monorepo_sample_project2;

public class Project2 {
    public static void main(String[] args) {
        System.out.println("Hello World, from Project 2");
        // Adding test comment
        for (int i = 0; i <= args.length; i++) { // BAD, should be <, not <=
            System.out.println("Argument " + i + ": " + args[i]);
        }

        String s = "Not a number";
        int n;
        n = Integer.parseInt(s); // BAD: NumberFormatException is not caught.
   
    }
}
