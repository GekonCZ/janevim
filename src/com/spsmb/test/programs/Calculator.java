package com.spsmb.test.programs;

import java.util.Scanner;

public class Calculator extends Program implements ProgramAction{

    public Calculator() {
        super("Calculator");
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej vstup");
        String vstup = scanner.nextLine();
        System.out.println("Zadej prvni cislo");
        double a = scanner.nextDouble();
        System.out.println("Zadej druhy cislo");
        double b = scanner.nextDouble();
        switch (vstup){
            case "s":
                System.out.println(a+b);
                break;
            case "o":
                System.out.println(a-b);
                break;
            case "n":
                System.out.println(a*b);
                break;
            case "d":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Tuhle operaci neznam");
                break;
        }
        System.exit(0);
    }
}
