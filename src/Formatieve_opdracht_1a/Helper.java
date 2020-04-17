package Formatieve_opdracht_1a;

import java.util.List;

public class Helper {
    public String doorVerkopen(Game game, Persoon verkoper, Persoon koper) {
        if (this.checkIfGameBought(verkoper.getGames(), game)) {
            if (koper.koop(game) == "Gelukt") {
                verkoper.verkoop(game);
                return "Gelukt";
            } else {
                return "Niet gelukt";
            }
        } else {
            return "Niet gelukt";
        }

    }
    public boolean checkIfGameBought(List<Game> games, Game game) {
        return games.stream().anyMatch(o -> o.gameNaam.equals(game.gameNaam));
    }
}
