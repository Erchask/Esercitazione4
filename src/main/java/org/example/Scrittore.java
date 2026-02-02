import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.ArrayList;


public class Scrittore implements Runnable{
    private final File file;
    private final Gson gson;
    private final ArrayList<Azienda> aziende;


    public Scrittore(String percorso, ArrayList<Azienda> aziende) {
        this.file = new File(percorso);
        this.aziende = aziende;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }


    public void scriviSuFile(ArrayList<Azienda> a) {
        synchronized(FileLock.LOCK)
        {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
            {
               gson.toJson(a, bw);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void run() {
        scriviSuFile(aziende);
    }
}
