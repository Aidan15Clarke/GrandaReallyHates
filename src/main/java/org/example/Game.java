package org.example;

public class Game {
    WordList wordList;

    public Game(WordList wordlist) {
        this.wordList = wordlist;
    }

    public void run(){
        Grandma d = new Ana();
        System.out.println("Grandma " + d.getName());
        System.out.println(d.likesWord("racecar"));

        Grandma e = new Esme();
        System.out.println("Grandma " + e.getName());
        System.out.println(e.likesWord("mom"));

        Grandma m = new Momo();
        System.out.println("Grandma " + m.getName());
        System.out.println(m.likesWord("jack"));
    }
}
