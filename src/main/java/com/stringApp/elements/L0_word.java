package com.stringApp.elements;

import java.util.List;

public class L0_word implements OneItem {

    private String word;

    public L0_word(String word) {
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

    @Override
    public String toString() {
        return word;
    }
}
