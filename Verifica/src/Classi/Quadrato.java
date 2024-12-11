package Classi;

public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato * lato;
    }

    //Metodo che compara le aree di 2 quadrati e ritorna un valore intero (1 se maggiore, 0 se uguale e -1 se minore)
    public int compareTo(Quadrato altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //Metodo che ritorna una stringa con il lato e l'area del quadrato
    public String getInformazioni() {
        return String.format("Quadrato -- lato: %.2f; area: %.2f;", getLato(), calcolaArea());
    }
}
