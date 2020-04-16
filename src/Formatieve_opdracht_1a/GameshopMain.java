package Formatieve_opdracht_1a;

import javax.swing.*;

public class GameshopMain {
    public static void main(String[] arg) {

        Game g1 = new Game("Just Cause 3", 6, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", 6, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", 6, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);
        Persoon p3 = new Persoon("Arno", 185);

        p1.koop(g1);
        p1.koop(g2);
        p1.koop(g3);
        p2.koop(g2);
        p2.koop(g1);
        p3.koop(g3);

        System.out.println("p1 koopt g1: " + p1.toString());
        System.out.println("p1 koopt g2: " + p1.toString());
        System.out.println("p1 koopt g3: " + p1.toString());
        System.out.println("p2 koopt g2: " + p2.toString());
        System.out.println("p2 koopt g1: " + p2.toString());
        System.out.println("p3 koopt g3: " + p3.toString());

        p1.verkoop(g1, p3);
        p2.verkoop(g2, p3);
        p2.verkoop(g1, p1);

    }
}