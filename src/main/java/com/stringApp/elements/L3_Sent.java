package com.stringApp.elements;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class L3_Sent  implements ElementMine{


    private List<L2_Word> sentence = new ArrayList<>();


    public void add (L2_Word word){
        sentence.add(word);
    }


    @Override
    public void showIt() {
        for (L2_Word word:sentence ){

            word.showIt();


        }
    }
}
