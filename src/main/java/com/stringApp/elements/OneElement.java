package com.stringApp.elements;


import java.util.ArrayList;
import java.util.List;

public class OneElement implements ElementMine {


   char c;

    public OneElement(char c) {

        this.c=(c);
    }




   /* public void set(char c) {
        this.c.clear();
        this.c.add(new OneElement(c)) ;
    }*/

    @Override
    public void showIt() {

        System.out.print(c);

        }

    @Override
    public char toChar() {
        return c;
    }


}
