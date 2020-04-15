package Formatieve_opdracht_1a;

public class AutoverhuurGameshopMain {
    public static void main(String[] arg) {
        AutoHuur ah1 = new AutoHuur();
        System.out.println("eerste autohuur: " + "\n" + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Klant k1 = new Klant("Mijnheer de Vries");
        k1.setKorting(10.0);
        ah2.setHuurder(k1);
        System.out.println("eerste autohuur: " + "\n" + ah2.toString());
    }
}
