package com.stringApp.elements;

import java.util.List;

public class NP_l1_sent implements OneItem {

    List<NP_L0_word> sent;

    public NP_l1_sent(List<NP_L0_word> sent) {
        this.sent = sent;
    }


    public List getSent() {
        return sent;
    }

    public void setSent(List sent) {
        this.sent = sent;
    }


    public void print(){
int count =0;
        for (NP_L0_word l0:sent){
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
