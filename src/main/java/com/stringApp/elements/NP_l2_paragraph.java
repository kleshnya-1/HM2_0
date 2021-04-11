package com.stringApp.elements;

import java.util.List;

public class NP_l2_paragraph implements OneItem {


    List<NP_l1_sent> paragraph;

    public NP_l2_paragraph(List paragraph) {
        this.paragraph = paragraph;
    }
    public NP_l2_paragraph() {

    }

    @Override
    public int position() {
        return 2;
    }

    public void print (){
        for (NP_l1_sent l1: paragraph){
            l1.print();
        }
    }



    public List getParagraph() {
        return paragraph;
    }

    public void setParagraph(List paragraph) {
        this.paragraph = paragraph;
    }
}
