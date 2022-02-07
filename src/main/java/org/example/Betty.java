package org.example;

public class Betty extends Grandma{

    public Betty() {
        super("Betty");
    }

    public boolean likesWord(String str) {
        for(int i = 1; i < str.length(); i++){
            if(str.substring(i, i+1).equals(str.substring(i-1, i))){
                return true;
            }
        }
        return false;
    }
}
