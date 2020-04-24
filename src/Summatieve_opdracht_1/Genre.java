package Summatieve_opdracht_1;

public class Genre implements Namen{
    private String genreNaam;

    public String getNaam() {
        return this.genreNaam;
    }

    public Genre(String gn){
        this.genreNaam = gn;
    }

}
