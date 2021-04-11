package com.stringApp;

import java.util.ArrayList;
import java.util.List;

public class Splitter {







    public List<Character> splitCharactersArrayList(String text){


        ArrayList<Character> characterList = new ArrayList<>();



        for (int i=0;i<text.length();i++){
            characterList.add(new Character(text.charAt(i)));

        }
        return characterList;



    }













}
