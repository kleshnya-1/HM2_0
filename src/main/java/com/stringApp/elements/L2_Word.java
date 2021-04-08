package com.stringApp.elements;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class L2_Word implements ElementMine {

    private List<L1_Symbol> word = new ArrayList<>();

    public L2_Word() {

    }


    public void setArray(ArrayList<L1_Symbol> a){
        this.word = a;
    }



    public L2_Word(L1_Symbol... a) {
        word = Arrays.asList(a);
    }


    public void add(L1_Symbol a){
        word.add(a);
    }


    public void createWord(L1_Symbol... a){
        word = Arrays.asList(a);
    }


    @Override
    public void showIt() {
        for (L1_Symbol symbol:word ){

            symbol.showIt();


        }
    }
}

