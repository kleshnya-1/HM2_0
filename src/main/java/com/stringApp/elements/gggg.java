package com.stringApp.elements;

import com.stringApp.Splitter;
import com.stringApp.elements.Composite;

import java.awt.*;

import java.awt.image.ColorModel;
import java.util.ArrayList;
import java.util.List;

public class gggg {
    Splitter splitter = new Splitter();

    List<Character> buffer_start = new ArrayList<>();
    List<OneElement> buffer_symbol = new ArrayList<>();
    List<OneElement> buffer_word = new ArrayList<>();
    List<OneElement> buffer_sentence = new ArrayList<>();
    List<OneElement> buffer_paragraph = new ArrayList<>();
    List<OneElement> buffer_text = new ArrayList<>();


    List<Character> buffer_start_ForOneElement = new ArrayList<>();
    List<OneElement> buffer_symbolForOneElement = new ArrayList<>();
    List<OneElement> buffer_wordForOneElement = new ArrayList<>();
    List<OneElement> buffer_sentenceForOneElement = new ArrayList<>();
    List<OneElement> buffer_paragraphForOneElement = new ArrayList<>();
    List<OneElement> buffer_textForOneElement = new ArrayList<>();

    Composite composite = new Composite();

    public gggg(String s) {
        this.buffer_start = splitter.splitCharactersArrayList(s);
    }



    public List<OneElement> getBuffer_text() {
        return buffer_text;
    }




    public void makeIt (){




        for (int i = 0; i < buffer_start.size(); i++) {


            char charInCase = buffer_start.get(i);


            switch (charInCase) {


                case '.':
                    buffer_symbol.add(new OneElement(charInCase));
                    buffer_symbolForOneElement.add(new OneElement(charInCase));

                    buffer_word.add(new OneElement(buffer_symbolForOneElement));

                    buffer_symbolForOneElement.clear();

                    /////
                    buffer_sentence.add(new OneElement(buffer_wordForOneElement));
                    buffer_wordForOneElement.clear();

                    /*buffer_paragraph.add(new OneElement(buffer_sentence));
                    buffer_paragraph.clear();

                    buffer_text.add(new OneElement(buffer_paragraph));
                    buffer_text.clear();*/
                    break;

                case ' ':
                    buffer_symbol.add(new OneElement(charInCase));


                    buffer_word.add(new OneElement(buffer_symbolForOneElement));
                    buffer_wordForOneElement.add(new OneElement(buffer_symbolForOneElement));

                    buffer_symbolForOneElement.clear();
                    break;



                default:
                    buffer_symbol.add(new OneElement(charInCase));
                    buffer_symbolForOneElement.add(new OneElement(charInCase));


            }


        }

//проверить остатки в буффере, если нет точки
        if (buffer_symbolForOneElement.size()!=0){



            buffer_word.add(new OneElement(buffer_symbolForOneElement));
            buffer_wordForOneElement.add(new OneElement(buffer_symbolForOneElement));
            buffer_symbolForOneElement.clear();

            /////
            buffer_sentence.add(new OneElement(buffer_wordForOneElement));
            buffer_sentenceForOneElement.add(new OneElement(buffer_wordForOneElement));
            buffer_wordForOneElement.clear();

            buffer_paragraph.add(new OneElement(buffer_sentenceForOneElement));
            buffer_paragraphForOneElement.add(new OneElement(buffer_sentenceForOneElement));
            buffer_sentenceForOneElement.clear();

            buffer_text.add(new OneElement(buffer_paragraphForOneElement));
            buffer_textForOneElement.add(new OneElement(buffer_paragraphForOneElement));
            buffer_paragraphForOneElement.clear();

            buffer_textForOneElement.clear();




                    /*buffer_paragraph.add(new OneElement(buffer_sentence));
                    buffer_paragraph.clear();

                    buffer_text.add(new OneElement(buffer_paragraph));
                    buffer_text.clear();*/


        }

        /*composite.add(new OneElement(buffer_text));
        return  composite;*/

    }
    public void tell (){



    }




    ;

    public Composite getComp () {

        Composite composite = new Composite();

        composite.set(new OneElement(buffer_text));
        return  composite;

    }




















    public ArrayList splitCharactersArrayList2(String text){


        ArrayList<Character> characterArrayList = new ArrayList<>();



        for (int i=0;i<text.length();i++){
            characterArrayList.add(new Character(text.charAt(i)));

        }
        return characterArrayList;



    }



}
