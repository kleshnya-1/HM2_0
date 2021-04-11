package com.stringApp.elements;

import java.util.List;

public class L1_sent implements OneItem {

    List<L0_word> sent;

    public L1_sent(List<L0_word> sent) {
        this.sent = sent;
    }


    public List<L0_word> getSent() {
        return sent;
    }

    public void setSent(List sent) {
        this.sent = sent;
    }


    public void print(){
int count =0;
        for (L0_word l0:sent){
            count++;
            if (sent.size()!=count){
                l0.print();
                System.out.print(" ");
            }

            else l0.print();
        }
        System.out.print(". ");


    }



    @Override
    public int position() {
        return 1;
    }
}
