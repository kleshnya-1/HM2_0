package com.stringApp.core;

import com.stringApp.elements.NP_L0_word;
import com.stringApp.elements.NP_L3_text;
import com.stringApp.elements.NP_l1_sent;
import com.stringApp.elements.NP_l2_paragraph;

import java.util.ArrayList;
import java.util.List;

public class TextServise_EXERCISEmaker {

    NP_L3_text textInExercise = new NP_L3_text();


    public TextServise_EXERCISEmaker(NP_L3_text textInExercise) {
        this.textInExercise = textInExercise;
    }
    public TextServise_EXERCISEmaker() {

    }

    public NP_L3_text getTextInExercise() {
        return textInExercise;
    }

    public void setTextInExercise(NP_L3_text textInExercise) {
        this.textInExercise = textInExercise;
    }


    public void Num5(){
        /*6.	Напечатать слова текста в алфавитном порядке по первой
        букве. Слова, начинающиеся с новой буквы, печатать с красной строки*/

        if (textInExercise.position()==1){
            System.out.println("jj");
        }

        for (Object o:textInExercise.getText())
        {

        }
        List<String> s = textInExercise.getText().stream().map();








    }

    public void getIngo(){

    }

}
