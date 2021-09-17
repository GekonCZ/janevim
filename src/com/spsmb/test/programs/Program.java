package com.spsmb.test.programs;

public abstract class Program implements ProgramAction{

    private String name;

    public Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
