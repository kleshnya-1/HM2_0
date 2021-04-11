package com.stringApp.elements;

import java.util.List;

public class NP_L3_text implements  OneItem{

    List<NP_l2_paragraph> text;


    public NP_L3_text(List text) {
        this.text = text;
    }

    public NP_L3_text(NP_L3_text text) {
        this.text = text.getText();
    }
    public NP_L3_text( ) {

    }


    public List getText() {
        return text;

    }

    public void setText(List text) {
        this.text = text;
    }

    public void addParagraph(NP_l2_paragraph p){
        text.add(p);
    }


    @Override
    public int position() {
        return 3;
    }

    public void print(){
        for (NP_l2_paragraph l2:text){
            l2.print();
        }



    }
}
