package com.stringApp;

import com.stringApp.elements.L1_Symbol;

import java.util.ArrayList;
import java.util.List;

public class Splitter {


    public L1_Symbol[] spliterToSymbols(String s) {


        ArrayList<L1_Symbol> list = new ArrayList<>();


        L1_Symbol[] l1Symbols = new L1_Symbol[s.length()];
        char[] arr = s.toCharArray();


        for (int i = 0; i < arr.length; i++) {

            l1Symbols[i] = new L1_Symbol(arr[i]);
        }


        return l1Symbols;


    }




    public List<Character> splitCharactersArrayList(String text){


        ArrayList<Character> characterList = new ArrayList<>();



        for (int i=0;i<text.length();i++){
            characterList.add(new Character(text.charAt(i)));

        }
        return characterList;



    }













}
