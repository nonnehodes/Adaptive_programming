package Summatieve_opdracht_1;

import java.util.ArrayList;
import java.util.List;

public class Gebruikers {
    private String gebruikersNaam;
    private List gekekenFilms = new ArrayList<Film>();

    public void setGekekenFilms(Film fm) {
        if (!checkIfFilmWatched(this.getGekekenFilms(), fm)) {
            this.gekekenFilms.add(fm);
        }
    }

    public List<Film> getGekekenFilms() {
        return this.gekekenFilms;
    }

    public Gebruikers(String gn) {
        gebruikersNaam = gn;
    }

    public boolean checkIfFilmWatched(List<Film> gekekenFilms, Film film) {
        return gekekenFilms.stream().anyMatch(o -> o.getFilmNaam().equals(film.getFilmNaam()));
    }

    public String kijktFilm(Film film) {
        String output = "";
        if (!checkIfFilmWatched(this.getGekekenFilms(), film)) {
            output = this.gebruikersNaam + " kijkt " + film.getFilmNaam() + "\n";
            this.setGekekenFilms(film);
        } else {
            output = this.gebruikersNaam + " heeft " + film.getFilmNaam() + " al gezien" + "\n";
        }
        return output;
    }

    public String toString() {
        String v = this.gebruikersNaam + " heeft de volgende films gekeken: \n";
        for (Film fm : this.getGekekenFilms()) {
            v += "- " + (fm.getFilmNaam() + ". Met als hoofdrolspeler " + fm.getHoofdrol() +
                    ". De film is uitgegeven door " + fm.getFilmStudio() + " in " + fm.getFilmJaar() + " en komt uit de genre " + fm.getGenre()) + ". \n";
        }
        return v;
    }
}
