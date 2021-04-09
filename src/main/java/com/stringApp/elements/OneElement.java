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

        //for (OneElement ch : c){
            //System.out.print(ch);
        }

      /*  //System.out.print(c.);
    }
   // public void showItLikeItMustBe() {
       // System.out.print(c.toArray());
    }


    public char toChar( ) {


        if (c.size()==1){
            return 'g';
        }
        else throw new UnsupportedOperationException("nono");

    }*/
}
