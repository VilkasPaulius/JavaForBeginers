package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek noresite ivesti skaiciu");
        int ilg = sc.nextInt();
        double[] masyvas = new double[ilg];
        for (int i = 0; i < ilg; i++) {
            System.out.println("iveskite " + (i + 1) + " skaiciu");
            masyvas[i] = sc.nextDouble();
        }
        masSp(masyvas);
    }

    private static void masSp (double[] mas ){

        System.out.print("Ivesti skaiciai \t");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + "\t");
        }
        System.out.println();

        System.out.print("Didesni nei 100 \t");
        for (int i = 0; i< mas.length; i++)
        {
            if (mas[i] > 100) {
                System.out.print(mas[i] + "\t");
            } else {
                System.out.print("\t \t");
            }
        }
    }
}
