public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Diepte;
    private double inhoud;

    public double getBreedte(){ return this.Breedte; }
    public double getLengte() { return this.Lengte; }
    public double getDiepte() { return this.Diepte; }
    public double inhoud() { return this.inhoud; }

    public Zwembad(double bd, double lg, double dp)
    {
        Breedte = bd;
        Lengte = lg;
        Diepte = dp;
        inhoud = bd * lg * dp;
    }

}

