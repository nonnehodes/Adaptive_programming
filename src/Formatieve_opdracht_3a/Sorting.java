package Formatieve_opdracht_3a;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Sorting {

    public static String genereerWoord() {
        int lengteWoorden = new Random().nextInt(10) + 1;
        Random rand = new Random();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomWoord = new StringBuilder();

        char[] text = new char[lengteWoorden];

        for (int i = 0; i < lengteWoorden; i++) {
            text[i] = alfabet.charAt(rand.nextInt(alfabet.length()));
        }

        for (char c : text) {
            randomWoord.append(c);
        }

        return randomWoord.toString();
    }

    public static List<String> bubbleSort(List<String> randomWoorden) {
        String temp = "";
        for (int i = 0; i < randomWoorden.size(); i++) {
            for (int j = i + 1; j < randomWoorden.size(); j++) {
                if (randomWoorden.get(i).compareTo(randomWoorden.get(j)) > 0) {
                    temp = randomWoorden.get(j);
                    randomWoorden.set(j, randomWoorden.get(i));
                    randomWoorden.set(i, temp);
                }
            }

        }
        return randomWoorden;
    }

    public static List<String> naturalOrder(List<String> randomWoorden) {
        randomWoorden.sort(Comparator.naturalOrder());
        return randomWoorden;
    }
}