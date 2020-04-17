package Formatieve_opdracht_1a;

import java.util.ArrayList;
import java.util.List;

public class Persoon {
    Persoon persoon;
    String persoonNaam;
    List games = new ArrayList<Game>();
    double budget;
    Game game;
    Helper hp = new Helper();


    public Persoon(String psn, double bg) {
        this.persoonNaam = psn;
        this.budget = bg;
    }

    public String koop(Game gm) {
        this.game = gm;
        String output = "";
        if (!hp.checkIfGameBought(this.games, this.game)) {
            if (this.game.getPrijs() >= getBudget()) {
                output = "Niet gelukt";
            } else {
                output = "Gelukt";
                this.games.add(this.game);
                this.budget = getBudget() - this.game.getPrijs();
                setBudget(this.budget);
            }
        } else {
            output = "Niet gelukt";
        }
        return output;
    }

    public void verkoop(Game gm) {
        this.games.remove(gm);
    }

    public void setBudget(double bg) {
        this.budget = bg;
    }

    public double getBudget() {
        return this.budget;
    }

    public List getGames() {
        return this.games;
    }

    public String toString() {
        return "";
    }
}