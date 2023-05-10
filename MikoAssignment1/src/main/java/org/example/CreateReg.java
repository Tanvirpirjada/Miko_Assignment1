package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CreateReg {
//private CreateReg(){
//}

//public static <instance> CreateReg getInstance(instance){
//
//}


    private CreateReg(){}

    private static CreateReg instance_r;

    public static  CreateReg getInstance(){

    if(instance_r==null){
        instance_r=new CreateReg();
    }

    return instance_r;
    }

    HashMap<String,Integer> map=new HashMap<>();

    public HashMap<String, Integer> getMap() {
        return map;
    }
 WriteData writeData=new WriteData();
    public void Create(String s){
        String[] input = s.split(",\\s*|\\s+");
           int num=0;
           String key=input[1];
           String value="";
           if(input[2].charAt(0)=='#'){
               value=input[2].substring(1);
           }

            num=Integer.parseInt(value);
            map.put(key,num);
            writeData.writeData(map);
        //System.out.println(map);
    }

}
