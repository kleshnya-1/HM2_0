package com.stringApp.elements;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class L5_Text implements ElementMine{

    private String originalText;
    private List<L4_Paragraph> text = new ArrayList<>();


    public void add (L4_Paragraph paragraph){
        text.add(paragraph);
    }

    public void setAsString (String s){
        originalText = s;
    }



    @Override
    public void showIt() {

    }
}
