package com.stringApp.elements;

import java.util.ArrayList;
import java.util.List;

public class Composite implements  ElementMine{


    private List<ElementMine> child = new ArrayList<>();

    public Composite(List<ElementMine> child) {
        this.child = child;
    }

    /*public Composite(List<OneElement> childOE) {
        this.child = childOE;
    }
*/


    public Composite() {

    }



    public void add(ElementMine e){

        child.add(e);



    }

    public void set(ElementMine e){

        child.clear();
        child.add(e);



    }


    @Override
    public void showIt() {


        for (ElementMine elementMine : child) {
            elementMine.showIt();
        }

    }

    public void showItLikeItMustBe() {
        System.out.print(child.toArray());
    }
}
