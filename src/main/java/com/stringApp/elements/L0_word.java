package com.stringApp.elements;

import java.util.List;

public class L0_word implements OneItem, Comparable<L0_word> {

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


    @Override
    public int compareTo(L0_word l0_word) {
        if (this.getWord().charAt(0) < l0_word.getWord().charAt(0)) return -1;
        if (this.getWord().charAt(0) >= l0_word.getWord().charAt(0)) return 1;
        return 0;
    }
}
