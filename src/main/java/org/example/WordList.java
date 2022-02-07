package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class WordList {
    ArrayList<String> knownWords = new ArrayList<>();

    public WordList() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isKnownWord(String str){
        return (knownWords.contains(str));
    }
}
