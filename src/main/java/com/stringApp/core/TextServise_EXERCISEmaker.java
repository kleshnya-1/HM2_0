package com.stringApp.core;

import com.stringApp.elements.*;

import java.util.ArrayList;
import java.util.List;

public class TextServise_EXERCISEmaker {


    L3_text textInExercise = new L3_text();


    public TextServise_EXERCISEmaker(L3_text textInExercise) {
        this.textInExercise = textInExercise;
    }
    public TextServise_EXERCISEmaker() {

    }

    public L3_text getTextInExercise() {
        return textInExercise;
    }

    public void setTextInExercise(L3_text textInExercise) {
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

        List<L0_word> words = new ArrayList<>();
        textInExercise.getText().forEach(p->{
            p.getParagraph().forEach(sen->{
                sen.getSent().forEach(np_l0_word -> {
                   words.add(np_l0_word);
                });
            });
        });

        for (L0_word word:words){
            System.out.println(word.toString());
        }




    }

    public void getIngo(){

    }}


