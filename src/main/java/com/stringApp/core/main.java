package com.stringApp.core;


import com.stringApp.elements.*;

public class main {
    public static void main(String[] args) {


Composite text = new Composite();


        String stringForExample = "просто строчка для примера. two sentences and nine words.";
        Composite_filler_withBuffers g = new Composite_filler_withBuffers(stringForExample);


        g.makeComposite();


        text = g.getComp1();





        Printer printer = new Printer(text);
        printer.printWord();

      //  printer.printHowItMustBe(text);









    }
}
