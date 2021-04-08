


package com.stringApp.elements;


        import java.util.ArrayList;
        import java.util.List;

public class OneElementR implements ElementMine {


    char c;

    public OneElementR(char c) {
        this.c = c;

    }





    public void set(char c) {
        this.c=c;
    }

    @Override
    public void showIt() {
        System.out.print(c);
    }

    public char toChar() {
        return c;
    }
}
