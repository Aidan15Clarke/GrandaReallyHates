package org.example;

public class App 
{
    public static void main(String[] args) {
        Game game = new Game(new WordList());
        game.run();
    }
}
