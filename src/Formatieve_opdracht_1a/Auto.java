package Formatieve_opdracht_1a;

public class Auto {

    String autoType;
    double prijsPerDag;

    public Auto(String tp, double prPd) {
        this.autoType = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return this.prijsPerDag;

    }

    public String toString() {
        String s = this.autoType + " met prijs per dag: " + this.prijsPerDag;
        return s;
    }
}
