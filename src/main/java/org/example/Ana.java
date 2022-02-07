package org.example;

public class Ana extends Grandma{
    public Ana() {
        super("Ana");
    }

    public boolean likesWord(String str){
        if(str.length() < 2){
            return false;
        }
        String temp = "";

        for(int i = str.length() - 1; i > -1; i--){
            temp += str.charAt(i);
        }

        return(temp.equals(str));
    }
}
