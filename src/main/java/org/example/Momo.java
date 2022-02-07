package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Momo extends Grandma{
    ArrayList<String> list = new ArrayList<>();

    public Momo() {
        super("Momo");
    }

    @Override
    public boolean likesWord(String str) {
        if(str.length() < 4){
            return false;
        }

        organize(str);

        String temp = "";
        for(int i = 0; i < list.size(); i++){
            temp = list.get(i);
            list.remove(i);

            if(list.contains(temp)){
                return true;
            }
            i--;
        }
        return false;
    }

    public void organize(String str){
        for(int i = 0; i < str.length()-1; i++){
            list.add(str.substring(i, i+2));
        }
    }
}
