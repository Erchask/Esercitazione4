import java.util.ArrayList;


public class Azienda {
    private String nome;
    private String ragioneSociale;
    private String settore;
    private String provincia;
    private ArrayList<IniziativaSociale> iniziativeSociali = new ArrayList<>();
    private Certificato certificato;
    private ArrayList<SanzioneAmbientale> sanzioniAmbientali = new ArrayList<>();


    public Azienda(String nome, String ragioneSociale, String settore, String provincia, Certificato certificato) {
        this.nome = nome;
        this.ragioneSociale = ragioneSociale;
        this.settore = settore;
        this.provincia = provincia;
        this.certificato = certificato;
    }

    public Azienda(String nome, String ragioneSociale, String settore, String provincia,
                   Certificato certificato,
                   ArrayList<IniziativaSociale> iniziativeSociali,
                   ArrayList<SanzioneAmbientale> sanzioniAmbientali) {
        this.nome = nome;
        this.ragioneSociale = ragioneSociale;
        this.settore = settore;
        this.provincia = provincia;
        this.certificato = certificato;
        this.iniziativeSociali = iniziativeSociali;
        this.sanzioniAmbientali = sanzioniAmbientali;
    }


    public String getNome() { return this.nome; }
    public String getRagioneSociale() { return this.ragioneSociale; }
    public String getSettore() { return this.settore; }
    public String getProvincia() { return this.provincia; }
    public Certificato getCertificato() { return this.certificato; }


    public void setNome(String nome) { this.nome = nome; }
    public void setRagioneSociale(String ragioneSociale) { this.ragioneSociale = ragioneSociale; }
    public void setSettore(String settore) { this.settore = settore; }
    public void setProvincia(String provincia) { this.provincia = provincia; }
    public void setIniziativeSociali(ArrayList<IniziativaSociale> iniziativeSociali) { this.iniziativeSociali = iniziativeSociali; }
    public void setCertificato(Certificato certificato) { this.certificato = certificato; }
    public void setSanzioneAmbientale(ArrayList<SanzioneAmbientale> sanzioneAmbientale) { this.sanzioniAmbientali = sanzioneAmbientale; }

    
    public void addIniziativaSociale(IniziativaSociale is) {
        iniziativeSociali.add(is);
    }

    public String leggiIniziativeSociali() {
        StringBuilder sb = new StringBuilder();
        for (IniziativaSociale el : iniziativeSociali) {
            sb.append(el.toString()).append('\n');
        }
        return sb.toString();
    }

    public void rmIniziativeSociale(String nome) {
        try {
            iniziativeSociali.remove(nome);
        } catch (Exception e) {
            System.out.println("Iniziativa non presente nell'elenco.");
        }
    }


    public void addSanzioneAmbientale(SanzioneAmbientale sa) {
        sanzioniAmbientali.add(sa);
    }

    public void rmSanzioneAmbientale(String nome) {
        try {
            sanzioniAmbientali.remove(nome);
        } catch (Exception e) {
            System.out.println("Sanzione non presente.");
        }
    }

    public String leggiSazioniAmbientali() {
        StringBuilder sb = new StringBuilder();
        for (SanzioneAmbientale el : sanzioniAmbientali) {
            sb.append(el.toString()).append('\n');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "nome='" + nome + '\'' +
                ", ragioneSociale='" + ragioneSociale + '\'' +
                ", settore='" + settore + '\'' +
                ", provincia='" + provincia + '\'' +
                ", iniziativeSociali=" + leggiIniziativeSociali() +
                ", certificato=" + certificato +
                ", sanzioneAmbientale=" + leggiSazioniAmbientali() +
                '}';
    }
}
