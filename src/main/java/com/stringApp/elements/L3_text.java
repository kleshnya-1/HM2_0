package com.stringApp.elements;

import java.util.List;

public class L3_text implements  OneItem{

    private  List<L2_paragraph> text;
    private  String originalText;


    public L3_text(List text) {
        this.text = text;
    }

    public L3_text(L3_text text) {
        this.text = text.getText();
        this.originalText=text.getOriginal();
    }
    public L3_text( ) {

    }


    public List<L2_paragraph> getText() {
        return text;

    }

    public void setText(List text) {
        this.text = text;
    }

    public void addParagraph(L2_paragraph p){
        text.add(p);
    }


    @Override
    public int position() {
        return 3;
    }

    public void print(){
        for (L2_paragraph l2:text){
            l2.print();
        }



    }

    public void setOriginal(String original) {
        this.originalText = original;
    }

    public String getOriginal() {
        return originalText;
    }public void printOriginal() {
        System.out.println(originalText) ;
    }

}
