package com.stringApp.elements;

import java.util.ArrayList;
import java.util.List;

public class L4_Paragraph implements ElementMine{

    private List<L3_Sent> paragraph = new ArrayList<>();


    public void add (L3_Sent sent){
        paragraph.add(sent);
    }


    @Override
    public void showIt() {

    }

}
