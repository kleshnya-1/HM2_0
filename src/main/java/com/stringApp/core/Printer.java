package com.stringApp.core;

import com.stringApp.elements.Composite;
import com.stringApp.elements.ElementMine;

import java.util.ArrayList;
import java.util.List;

public class Printer {


    Composite compositeInPrinter = new Composite();


    public Printer(Composite compositeInPrinter) {
        this.compositeInPrinter = compositeInPrinter;
    }
    public Printer() {      }



    public void printWord(){
       ElementMine text = compositeInPrinter.getChild().get(0);

       text.showIt();






    }

    public void printHowItMustBe(Composite compositeInPrinterMethod){
        //compositeInPrinterMethod.showIt();

        int levelCounter = 0;
//1 - начало слова
//2 - начало предложения
//3 - начало текста


        for (ElementMine e : compositeInPrinterMethod.getChild()) {

            if(e.toChar() == 0){

                levelCounter++;
            }

            e.showIt();






    }



}
}


 /*   int levelCounter = 0;
//1 - начало слова
//2 - начало предложения
//3 - начало текста
        for (ElementMine e: child)
                {

           *//* if (e.toChar()==0){
                levelCounter++;
            }*//*

           *//* if (levelCounter == 1){
                System.out.print(" ");
            }
            if (levelCounter == 2){
                System.out.print(".");
            }*//*




                //System.out.print("*"+levelCounter+"*");



                e.showIt();
                //  System.out.print("_");



                //levelCounter=0;
                }*/