package com.jetbrains;
import java.util.*;
import java.io.*;

public class Trivia {
    private String trivQuestion;
    private int newCardOrNot;
    // private ArrayList<Trivia> triviaArrayList;

    public Trivia(String trivQuestion, int newCardOrNot ) {
        this.trivQuestion = trivQuestion;
        this.newCardOrNot = newCardOrNot;
    }

    //getter and setter
    public void settrivQuestion(String trivQuestion){
        this.trivQuestion = trivQuestion;
    }
    public void setnewCardOrNot(int newCardOrNot ){
        this.newCardOrNot = newCardOrNot;
    }
    public String gettrivQuestion(){
        return this.trivQuestion;
    }
    public int getnewCardOrNot() {
        return this.newCardOrNot;
    }


    public boolean ask( ) {
        if (newCardOrNot == 0) {
            return true;
        } else {
            return false;
        }
    }

}


