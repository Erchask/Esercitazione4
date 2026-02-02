public class IniziativaSociale {
    private String nomeProgetto;
    private String descrizione;
    private String dataAvvio;
    private int durataGG;


    public IniziativaSociale(String nomeProgetto, String descrizione, String dataAvvio, int durataGG){
        this.nomeProgetto = nomeProgetto;
        this.descrizione = descrizione;
        this.dataAvvio = dataAvvio;
        this.durataGG = durataGG;
    }

/
    public String getNomeProgetto() {return this.nomeProgetto;}
    public String getDescrizione() {return this.descrizione;}
    public String getDataAvvio() {return this.dataAvvio;}
    public int getDurataGG() {return this.durataGG;}


    public void setNomeProgetto(String nomeProgetto) {this.nomeProgetto = nomeProgetto;}
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
    public void setDataAvvio(String dataAvvio) {this.dataAvvio = dataAvvio;}
    public void setDurataGG(int durataGG) {this.durataGG = durataGG;}

    @Override
    public String toString() {
        return "IniziativaSociale{" +
                "nomeProgetto='" + nomeProgetto + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", dataAvvio='" + dataAvvio + '\'' +
                ", durataGG=" + durataGG +
                '}';
    }
}
