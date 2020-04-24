package Summatieve_opdracht_1;

public class Film {
    private String filmNaam;
    private Genre genre;
    private Filmstudio filmstudio;
    private Hoofdrol acteur;
    private Integer filmJaar;

    public String getGenre() {
        return this.genre.getGenre();
    }

    public String getFilmStudio() {
        return this.filmstudio.getStudioNaam();
    }

    public String getHoofdrol() {
        return this.acteur.getActeurNaam();
    }

    public String getFilmNaam() {
        return filmNaam;
    }

    public Integer getFilmJaar() {
        return filmJaar;
    }

    public Film(String fn, Integer fj, Genre gr, Filmstudio fs, Hoofdrol hr){
        filmNaam = fn;
        filmJaar = fj;
        genre = gr;
        acteur = hr;
        filmstudio = fs;

    }

}
