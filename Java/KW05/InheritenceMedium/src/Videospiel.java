import java.util.Date;

public class Videospiel extends Medium {
    private String plattform;

    private int gb;
    private int altersbeschränkung;

    public Videospiel(String titel, Date erscheinungsdatum, String sprache, int altersempfehlung, String plattform, int gb, int altersbeschränkung) {
        super(titel, erscheinungsdatum, sprache, altersempfehlung);
        this.altersbeschränkung = altersbeschränkung;
        this.gb = gb;
        this.plattform = plattform;
    }


    public void setAltersbeschränkung(int altersbeschränkung) {
        this.altersbeschränkung = altersbeschränkung;
    }

    public void setPlattform(String plattform) {
        this.plattform = plattform;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }


}
