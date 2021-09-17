package com.spsmb.test.programs;

import java.util.Scanner;

public class Letters extends Program implements  ProgramAction{

    public Letters() {
        super("Letters");
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej vetu");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int sum = 0;
        for (char c : chars)
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                sum++;
            }
        }
        System.out.println("Pocet: " + sum);
    }
}
