package org.example;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static boolean isVowel(char c){
        List vowelList = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'});
        return(vowelList.contains(c));
    }

    public boolean isWord(String str){
        WordList wl = new WordList();
        return(wl.isKnownWord(str));
    }
}
