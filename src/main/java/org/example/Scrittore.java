package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Scrittore {
    private final File file=new File("Certificato.json");
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void ScriviFile(Certificato c1){
        String json = gson.toJson(c1);
        synchronized(lock){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
                bw.write(json);
            }
        }
    }


}
