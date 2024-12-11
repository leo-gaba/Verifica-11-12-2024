package Classi;

public class Poligono {
    private int numeroLati;
    private double lunghezzaLati;

    public Poligono(int numeroLati, double lunghezzaLati)
    {
        this.numeroLati=numeroLati;
        this.lunghezzaLati=lunghezzaLati;
    }
    public int getNumeroLati() {
        return numeroLati;
    }
    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public double getLunghezzaLati() {
        return lunghezzaLati;
    }
    public void setLunghezzaLati(double lunghezzaLati) {
        this.lunghezzaLati = lunghezzaLati;
    }

    //Metodo che calcola il perimetro di un Poligono moltiplicando il numero di lati per la loro lunghezza (lati tutti lunghi uguali)
    public double calcolaPerimetro()
    {
        return numeroLati*lunghezzaLati;
    }

    //Override del metodo toString() che ritorna una stringa contenente il numero di lati, la lunghezza dei lati e il perimetro di un poligono
    @Override
    public String toString() {
        return String.format("Poligono con %d lati di lunghezza %.2f, perimetro %.2f", getNumeroLati(), getLunghezzaLati(), calcolaPerimetro());
    }
}
