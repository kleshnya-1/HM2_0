package com.stringApp.elements;

import java.util.List;

public class L2_paragraph implements OneItem {


    List<L1_sent> paragraph;

    public L2_paragraph(List paragraph) {
        this.paragraph = paragraph;
    }
    public L2_paragraph() {

    }

    @Override
    public int position() {
        return 2;
    }

    public void print (){
        for (L1_sent l1: paragraph){
            l1.print();
        }
    }



    public List<L1_sent> getParagraph() {
        return paragraph;
    }

    public void setParagraph(List paragraph) {
        this.paragraph = paragraph;
    }
}
