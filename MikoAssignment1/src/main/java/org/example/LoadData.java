package org.example;

import java.util.HashMap;

public class LoadData {

    CreateReg createReg=CreateReg.getInstance();
    HashMap<String,Integer> map=createReg.getMap();

 ReadData readData=new ReadData();
    public void loadData(){
        String input=readData.readData();
        if(input!=null){
            String [] split=input.split(",");
            for(int i=0; i<split.length; i++){
                String[] split1 = split[i].split(":");
                if(map.containsKey(split1[0])){
                    map.put(split1[0], map.get(split1[0])+Integer.parseInt(split1[1]));
                }
                else{
                    map.put(split1[0],Integer.parseInt(split1[1]));
                }
            }
        }
        //System.out.println(map);
    }
}
