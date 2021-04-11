package com.stringApp.elements;

import com.stringApp.Splitter;

import java.util.ArrayList;
import java.util.List;

public class Composite_filler_withBuffers {

    Splitter splitter = new Splitter();
    List<Character> buffer_start = new ArrayList<>();
    List<ElementMine> buffer_symbol = new ArrayList<>();
    List<Composite> buffer_word = new ArrayList<>();
    List<Composite> buffer_sentence = new ArrayList<>();
    List<Composite> buffer_paragraph = new ArrayList<>();
    Composite buffer_text = new Composite();


    List<Character> buffer_start_ForOneElement = new ArrayList<>();
    List<ElementMine> buffer_CorCreateingWord = new ArrayList<>();
    List<Composite> buffer_forCreatingSentence = new ArrayList<>();
    List<Composite> buffer_sentenceForCratingParagraph = new ArrayList<>();
    List<Composite> buffer_paragraphForOneElement = new ArrayList<>();
    List<Composite> buffer_textForOneElement = new ArrayList<>();

    Composite textFromMethod = new Composite();
    int counterSymb = 0;
    int counterWords = 0;

    public Composite_filler_withBuffers(String s) {
        this.buffer_start = splitter.splitCharactersArrayList(s);
    }

    public void makeComposite() {


        for (int i = 0; i < buffer_start.size(); i++) {
            char charInCase = buffer_start.get(i);
            switch (charInCase) {

                case '.':
                    buffer_symbol.add(new OneElement(charInCase));
                    buffer_CorCreateingWord = new ArrayList<>(buffer_symbol.subList(i - counterSymb, i));
                    buffer_word.add(new Composite(buffer_CorCreateingWord));
                    counterWords++;
                    counterSymb = 0;


                    buffer_forCreatingSentence = new ArrayList<>(buffer_word.subList
                            (buffer_word.size() - counterWords, buffer_word.size()));
                    counterWords = 1;


                    buffer_sentence.add(new Composite().
                            createFromCompositeList(buffer_forCreatingSentence));
                {
                  /*  for (Composite c : buffer_forCreatingSentence)
                        buffer_sentence.add(c);*/

                }
                break;

                case ' ':

                    buffer_symbol.add(new OneElement(charInCase));
                    buffer_CorCreateingWord = new ArrayList<>(buffer_symbol.subList(i - counterSymb, i));
                    buffer_word.add(new Composite(buffer_CorCreateingWord));
                    counterWords++;
                    counterSymb = 0;

                    break;


                default:
                    buffer_symbol.add(new OneElement(charInCase));
                    counterSymb++;

            }

        }
//проверить остатки в буaфере
        {
           buffer_CorCreateingWord = new ArrayList<>(buffer_symbol.subList(buffer_symbol.size() - counterSymb, buffer_symbol.size()));
            buffer_word.add(new Composite(buffer_CorCreateingWord));
            counterWords++;
            counterSymb = 0;
            buffer_forCreatingSentence = new ArrayList<>(buffer_word.subList
                    ( counterWords, buffer_word.size()));
            counterWords = 0;
            buffer_sentence.add(new Composite().
                    createFromCompositeList(buffer_forCreatingSentence));
        }




        /*composite.add(new OneElement(buffer_text));
        return  composite;*/

    }

    public void tell() {


    }


    ;

    public Composite getComp1() {

        Composite composite = new Composite();

        composite.addFromCompositeList((buffer_word));
        return composite;

    }

  /*  public Composite getComp () {

        Composite composite = new Composite();

        composite.set(new OneElement(buffer_text));
        return  composite;

    }*/


    public ArrayList splitCharactersArrayList2(String text) {


        ArrayList<Character> characterArrayList = new ArrayList<>();


        for (int i = 0; i < text.length(); i++) {
            characterArrayList.add(new Character(text.charAt(i)));

        }
        return characterArrayList;


    }


}
