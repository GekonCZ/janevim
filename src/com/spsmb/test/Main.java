package com.spsmb.test;

import com.spsmb.test.programs.Calculator;
import com.spsmb.test.programs.Letters;

public class Main {

    private static Calculator calculator;
    private static Letters letters;

    public static void main(String[] args) {
        calculator = new Calculator();
        letters = new Letters();
        switch (args[0])
        {
            case "calculator":
                calculator.run();
                break;
            case "letters":
                letters.run();
                break;
        }
    }
}
