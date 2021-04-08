/*
package com.stringApp.services.editor;

import com.stringApp.Splitter;
import com.stringApp.elements.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Creator {





 //   = new ListIterator() {


    public ArrayList<L2_Word> l1_TO_l2 (ArrayList<L1_Symbol> a){

        L1_Symbol space = new L1_Symbol(' ');
        L1_Symbol dot = new L1_Symbol('.');


        List<L2_Word> word = new ArrayList<>();


        ListIterator<L1_Symbol> l1iterator =a.listIterator();



        while (l1iterator.hasNext()){

            ArrayList<L1_Symbol> buffer = new ArrayList<>();

            for (int i = 0; i<=a.size();i++){

                if (a.get(i).equals(space) || a.get(i).equals(dot)){
                    buffer.add(a.get(i));


                }
                else {
                    word.add(new L2_Word(buffer.toArray(new L1_Symbol[0])));
                    buffer.clear();
                }


            }



        }


        //return
    }
    ;







}
*/
