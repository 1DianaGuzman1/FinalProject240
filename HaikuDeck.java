package com.jetbrains;
import java.io.*;
import java.util.*;

public class HaikuDeck {
    private ArrayList<Haiku> haikuDeck;
    private String file;
    private FileReader fReader;

    public HaikuDeck(String fileName) {

        try{
            fReader = new FileReader(fileName);
        } catch(Exception e){
        }
        Scanner in = new Scanner(fReader);
        this.file = fileName;
        this.haikuDeck = new ArrayList();
        while(in.hasNextLine()) {
            this.haikuDeck.add(new Haiku(in));
            in.nextLine();
        }
    }

    public void printDeck(){
        for (Haiku s : this.haikuDeck)
            s.print();
    }
    public void printDeckSyll(){
        for (Haiku s : this.haikuDeck){
            s.printSyll();
        }
    }
}
