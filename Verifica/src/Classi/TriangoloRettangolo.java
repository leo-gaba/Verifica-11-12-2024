package Classi;

public class TriangoloRettangolo {
    private double base;
    private double altezza;

    public TriangoloRettangolo(double base, double altezza) {
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
        return (base * altezza) / 2;
    }

    //Metodo che compara le aree di 2 triangoli rettangoli e ritorna un valore intero (1 se maggiore, 0 se uguale e -1 se minore)
    public int compareTo(TriangoloRettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //Metodo che ritorna una stringa con la base, l'altezza e l'area del triangolo rettangolo
    public String getInformazioni() {
        return String.format("Triangolo -- base: %.2f; altezza: %.2f; area: %.2f;", getBase(), getAltezza(), calcolaArea());
    }
}
