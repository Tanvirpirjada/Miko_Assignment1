package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating txt file for store data
        String path="D:\\SpringbootProjects\\MikoAssignment1\\data.txt";
        File file=new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         ShowReg showReg=new ShowReg();
        showReg.run();
    }
}