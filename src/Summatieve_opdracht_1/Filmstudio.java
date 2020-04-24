package Summatieve_opdracht_1;

public class Filmstudio implements Namen {
    private String studioNaam;

    public String getNaam() {
        return this.studioNaam;
    }

    public Filmstudio(String sn) {
        studioNaam = sn;
    }
}
