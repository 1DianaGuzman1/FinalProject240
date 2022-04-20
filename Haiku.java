package com.jetbrains;
import java.io.*;
import java.util.*;

public class Haiku {
    private Haiku random;
    private String wordFile = "./words/words.txt";
    private FileReader fReader;
    private ArrayList<String> words;
    private String sline1;
    private String sline2;
    private String sline3;
    private ArrayList<String> line1 = new ArrayList();
    private ArrayList<String> line2 = new ArrayList();
    private ArrayList<String> line3 = new ArrayList();
    private String file;
    private int line1Count=0;
    private int line2Count=0;
    private int line3Count=0;

    public Haiku(String line1, String line2, String line3){
        this.line1 = toList(line1);
        this.line2 = toList(line2);
        this.line3 = toList(line3);
    }

    public Haiku(Scanner in) {
        this.line1 = toList(in.nextLine());
        this.line2 = toList(in.nextLine());
        this.line3 = toList(in.nextLine());
//       in.nextLine();
    }

    private ArrayList<String> toList(String line){
        String[] lineArr = line.split(" ");
        ArrayList<String> lineList = new ArrayList(Arrays.asList(lineArr));
        return lineList;
    }

    public void print(){
        System.out.println(this.line1);
        System.out.println(this.line2);
        System.out.println(this.line3);
        System.out.println();
    }

    public void printSyll(){
        for(String s : this.line1){
//            System.out.println("syllables for string " + s + " is " + Authenticator.SyllableCount(s));
            this.line1Count+=Authenticator.syllableCount(s);
        }
        System.out.println("syllables in line 1: "+this.line1Count);
        for(String s : this.line2){
//            System.out.println("syllables for word " + s + " is " + Authenticator.syllableCount(s));
            this.line2Count+=Authenticator.syllableCount(s);
        }
        System.out.println("syllables in line 2: "+this.line2Count);
        for(String s : this.line3){
//            System.out.println("syllables for string " + s + " is " + Authenticator.SyllableCount(s));
            this.line3Count+=Authenticator.syllableCount(s);
        }
        System.out.println("syllables in line 3: "+this.line3Count+"\n");

    }

    public Haiku haikuGen(){
        Random rand = new Random();
        try{
            fReader = new FileReader(wordFile);
        } catch(Exception e){
        }
        this.words = new ArrayList(1000);
        Scanner in = new Scanner(fReader);
        while(in.hasNextLine()){
            this.words.add(in.nextLine());
        }
        this.sline1 = this.words.get(rand.nextInt((words.size()))) + " " + this.words.get(rand.nextInt((words.size()))) + " " + this.words.get(rand.nextInt((words.size())));
        this.sline2 = this.words.get(rand.nextInt((words.size()))) + " " + this.words.get(rand.nextInt((words.size()))) + " " + this.words.get(rand.nextInt((words.size())));
        this.sline3 = this.words.get(rand.nextInt((words.size()))) + " " + this.words.get(rand.nextInt((words.size()))) + " " + this.words.get(rand.nextInt((words.size())));
        this.random = new Haiku(sline1,sline2,sline3);
        return random;
    }

}
