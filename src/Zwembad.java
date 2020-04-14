public class Zwembad {
    private double Breedte = 2.0;
    public double getBreedte(){
        return this.Breedte;
    }

    private double Lengte = 5.5;
    public double getLengte() { return this.Lengte; }

    private double Diepte = 1.5;
    public double getDiepte() { return this.Diepte; }

    private double Inhoud =  Breedte * Lengte * Diepte;
    public double getInhoud() { return this.Inhoud; }
}

