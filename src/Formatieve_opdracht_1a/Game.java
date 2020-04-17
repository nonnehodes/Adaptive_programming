package Formatieve_opdracht_1a;


import java.text.DecimalFormat;
import java.time.*;
import java.lang.Math;


public class Game {

    private static DecimalFormat df = new DecimalFormat("0.00");

    String gameNaam;
    double prijs;
    Integer releaseJaar;
    double korting;

    Integer releaseJaar1 = LocalDate.now().getYear() -1;
    Integer releaseJaar2 = LocalDate.now().getYear() -2;


    public Game(String gnm, Integer rj, double ps) {
        this.gameNaam = gnm;
        this.releaseJaar = rj;
        this.prijs = ps;
    }

    public Integer getReleaseJaar(){
        return this.releaseJaar;
    }

    public String getGame() {
        return this.gameNaam;
    }

    public double getPrijs() {
        return this.prijs;
    }


    public double berekenKorting() {
        if(getReleaseJaar().equals(this.releaseJaar1)) {
            this.korting = 0.7;
        } if (getReleaseJaar().equals(releaseJaar2)) {
            this.korting = Math.pow(0.7, 2.0);
        }
        return Math.round(this.prijs * this.korting);
    }

    public String toString() {
        return gameNaam + ", uitgegeven in " + releaseJaar + " nieuwprijs: " + prijs + " nu voor: " + berekenKorting();
    }
}
