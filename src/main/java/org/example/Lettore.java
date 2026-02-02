import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.io.*;
import java.util.ArrayList;

public class Lettore implements Runnable{
    private final File file;
    private final Gson gson;


    public Lettore(String percorso) {
        this.file = new File(percorso);
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

 
    public ArrayList<Azienda> leggiFileJson() {
        synchronized(FileLock.LOCK)
        {
            try (BufferedReader reader = new BufferedReader((new FileReader(file)))) {
                Type type = new TypeToken<ArrayList<Azienda>>() {}.getType(); 
                return gson.fromJson(reader, type);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }


    @Override
    public void run() {
        ArrayList<Azienda> aziende = leggiFileJson();
        System.out.println(aziende);
    }
}
