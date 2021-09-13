/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a noun:");
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();

        System.out.println("Enter a verb:");
        Scanner input2 = new Scanner(System.in);
        String verb = input2.nextLine();

        System.out.println("Enter an adjective:");
        Scanner input3 = new Scanner(System.in);
        String adj = input3.nextLine();

        System.out.println("Enter an adverb:");
        Scanner input4 = new Scanner(System.in);
        String adverb = input4.nextLine();

       System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adverb);
    }
}
