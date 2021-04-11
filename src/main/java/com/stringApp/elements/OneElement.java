package com.stringApp.elements;


import java.util.ArrayList;
import java.util.List;

public class OneElement implements ElementMine {


    char c;

    public OneElement(char c) {

        this.c = (c);
    }


    @Override
    public void showIt() {

        System.out.print(c);

    }



    @Override
    public char toChar() {
        return c;
    }


}
