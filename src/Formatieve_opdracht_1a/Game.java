package Formatieve_opdracht_1a;

public class Game {
    String gameNaam;
    double prijs;
    Integer releaseJaar;

    public Game(String gnm, Integer rj, double ps) {
        this.gameNaam = gnm;
        this.releaseJaar = rj;
        this.prijs = ps;
    }

    public String getGame() {
        return this.gameNaam;
    }

    public double getPrijs() {
        return this.prijs;
    }

    public String toString() {
        String s =" met prijs per dag: " ;
        return s;
    }
}
