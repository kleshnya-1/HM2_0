package com.stringApp.elements;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Composite implements ElementMine {


    private List<ElementMine> child = new ArrayList<ElementMine>();

    public Composite(List<ElementMine> child) {
        this.child = child;
    }

    public Composite(ElementMine... oneelemsnts) {
        child = new LinkedList<>();
        for (ElementMine c : oneelemsnts) {
            child.add(c);
        }

    }


    /*public Composite(List<OneElement> childOE) {
        this.child = childOE;
    }
*/


    public Composite() {

    }

    public void add(ElementMine e) {

        child.add(e);


    }

    public void addFromList(List<ElementMine> e){


        for (ElementMine el : e)

        child.add(el);



    }
    public void addFromCompositeList(List<Composite> e){


        for (Composite el : e)

            child.add(el);



    }


    public void set(OneElement e) {

        child.clear();
        child.add(e);


    }


    @Override
    public void showIt() {


        // for (OneElement oneElement : child) {
        //     oneElement.showIt();
    }
    public void showItLikeItMustBe() {
        System.out.print(child.toArray());
    }
}



