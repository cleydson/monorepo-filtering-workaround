package com.github.advanced_security.monorepo_sample_project3;

public class Project3 {
    public static void main(String[] args) {
        System.out.println("Hello World, from Project 3");

        for (int i = 0; i <= args.length; i++) { // BAD, should be <, not <=
            System.out.println("Argument " + i + ": " + args[i]);
        }

        String s = "Not a number";
        int n;

        n = Integer.parseInt(s); // BAD: NumberFormatException is not caught.

        System.out.println(n);
    }
}