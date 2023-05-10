package org.example;

import java.io.*;

public class ReadData {


    public String readData() {
        String path = "D:\\SpringbootProjects\\MikoAssignment1\\data.txt";
        File file = new File(path);
        Reader reader;
        BufferedReader bufferedReader;

        {
            try {
                reader = new FileReader(file);
                bufferedReader = new BufferedReader(reader);
                String data= bufferedReader.readLine();
               // while ((data =reader.read()) != null) {
                    System.out.println(data);
                    return data;
                // }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
