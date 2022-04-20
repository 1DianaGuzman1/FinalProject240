import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class HaikuGen {
    private Haiku random;
    private String wordFile = "./words/words.txt";
    private FileReader fReader;
    private ArrayList<String> words;
    private String line1;
    private String line2;
    private String line3;

    public HaikuGen(){
        this.random = haikuGen();
    }



}

