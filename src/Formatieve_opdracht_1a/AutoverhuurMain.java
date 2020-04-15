package Formatieve_opdracht_1a;

public class AutoverhuurMain {
    public static void main(String[] arg) {

        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        Klant k1 = new Klant("Mijnheer de Vries");
        k1.setKorting(10.0);
        ah1.setHuurder(k1);
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        Auto a1 = new Auto("Peugeot 207 ", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k1);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur: " + "\n" + ah2.toString());

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());

    }
}
