package com.github.advanced_security.monorepo_sample_project1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, from Project 1");

        // Test Permissions
        for (int i = 0; i <= args.length; i++) { // BAD, should be <, not <=
            System.out.println("Argument " + i + ": " + args[i]);
        }

        // Adding another error for the CodeQL to find
        for (int i = 0; i <= args.length; i++) { // BAD, should be <, not <=
            System.out.println("Argument " + i + ": " + args[i]);
        }

    }
}