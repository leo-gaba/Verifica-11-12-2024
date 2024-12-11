package Classi;

public class Rettangolo {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    /*il metodo calcolaPerimetro restituisce in valore double il perimetro del rettangolo (base più altezza, il tutto moltiplicato per 2).
    Avere metodi di calcolo in una classe è utile perchè  ci basta richiamare il metodo nel main
    senza rifare ogni volta la stessa operazione, rendendo così il codice più pulito*/
    public double calcolaPerimetro() {
        return (base + altezza)*2;
    }

    //Metodo che compara le aree di 2 rettangoli e ritorna un valore intero (1 se maggiore, 0 se uguale e -1 se minore)
    public int compareTo(Rettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //Metodo che ritorna una stringa con la base, l'altezza e l'area del rettangolo
    public String getInformazioni() {
        return String.format("Rettangolo -- base: %.2f; altezza: %.2f; area: %.2f;", getBase(), getAltezza(), calcolaArea());
    }
}