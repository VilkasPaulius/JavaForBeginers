package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek noresite ivesti skaiciu");
        int ilg = sc.nextInt();
        double[] masyvas = new double[ilg];
        for (int i = 0; i < ilg; i++) {
            System.out.println("iveskite " + (i + 1) + " skaiciu");
            masyvas[i] = sc.nextDouble();
        }
        System.out.print("Ivesti skaiciai \t");
        for (int i = 0; i < ilg; i++) {
            System.out.print(masyvas[i] + "\t");
        }
        System.out.println();

        System.out.print("Didesni nei 100 \t");
        for (int i = 0; i< ilg; i++)
        {
            if (masyvas[i] > 100) {
                System.out.print(masyvas[i] + "\t");
            } else {
                System.out.print("--- \t");
            }
        }
    }
}
