package com.seb;



import java.util.ArrayList;
import java.util.Random;

public class Colors {
    private String comment;
    private int index;

    public Colors(String comment, int index) {
        this.comment = comment;
        this.index = index;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }





    public static String randomGenerator(){
        ArrayList<String> listofCommnets = new ArrayList<>(5);
        String comment1 = "Perfect";
        String comment2="Not Bad";
        String comment3="Weird";
        String comment4="Wow!!!";
        String comment5="No comment for you";
        listofCommnets.add(comment1);
        listofCommnets.add(comment2);
        listofCommnets.add(comment3);
        listofCommnets.add(comment4);
        listofCommnets.add(comment5);

        Random rand=new Random();
        int index=(rand.nextInt(5)+1);
        return  listofCommnets.get(index);



}

}
