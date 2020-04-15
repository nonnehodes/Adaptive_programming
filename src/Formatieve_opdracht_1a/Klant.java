package Formatieve_opdracht_1a;

public class Klant {
    String naam;
    double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        return this.kortingsPercentage;
    }

    public String toString() {
        String s = "op naam van: " + this.naam + "(korting: " + this.kortingsPercentage + ")";
        return s;
    }

}
