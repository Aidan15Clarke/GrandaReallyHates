package org.example;

import java.util.Arrays;
import java.util.List;

public class Dawn extends Grandma{

    public Dawn() {
        super("Dawn");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length() < 2){
            return false;
        }

        int temp = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(Utils.isVowel(str.charAt(i))){
                temp++;
            }
        }
        return(temp == 1);
    }
}
