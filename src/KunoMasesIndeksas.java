import java.util.Scanner;

/**
 * Created by Admin on 2017.04.05.
 */
public class KunoMasesIndeksas {
    public static void main(String[] args) {
        Scanner Ivedimas = new Scanner(System.in);
        KMI kunomasesindeksas = new KMI ();
        System.out.println("Iveskite svori kilogramais :");
        double svoris = Ivedimas.nextDouble();
        System.out.println("Iveskite ugi metrais :");
        double ugis = Ivedimas.nextDouble();

        System.out.println("Jusu kuno mases indeksas yra:"+kunomasesindeksas.KMI(svoris,ugis));
    }

}

class KMI {

    public double KMI (double svoris, double ugis){

        return svoris / (ugis * ugis);
    }

}