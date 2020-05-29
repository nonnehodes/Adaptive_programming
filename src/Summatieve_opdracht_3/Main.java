package Summatieve_opdracht_3;

public class Main {

    public static void main(String[] args) {

        String[] types = {"vliegtuig", "trein", "auto"};

        for (String type : types) {
            Reis reis = new Reis(type);
            reis.run();
        }
    }


}


