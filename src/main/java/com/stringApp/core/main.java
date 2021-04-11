package com.stringApp.core;


import com.stringApp.elements.*;

public class main {
    public static void main(String[] args) {


        String example = "Java считается одним из самых значительных и широко " +
                "распространенных языков программирования, поскольку ему принадлежит " +
                "исключительная роль в разработке приложений для Интернета. Для того чтобы " +
                "профессионально заниматься разработкой веб-приложений, нужно досконально " +
                "знать Java. Поэтому, если хотите связать свое будущее с программированием " +
                "веб-приложений, вам нужно выбрать подходящий для этого язык и как следует " +
                "изучить его. Кроме того, Java принадлежит ведущая роль в программировании " +
                "смартфонов на платформе Android. Проще говоря, программирование на Java " +
                "составляет основу большей части современной вычислительной техники.";
        String example2 = "просто строчка для примера. two sentences and nine words.";



        TextServise_CREATOR textServise = new TextServise_CREATOR();
        textServise.getStringForSplitting(example);
        textServise.splitText();

        L3_text text = new L3_text(textServise.getText());


        text.print();


        TextServise_EXERCISEmaker exercisEmaker = new TextServise_EXERCISEmaker();
        exercisEmaker.setTextInExercise(text);

        System.out.println();

        exercisEmaker.Num5();




        System.out.println();








       // BigText bigText = new BigText(example);






/*
Composite text = new Composite();


        String stringForExample = "просто строчка для примера. two sentences and nine words.";
        Composite_filler_withBuffers g = new Composite_filler_withBuffers(stringForExample);


        g.makeComposite();


        text = g.getComp1();





        Printer printer = new Printer(text);
        printer.printWord();

      //  printer.printHowItMustBe(text);







*/

    }
}
