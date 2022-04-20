package com.jetbrains;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class Authenticator {
    static public int syllableCount(String s) {
        int counter = 0;
        s = s.toLowerCase(); // converting all string to lowercase
        if(s.contains("the ")){
            counter++;
        }
        String[] split = s.split("e!$|e[?]$|e,|e |e[),]|e$");

        ArrayList<String> al = new ArrayList<String>();
        Pattern tokSplitter = Pattern.compile("[aeiouy]+");

        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            Matcher m = tokSplitter.matcher(s1);

            while (m.find()) {
                al.add(m.group());
            }
        }

        counter += al.size();
        return counter;
    }
}