package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("OddorEven");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 == 0){
            System.out.println("Its an Even number");
        }
else    {
            System.out.println("Odd number");
        }
    }
}
