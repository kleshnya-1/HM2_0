package com.stringApp.core;

import com.stringApp.elements.*;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

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


    public void Num6() {
        /*6.	Напечатать слова текста в алфавитном порядке по первой
        букве. Слова, начинающиеся с новой буквы, печатать с красной строки*/

        if (textInExercise.position() == 1) {
            System.out.println("jj");
        }

        for (Object o : textInExercise.getText()) {

        }

        List<L0_word> words = new ArrayList<>();
        textInExercise.getText().forEach(p -> {
            p.getParagraph().forEach(sen -> {
                sen.getSent().forEach(np_l0_word -> {
                    words.add(np_l0_word);
                });
            });
        });

        SortedSet<L0_word> set5thEx = new TreeSet<>();
        List<Character> listOfKnownLetters = new ArrayList<>();

        for (L0_word w : words) {
            set5thEx.add(w);
        }
        for (L0_word w : set5thEx) {
            if (listOfKnownLetters.contains(w.getWord().charAt(0)) == false) {
                System.out.print("  ");
            }

            w.print();
            listOfKnownLetters.add(w.getWord().charAt(0));


            System.out.println();
        }


    }


    public void Num3(){
/*3.	Найти такое слово в первом предложении,
которого нет ни в одном из остальных предложений.*/

        List<String> words1sent = new ArrayList<>();
        List<String> wordsRESTsent0 = new ArrayList<>();
        List<String> wordsRESTsent = new ArrayList<>();
        textInExercise.getText().get(0).getParagraph().get(0).getSent().forEach(s ->{
           words1sent.add( s.getWord());
        });

        textInExercise.getText().forEach(p -> {
            p.getParagraph().forEach(sen -> {
                sen.getSent().forEach(l0_word -> {
                    wordsRESTsent0.add( l0_word.getWord())
                    ;
                });
            });
        });

        wordsRESTsent = wordsRESTsent0.subList(words1sent.size(),wordsRESTsent0.size());

        for (String s1:words1sent){
            if (wordsRESTsent.contains(s1)==false){
               System.out.println(s1);
            }
        }

    }



    public void getIngo() {

    }
}


