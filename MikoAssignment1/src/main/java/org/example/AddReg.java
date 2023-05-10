package org.example;

import java.util.Arrays;
import java.util.HashMap;

 class AddReg {

  CreateReg reg=CreateReg.getInstance();

  HashMap<String,Integer> map=reg.getMap();
    WriteData writeData=new WriteData();
    public void addReg(String s){
        String[] input = s.split(",\\s*|\\s+");// Split the string and covert into String arr based on regex
        String key=input[1];
        String value=input[2];
        int num=0;
       if(Character.isDigit(value.charAt(0))){
           num=Integer.parseInt(value);
           map.put(key,map.get(key)+num);
        }
       else{
           map.put(key,map.get(key)+map.get(value));
       }
       writeData.writeData(map);
    }
}

