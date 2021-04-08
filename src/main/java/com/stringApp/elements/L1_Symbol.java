package com.stringApp.elements;

public class L1_Symbol implements ElementMine{

    char c;

    public L1_Symbol(char c) {
        this.c = c;
    }



    public void set(char c) {
        this.c = c;
    }



    @Override
    public void showIt() {
        System.out.print(c);
    }




}
