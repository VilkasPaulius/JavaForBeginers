package Namu_darbai;


import java.util.Scanner;

/**
 * Created by Admin on 2017.04.25.
 */
public class Nd_1 {
    public static void main(String[] args) {
        Nd_1 metodai = new Nd_1();
        int ilgis = metodai.skaicius();
        Double[] Svoriai = new Double[ilgis];
        Integer[] Skoniai = new Integer[ilgis];
        metodai.Ivedimas(Svoriai, Skoniai);
        /*for (int i = 0; i < Svoriai.length; i++) {
            System.out.println(Svoriai[i] + " " + Skoniai[i]);
        }*/
        metodai.PradiniaiDuomenys(Svoriai, Skoniai);
        metodai.Spausdinti(metodai.ZuvuSvoris(Svoriai, Skoniai), metodai.ZuvuKiekis(Svoriai, Skoniai));

    }

    private int skaicius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek katinas pagavo žuvų?");
        return scanner.nextInt();
    }

    private void Ivedimas(Double[] mas1, Integer[] mas2) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mas1.length; i++) {
            System.out.println("Iveskite zuvies svori:");
            mas1[i] = scanner.nextDouble();
            System.out.println("Ar skani zuvis?");
            System.out.println("Taip - 1; Ne - 0");
            mas2[i] = scanner.nextInt();
        }
    }

    private double ZuvuSvoris(Double[] mas1, Integer[] mas2) {
        double bendrasSvoris = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] > 1 && mas2[i] == 1) {
                bendrasSvoris += mas1[i];
            }
        }
        return bendrasSvoris;
    }

    private int ZuvuKiekis(Double[] mas1, Integer[] mas2) {
        int kiek = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] > 1 && mas2[i] == 1) {
                kiek++;
            }
        }
        return kiek;
    }

    private void Spausdinti(double svoris, int kiekis) {
        System.out.println("Katinas pagavo " + kiekis + " žuvų, kurių bendras svoris buvo " + svoris);
    }

    private void PradiniaiDuomenys(Double[] mas1, Integer[] mas2) {
        for (int i = 0; i < mas1.length; i++) {
            System.out.println((i + 1) + " Žuvis svėrė " + mas1[i] + " kg. ir ji buvo " + (mas2[i] == 1 ? "skani" : "neskani"));
        }
    }
}
