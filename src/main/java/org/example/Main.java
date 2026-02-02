import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Certificato c1 = new Certificato(1, 2, 3);
        Certificato c2 = new Certificato(3, 4, 5);

        ArrayList<IniziativaSociale> iniziativeSociali = new ArrayList<>();
        ArrayList<SanzioneAmbientale> sanzioneAmbientale = new ArrayList<>();
        iniziativeSociali.add(new IniziativaSociale(
                "Strada Splendente",
                "Pulizia aggressiva del marciapiede davanti alla sede",
                "01/04/2022",
                9
        ));
        sanzioneAmbientale.add(new SanzioneAmbientale(
                500,
                "Lotta illegale in strada contro l'azienda PuliscoMeglio durante operazioni di pulizia",
                "02/04/2022"
        ));

        ArrayList<IniziativaSociale> iniziativeSociali_2 = new ArrayList<>();
        ArrayList<SanzioneAmbientale> sanzioneAmbientale_2 = new ArrayList<>();
        iniziativeSociali_2.add(new IniziativaSociale(
                "Pulito Totale",
                "Pulizia intensiva dello stesso tratto di strada",
                "01/04/2022",
                11
        ));
        sanzioneAmbientale_2.add(new SanzioneAmbientale(
                480,
                "Rissa e assembramento non autorizzato contro l'azienda PuliscoBene in luogo pubblico",
                "03/04/2022"
        ));

        Azienda a1 = new Azienda(
                "PuliscoBene",
                "PuliscoBene S.r.l.",
                "Servizi di Pulizia",
                "NA",
                c1,
                iniziativeSociali,
                sanzioneAmbientale
        );

        Azienda a2 = new Azienda(
                "PuliscoMeglio",
                "PuliscoMeglio S.p.A.",
                "Servizi di Pulizia",
                "NA",
                c2,
                iniziativeSociali_2,
                sanzioneAmbientale_2
        );

        ArrayList<Azienda> aziende = new ArrayList<>();
        aziende.add(a1);
        aziende.add(a2);

        Scrittore s = new Scrittore("aziende.json", aziende);
        Lettore l = new Lettore("aziende.json");

        Thread ts = new Thread(s);
        Thread tl = new Thread(l);

        ts.start();
        tl.start();

        try {
            ts.join();
            tl.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
