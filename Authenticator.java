/*import java.util.*;

public class Authenticator {

static public int SyllableCount(String s) {
    int count = 0;
    s = s.toLowerCase(); 
 
    for (int i = 0; i < s.length(); i++) { // traversing till length of string
        if (s.charAt(i) == '\"' || s.charAt(i) == '\'' || s.charAt(i) == '-' || s.charAt(i) == ',' || s.charAt(i) == ')' || s.charAt(i) == '(') {
            // if at any point, we encounter any such expression, we substring the string from start till that point and further.
            s = s.substring(0,i) + s.substring(i+1, s.length());
        }
    }

    boolean isPrevVowel = false;
 
    for (int j = 0; j < s.length(); j++) {
        if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) {
            // checking if character is a vowel and if the last letter of the word is 'e' or not
            if (isVowel(s.charAt(j)) && !((s.charAt(j) == 'e') && (j == s.length()-1))) {
                if (isPrevVowel == false) {
                    count++;
                    isPrevVowel = true;
                }
            } else {
                isPrevVowel = false;
            }
        } else {
            count++;
            break;
        }
    }
    return count;
}

static public boolean isVowel(char c) {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        return true;
    } else {
        return false;
    }
    }
}

*/
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