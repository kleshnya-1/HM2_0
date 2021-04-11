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
    public Composite createFromCompositeList(List<Composite> e){

        Composite necComp = new Composite();

        for (Composite el : e)

            necComp.add((el));

        return necComp;



    }




    public void set(OneElement e) {

        child.clear();
        child.add(e);


    }


    @Override
    public void showIt() {
        int levelCounter = 0;

//1 - начало слова
//2 - начало предложения
//3 - начало текста


        ElementMine ePrev = new OneElement('0');

        for (ElementMine e : child) {

           /*if (e.toChar() == 0) {
                levelCounter++;
            }

            if (levelCounter == 0) {
                System.out.print("");
            }
            if (levelCounter == 1) {
                System.out.print(". ");
            }




            System.out.print("*" + levelCounter + "*");
*/

            //  System.out.print("_");
            //levelCounter = 0;
          /*  ePrev.showIt();
            ePrev = e;
            ePrev.showIt();*/

           /* if(ePrev.toChar() == ' '){
                System.out.print(" ");
            }*/

            e.showIt();
           /* if (e.toChar()==0){
                System.out.print(". ");
            }*/
          //  levelCounter=0;


        }

    }



    @Override
    public char toChar() {
        char ch = 0;
        for (ElementMine e: child)
        {
           ch= e.toChar();
        }
        return ch;

    }

    public void showItLikeItMustBe() {
        System.out.print(child.toArray());
    }

    public List<ElementMine> getChild() {
        return child;
    }
}



