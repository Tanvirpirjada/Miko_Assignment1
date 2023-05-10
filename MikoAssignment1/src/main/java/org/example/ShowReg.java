package org.example;




import java.util.HashMap;
import java.util.Scanner;

public class ShowReg {


   CreateReg reg=CreateReg.getInstance();
    LoadData loadData=new LoadData();
    ReadData readData=new ReadData();
   HashMap<String,Integer> map =reg.getMap();

    public  void run(){

        Scanner sc=new Scanner(System.in);
        //CreateReg reg=CreateReg.getInstance();
        AddReg addReg=new AddReg();
        ShowReg saw=new ShowReg();
        loadData.loadData();
        System.out.println(map);
        while(true){
            String input=sc.nextLine().toUpperCase();
            String[]  inputs=input.split(",\\s*|\\s+");
            if(inputs[0].equals("MV")){
                reg.Create(input);
            }
            else if(inputs[0].equals("ADD")){
                addReg.addReg(input);
            }
            else if(inputs[0].equals("SHOW")){
                saw.showReg();
            }
            else if(inputs[0].equals("EXIT")){
                break;
               // System.exit(1);
            }

        }
    }
    public void showReg(){
//        System.out.println("Reg    "+"value");
//        for(Map.Entry<String,Integer> i: map.entrySet())
//        System.out.println(i.getKey()+"   "+i.getValue());
        readData.readData();
    }
}


