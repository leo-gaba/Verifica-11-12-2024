import Classi.*;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Main {
    public static void main(String[] args){
        //Creazione degli oggetti
        Quadrato quadrato1 = new Quadrato(10);
        Quadrato quadrato2 = new Quadrato(6);

        Rettangolo rettangolo1 = new Rettangolo(15, 18);
        Rettangolo rettangolo2 = new Rettangolo(20, 25);

        TriangoloRettangolo triangolo1 = new TriangoloRettangolo(3, 4);
        TriangoloRettangolo triangolo2 = new TriangoloRettangolo(10, 4);

        Circonferenza circonferenza1= new Circonferenza(20);
        Circonferenza circonferenza2= new Circonferenza(5);

        Punto punto1=new Punto(10, 20);
        Punto punto2=new Punto(5, 10);

        Poligono poligono=new Poligono(5,3);

        //Stampa di tutti gli oggetti grazie al metodo getInformazioni()
        System.out.println(rettangolo1.getInformazioni());
        System.out.println(rettangolo2.getInformazioni());

        System.out.println(quadrato1.getInformazioni());
        System.out.println(quadrato2.getInformazioni());

        System.out.println(triangolo1.getInformazioni());
        System.out.println(triangolo2.getInformazioni());

        System.out.println(circonferenza1.getInformazioni());
        System.out.println(circonferenza2.getInformazioni());

        //Richiamo metodi compareTo() per paragonare le aree
        if (rettangolo1.compareTo(rettangolo2) > 0) {
            System.out.println("Il rettangolo1 ha un'area maggiore del rettangolo2 ");
        } else {
            System.out.println("Il rettangolo1 ha un'area minore o uguale a quella del rettangolo2.");
        }

        if (quadrato1.compareTo(quadrato2) > 0) {
            System.out.println("Il quadrato1 ha un'area maggiore del quadrato2 ");
        } else {
            System.out.println("Il quadrato1 ha un'area minore o uguale a quella del quadrato2.");
        }

        if (triangolo1.compareTo(triangolo2) > 0) {
            System.out.println("Il triangolo1 ha un'area maggiore del triangolo2 ");
        } else {
            System.out.println("Il triangolo1 ha un'area minore o uguale a quella del triangolo2.");
        }

        if (circonferenza1.compareTo(circonferenza2) > 0) {
            System.out.println("La circonferenza1 ha un'area maggiore della circonferenza2.");
        } else {
            System.out.println("La circonferenza1 ha un'area minore o uguale a quella della circonferenza2.");
        }

        //stampa del metodo distanza() della classe Punto
        System.out.printf("La distanza tra i due punti è %.2f\n", punto1.distanza(punto2));

        //stampa del metodo toString() della classe Poligono
        System.out.println(poligono);
    }
}