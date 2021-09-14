/*
 *   UCF COP 3330 Fall 2021 Assignment 1 Solution
 *   Copyright 2021 Christina Mutz
 *
 *   Exercise 4 solution
 */
import java.util.Scanner;


public class Ex4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a noun: ");     //ask the user for a noun
        var noun = sc.nextLine();          //save their input

        System.out.println("Enter a verb: ");      //repeat above with verb
        var verb = sc.nextLine();

        System.out.println("Enter an adjective: ");   //repeating above
        var adjective =sc.nextLine();

        System.out.println("Enter an adverb: ");     //repeating above
        var adverb = sc.nextLine();



        //Print out the adlib statement with the user's input
        System.out.println("Do you " + verb + " your " + adjective + noun + adverb + "?" +" That's amazing!");


    }

}
