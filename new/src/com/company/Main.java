package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String question = "How do you create an Incident in serviceNow?";
        String choiceOne = "Click";
        String choiceTwo = "Click on tickets and create new";
        String choiceThree = "Click on tickets and create new tickets";

        System.out.println(question);
        System.out.println(choiceOne+choiceTwo+choiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (choiceOne.equals(input)){
            System.out.println("Correct Answer");}
        else {
            System.out.println("Wrong Answer, the correct answer is " + choiceOne);

        }
    }}


