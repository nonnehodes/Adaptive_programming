package troep;

public class Main {
    public static void main(String[] args) {
        //troep.School hu = new troep.School();
        //System.out.println( "Schoolnaam: " + hu.getNaam());

        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
            System.out.println("Breedte: " + z1.getBreedte());
            System.out.println("Lengte: " + z1.getLengte());
            System.out.println("Diepte: " + z1.getDiepte());
            System.out.println("Inhoud: " + z1.inhoud());
            System.out.println(" ");



        Zwembad z2 = new Zwembad(2.5, 100.0,2.0);
            System.out.println("Gegevens zwembad: Dit zwembad is " + z2.newBreedte() + "m breed, " + z2.newLengte() + "m lang, en " + z2.newDiepte() + "m diep.");
            System.out.println("Inhoud: " + z2.newInhoud());

    }
}

