package Formatieve_opdracht_1a;

public class AutoHuur {
    Integer aantalDagen;
    Auto auto;
    Klant klant;

    public void setAantalDagen(Integer aD) {
        this.aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.auto = gA;
    }

    public Auto getGehuurdeAuto() {
        return this.auto;
    }

    public void setHuurder(Klant k) {
        this.klant = k;
    }

    public Klant getHuurder() {
        return this.klant;
    }

    public double totaalPrijs() {
        return 10.0;
    }


    public String toString() {
        String output = "";
        if (getGehuurdeAuto() == null) {
            output = output + "er is geen auto bekend" + "\n";
        } else {
            output = output + "autotype: " + getGehuurdeAuto().toString() + "\n";
        }

        if (getHuurder() == null) {
            output = output + "er is geen huurder bekend" + "\n";
        } else {
            output = output + getHuurder().toString();
        }

        if (this.aantalDagen == null) {
            output = output + "aantal dagen: 0 en dat kost 0.0" + "\n";
        } else {
            output = output + "aantal dagen: " + this.aantalDagen + "en dat kost " + auto.getPrijsPerDag() + "\n";
        }
        return output;
    }
}

