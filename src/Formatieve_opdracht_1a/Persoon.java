package Formatieve_opdracht_1a;

public class Persoon {
    Persoon persoon;
    String persoonNaam;
    String games;
    double budget;
    Game game;

    public Persoon(String psn, double bg) {
        this.persoonNaam = psn;
        this.budget = bg;
    }

    public void koop(Game gm) {
        this.game = gm;
    }

    public void verkoop(Game gm, Persoon ps) {
        this.game = gm;
        this.persoon = ps;
    }

    public void setBudget(double bg) {
        this.budget = bg;
    }

    public double getBudget() {
        return this.budget;
    }

    public String getGames() {
        return this.games;
    }

    public String toString() {
        String output = "";
        if (game.getGame() != getGames()) {
            if (game.getPrijs() >= getBudget()) {
                output = output + "Niet gelukt";
            } else {
                output = output + "Gelukt";
                // buget =  budget - prijs spel

            }
        } else {
            output = output + "Niet gelukt";
        }
        return output;
    }
}