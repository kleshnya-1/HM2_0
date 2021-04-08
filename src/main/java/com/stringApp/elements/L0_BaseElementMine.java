package com.stringApp.elements;

public class L0_BaseElementMine implements ElementMine {

    char c;

    public L0_BaseElementMine(char c) {
        this.c = c;
    }


    @Override
    public void showIt() {
        System.out.print(c);
    }
}
