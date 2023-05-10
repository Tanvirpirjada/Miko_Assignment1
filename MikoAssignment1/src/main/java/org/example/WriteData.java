package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteData {

//    CreateReg reg=CreateReg.getInstance();
//    HashMap<String,Integer> map=reg.getMap();


    public void writeData(HashMap<String,Integer> map) {
        String path = "D:\\SpringbootProjects\\MikoAssignment1\\data.txt";
        File file = new File(path);
        BufferedWriter writer;

        {
            try {
                writer = new BufferedWriter(new FileWriter(file));
                for (Map.Entry<String, Integer> entryMap : map.entrySet()) {
                    writer.write(entryMap.getKey() + ":" + entryMap.getValue()+",");
//                    System.out.println();
                }
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
