import java.util.Date;

public class Medium {

    private String titel;
    private Date erscheinungsdatum;
    private String sprache;
    private int altersempfehlung;

    public void printinfo (){
        String info = "Titel: " + titel +
                      "\nErscheinungsdatum: " + erscheinungsdatum +
                      "\nSprache: " + sprache +
                      "Altersempfehlung: " + altersempfehlung;
        System.out.println(info);
    }

    public Medium(String titel, Date erscheinungsdatum, String sprache, int altersempfehlung ){

        this.titel = titel;
        this.erscheinungsdatum = erscheinungsdatum;
        this.sprache = sprache;
        this.altersempfehlung = altersempfehlung;
    }

    public String getTitel() {
        return titel;
    }

    public Date getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public String getSprache() {
        return sprache;
    }

    public int getAltersempfehlung() {
        return altersempfehlung;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setErscheinungsdatum(Date erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    public void setAltersempfehlung(int altersempfehlung) {
        this.altersempfehlung = altersempfehlung;
    }
}
