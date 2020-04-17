package Formatieve_opdracht_1a;

import java.time.*;
import java.util.ArrayList;

public class GameshopMain {
    public static void main(String[] arg) {
        Integer releaseJaar1 = LocalDate.now().getYear() -1;
        Integer releaseJaar2 = LocalDate.now().getYear() -2;

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);
        Persoon p3 = new Persoon("Arno", 185);


        System.out.println("p1 koopt g1: " + p1.koop(g1));
        System.out.println("p1 koopt g2: " + p1.koop(g2));
        System.out.println("p1 koopt g3: " + p1.koop(g3));
        System.out.println("p2 koopt g2: " + p2.koop(g2));
        System.out.println("p2 koopt g1: " + p2.koop(g1));
        System.out.println("p3 koopt g3: " + p3.koop(g3));

        System.out.println("\n" + "p1: "+ p1.persoonNaam + " heeft een budget van " + p1.getBudget() + " en bezit de volgende games:");
        for (Object item : p1.getGames()) {
            System.out.println("\t" + item.toString());
        }

        System.out.println("\n" + "p2: "+ p2.persoonNaam + " heeft een budget van " + p2.getBudget() + " en bezit de volgende games:");
        for (Object item : p2.getGames()) {
            System.out.println("\t" + item.toString());
        }

        System.out.println("\n" + "p3: "+ p3.persoonNaam + " heeft een budget van " + p3.getBudget() + " en bezit de volgende games:");
        for (Object item : p3.getGames()) {
            System.out.println("\t" + item.toString());
        }

        p1.verkoop(g1, p3);
        p2.verkoop(g2, p3);
        p2.verkoop(g1, p1);

        System.out.println("\np1 verkoopt g1 aan p3: "); //+ p3.verkoop(g1, p3)
        System.out.println("\np1 verkoopt g1 aan p3: "); //+ p3.verkoop(g2, p3)
        System.out.println("\np1 verkoopt g1 aan p1: "); //+ p1.verkoop(g1, p1)

        System.out.println("\n" + p1.persoonNaam + " heeft een budget van " + p1.getBudget() + " en bezit de volgende games:");
        for (Object item : p1.getGames()) {
            System.out.println("\t" + item.toString());
        }

        System.out.println("\n" + p2.persoonNaam + " heeft een budget van " + p2.getBudget() + " en bezit de volgende games:");
        for (Object item : p2.getGames()) {
            System.out.println("\t" + item.toString());
        }

        System.out.println("\n" + p3.persoonNaam + " heeft een budget van " + p3.getBudget() + " en bezit de volgende games:");
        for (Object item : p3.getGames()) {
            System.out.println("\t" + item.toString());
        }
    }
}