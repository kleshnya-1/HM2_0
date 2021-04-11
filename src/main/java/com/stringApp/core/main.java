package com.stringApp.core;


import com.stringApp.elements.*;

public class main {
    public static void main(String[] args) {


Composite text = new Composite();

/*
OneElement a = new OneElement('h');
OneElement a2 = new OneElement('H');
OneElement a3 = new OneElement('h');



text.add(a);
text.add(a2);

*/

//text.showIt();

OneElement oneElement = new OneElement('k');

oneElement.showIt();


Composite_filler_withBuffers g = new Composite_filler_withBuffers("first seckond third. again this");

g.splitCharactersArrayList2("first seckong three. how");
g.makeComposite();
g.tell();

      text = g.getComp1();



        //text.add(a2);




        OneElement g66 = new OneElement('g');
        OneElement g3 = new OneElement('g');
        OneElement g5 = new OneElement('g');


        Composite word1 = new Composite();
        Composite sent1 = new Composite();
        Composite paragraph = new Composite();


        word1.add(g66);
        word1.add(g3);

        paragraph.add(sent1);
        //sent1.add();




/*text.showIt();

text.showItLikeItMustBe();*/


//String ssstr = "ggfdd ff ttt ";













       // String aaaaaa = new String("ffss ss ss");







        //L1_Symbol[] l1 = dr.spliterToSymbols(aaaaaa);




       /* System.out.println();
        System.out.println();



        L1_Symbol a = new L1_Symbol('a');
        L1_Symbol l = new L1_Symbol('l');
        L1_Symbol o = new L1_Symbol('o');
        L1_Symbol spa = new L1_Symbol(' ');
        L1_Symbol g = new L1_Symbol('g');
        L1_Symbol aa = new L1_Symbol('a');
        L1_Symbol r = new L1_Symbol('r');
        L1_Symbol aaa = new L1_Symbol('a');
        L1_Symbol g1 = new L1_Symbol('g');
        L1_Symbol e = new L1_Symbol('e');

        e.showIt();
        System.out.println();


        L2_Word allo = new L2_Word();
        allo.add(a);
        allo.add(l);
        allo.add(o);

        allo.showIt();
        System.out.println();

        L2_Word garage = new L2_Word();
        garage.add(g);
        garage.add(aa);
        garage.add(r);
        garage.add(aaa);
        garage.add(g1);
        garage.add(e);

        garage.showIt();
        System.out.println();

        L3_Sent alloGarage = new L3_Sent();
        alloGarage.add(allo);
        alloGarage.add(garage);
        alloGarage.showIt();

        Splitter d = new Splitter();



        d.spliterToSymbols("fff dd aaaa rr 1");



        L2_Word w = new L2_Word(new L1_Symbol['g']);


*/


/*

        String textExample = "ff ffff edd ttt hggg" +
                "hhhh ffff sdsdsds ";




        Composite paragraph = new Composite();
        Composite sentence = new Composite();
        Composite word = new Composite();
        Composite symbol = new Composite();

        word.add(new Symbol_Leaf('h'));
        word.add(new Symbol_Leaf('e'));
        word.add(new Symbol_Leaf('l'));
        word.add(new Symbol_Leaf('l'));


        word.showIt();


        drobitel d = new drobitel();
        d.splittter(textExample);

*/




       /* L1_Symbol h =new L1_Symbol('h');
        L1_Symbol e =new L1_Symbol('e');
        L1_Symbol l =new L1_Symbol('l');
        L1_Symbol l1 =new L1_Symbol('l');
        L1_Symbol o =new L1_Symbol('o');
        L1_Symbol space = new L1_Symbol(' ');
        L1_Symbol w =new L1_Symbol('w');
        L1_Symbol o1 =new L1_Symbol('o');
        L1_Symbol r =new L1_Symbol('r');
        L1_Symbol l2 =new L1_Symbol('l');
        L1_Symbol l4 =new L1_Symbol('l');
        L1_Symbol d =new L1_Symbol('d');

        L2_Word word1 = new L2_Word();*/






                /*Element chaaaar = new L1_Symbol();
        Element chaaaar2 = new L0_BaseElement('j');
        Element l1 = new L0_BaseElement('j');
        Element l11 = new L0_BaseElement('j');
        Element l111 = new L0_BaseElement('j');*/






      /*  L4_Text text = new L4_Text();


        L2_Word word1 = new L2_Word("hhhh");*/



       /* L1_Symbol s1=new L1_Symbol('t');
        L1_Symbol s2=new L1_Symbol('0');
        L1_Symbol s3=new L1_Symbol(' ');
        L1_Symbol s4=new L1_Symbol('L');
        L1_Symbol s5=new L1_Symbol('`');
        L2_Word word2 = new L2_Word("hhgf");
        L2_Word word3 = new L2_Word("hhhhgf");
        L3_Sent s1= new L3_Sent("ff gg hh")





        */
       /* L3_Sent s2.add(word1)

        word1.print();

        //L2_Word word2 = new L2_Word(s1,s2,s3,s4,s5);


        text.set(word1);
*/









    }
}
