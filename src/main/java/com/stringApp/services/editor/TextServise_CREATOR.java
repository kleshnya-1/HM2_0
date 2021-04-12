package com.stringApp.services.editor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import com.stringApp.elements.*;
import lombok.extern.slf4j.Slf4j;


import java.util.*;


@Slf4j
public class TextServise_CREATOR implements OneItem {

    private L3_text bigText = new L3_text();
    private List<L2_paragraph> paragraphs = new ArrayList<>();
    private List<L1_sent> sents = new ArrayList<>();
    private List<L0_word> words = new ArrayList<>();


    private List<L2_paragraph> Buffer_paragraphs = new ArrayList<>();
    private List<L1_sent> Buffer_sents = new ArrayList<>();
    private List<L0_word> Buffer_words = new ArrayList<>();
    private List<L0_word> Buffer_words2 = new ArrayList<>();


    private String originalText;
    private String stringForSplittting;








    public void getStringForSplitting(String s) {
        this.originalText = s;
        this.stringForSplittting = new String(originalText);
        bigText.setOriginal(new String(originalText));
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


    public void pringOriginal() {

        System.out.println(originalText);
    }



    public L3_text getText() {

        return bigText;
    }

    public String getOriginalText() {
        return originalText;
    }




}
