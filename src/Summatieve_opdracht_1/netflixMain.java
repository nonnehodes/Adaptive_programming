package Summatieve_opdracht_1;

public class netflixMain {
    public static void main(String[] arg) {
        Gebruikers p1 = new Gebruikers("Emmi van Veen");
        Gebruikers p2 = new Gebruikers("Berend Klaasse");
        Gebruikers p3 = new Gebruikers("Roderick Doorn");
        Gebruikers p4 = new Gebruikers("Annemijn Vermeulen");

        Genre g1 = new Genre("Misdaad");
        Genre g2 = new Genre("Actie");
        Genre g3 = new Genre("Thriller");
        Genre g4 = new Genre("Sciencefiction");
        Genre g5 = new Genre("Oorlog");

        Hoofdrol h1 = new Hoofdrol("John Travolta");
        Hoofdrol h2 = new Hoofdrol("Matthew McConaughey");
        Hoofdrol h3 = new Hoofdrol("Amy Adams");
        Hoofdrol h4 = new Hoofdrol("Brad Pitt");
        Hoofdrol h5 = new Hoofdrol("Chris Hemsworth");
        Hoofdrol h6 = new Hoofdrol("Liam Neeson");
        Hoofdrol h7 = new Hoofdrol("Keanu Reeves");

        Filmstudio fs1 = new Filmstudio("Miramax Films");
        Filmstudio fs2 = new Filmstudio("Warner Bros Pictures");
        Filmstudio fs3 = new Filmstudio("Universal");
        Filmstudio fs4 = new Filmstudio("Disney");
        Filmstudio fs5 = new Filmstudio("20Th Century Studios");
        Filmstudio fs6 = new Filmstudio("Paramount pictures");

        Film f1 = new Film("Pulp Fiction", 1994, g1, fs1 ,h1);
        Film f2 = new Film("Interstellar", 1994, g4, fs3 ,h2);
        Film f3 = new Film("Ad Astra", 2019, g4, fs5 ,h4);
        Film f4 = new Film("The Arrival", 2016, g3, fs6 ,h3);
        Film f5 = new Film("Thor", 2011, g2, fs4 ,h5);
        Film f6 = new Film("Schindler's List", 1993, g5, fs3 ,h6);
        Film f7 = new Film("The Matrix", 1999, g2, fs2 ,h7);

        p1.setGekekenFilms(f1);
        p1.setGekekenFilms(f2);
        p1.setGekekenFilms(f7);
        p1.setGekekenFilms(f1);
        p2.setGekekenFilms(f4);
        p2.setGekekenFilms(f6);
        p3.setGekekenFilms(f7);
        p3.setGekekenFilms(f2);
        p4.setGekekenFilms(f5);
        p4.setGekekenFilms(f4);
        p4.setGekekenFilms(f2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        System.out.println(p1.kijktFilm(f3));
        System.out.println(p1.kijktFilm(f7));
        System.out.println(p2.kijktFilm(f3));
        System.out.println(p3.kijktFilm(f3));
        System.out.println(p4.kijktFilm(f2));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}

