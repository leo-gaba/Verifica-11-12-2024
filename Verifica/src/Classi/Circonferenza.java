package Classi;

public class Circonferenza {
    private double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    //Metodo che compara le aree di 2 circonferenze e ritorna un valore intero (1 se maggiore, 0 se uguale e -1 se minore)
    public int compareTo(Circonferenza altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    //Metodo che ritorna una stringa con il lato e l'area della circonferenza
    public String getInformazioni() {
        return String.format("Circonferenza -- lato: %.2f; area: %.2f;", getRaggio(), calcolaArea());
    }
}
