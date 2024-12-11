package Classi;

public class Punto {
    private double x;
    private double y;

    public Punto(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    //Metodo che calcola la distanza tra due punti (teorema di pitagora)
    public double distanza(Punto altro)
    {
        return Math.sqrt(Math.pow(this.getX() - altro.getX(), 2)+Math.pow(this.getY() - altro.getY(), 2));
    }
}
