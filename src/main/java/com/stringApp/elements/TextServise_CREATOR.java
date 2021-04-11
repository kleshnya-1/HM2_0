package com.stringApp.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextServise_CREATOR implements OneItem {

    private L3_text bigText = new L3_text();
    private List<L2_paragraph> paragraphs = new ArrayList<>();
    private List<L1_sent> sents = new ArrayList<>();
    private List<L0_word> words = new ArrayList<>();


    private List<L2_paragraph> Buffer_paragraphs = new ArrayList<>();
    private List<L1_sent> Buffer_sents = new ArrayList<>();
    private List<L0_word> Buffer_words = new ArrayList<>();
    private List<L0_word> Buffer_words2 = new ArrayList<>();


    private String originalText = " ";
    private String stringForSplittting;





   /* public BigText(String example) {
    }*/


    public void getStringForSplitting(String s) {
        this.originalText = s;
        this.stringForSplittting = new String(originalText);
    }

    List<String> stringList;


    public void splitText() {
        stringList = Arrays.asList(stringForSplittting.split(" "));
        int counter = 0;
        for (String word : stringList) {


            if (word.endsWith(",")) {
                Buffer_words.add(new L0_word(word.substring(0, word.length() - 1)));
                counter++;
                Buffer_words2 = new ArrayList<>
                        (Buffer_words.subList(Buffer_words.size() - counter, Buffer_words.size()));


            } else if (word.endsWith(".")) {
                Buffer_words.add(new L0_word(word.substring(0, word.length() - 1)));
                counter++;
                Buffer_words2 = new ArrayList<>
                        (Buffer_words.subList(Buffer_words.size() - counter, Buffer_words.size()));
                Buffer_sents.add(new L1_sent(Buffer_words2));
                counter = 0;

            } else {
                Buffer_words.add(new L0_word(word.substring(0, word.length())));
                counter++;
                Buffer_words2 = new ArrayList<>
                        (Buffer_words.subList(Buffer_words.size() - counter, Buffer_words.size()));

            }


        }
        Buffer_paragraphs.add(new L2_paragraph(Buffer_sents));
        bigText.setText(Buffer_paragraphs);


    }

    @Override
    public int position() {
        return 5;
    }

    public void print() {
        bigText.print();
        //System.out.println(bigText);
    }

    /*public void splitToSents(){

        sents.add(new )






    }*/
    public void pringOriginal() {

        System.out.println(originalText);
    }

    public void splitToWords() {


    }

    public L3_text getText() {
        return bigText;
    }

















   /* String [] split;

    private String example;

    String text = new String(example);
    List<String> l2Paragraph = new ArrayList();
    List<String> l1Sest = new ArrayList();
    List<String> l0Word = new ArrayList();

    public void splitTextToLayers(){
        l2Paragraph.add(text);
        for (String sent : l2Paragraph){
            l1Sest = Arrays.asList(sent.split(" "));
        }
       // String[] words = text.getText().split(" ");


    }*/


}
