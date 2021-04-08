package com.stringApp.elements;


import java.util.ArrayList;
import java.util.List;

public class OneElement implements ElementMine {


   List <Character> c = new ArrayList<>();

    public OneElement(char c) {
        this.c.clear();
        this.c.add(c);
    }

    public OneElement(List a) {
        this.c = a;
    }



    public void set(char c) {
        this.c.clear();
        this.c.add(c) ;
    }

    @Override
    public void showIt() {

        for (Character ch : c){
            //System.out.println(ch);
        }

        //System.out.print(c.);
    }
    public void showItLikeItMustBe() {
        System.out.print(c.toArray());
    }


    public char toChar( ) {


        if (c.size()==1){
            return 'g';
        }
        else throw new UnsupportedOperationException("nono");

    }
}
