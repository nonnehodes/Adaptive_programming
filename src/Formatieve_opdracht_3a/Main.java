package Formatieve_opdracht_3a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer aantalWoorden = 5;

        List<String> randomWoorden = new ArrayList<>();
        for (int i = 1; i <= aantalWoorden; i++) {
            randomWoorden.add(Sorting.genereerWoord());
        }
        
        System.out.println("Lijst met random woorden: ");
        System.out.println(randomWoorden);
        System.out.println("----------------------------------------------------");
        System.out.println("Bubble sorting toegepast: ");
        System.out.println(Sorting.bubbleSort(randomWoorden));
        System.out.println("----------------------------------------------------");
        System.out.println("Natural order sorting toegepast: ");
        System.out.println(Sorting.naturalOrder(randomWoorden));
        System.out.println("----------------------------------------------------");
        System.out.println("Boom methode toegepast met input; 50, 30, 20, 40, 31, 70, 60, 80: ");





        BoomMethode tree = new BoomMethode();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(31);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
    }
}
