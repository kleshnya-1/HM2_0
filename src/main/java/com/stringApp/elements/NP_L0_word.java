package com.stringApp.elements;

import java.util.List;

public class NP_L0_word implements OneItem {

    private String word;

    public NP_L0_word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    public void print() {


        System.out.print(word);
    }



    @Override
    public int position() {
        return 0;
    }
}
