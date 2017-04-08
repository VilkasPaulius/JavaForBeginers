package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek noresite ivesti skaiciu");
        int ilg = sc.nextInt();
        int[] masyvas = new int[ilg];
        for (int i = 0; i < ilg; i++) {
            System.out.println("iveskite " + (i + 1) + " skaiciu");
            masyvas[i] = sc.nextInt();
        }

        minReiksme(masyvas);
    }

    private static void minReiksme(int[] mas) {
        int min = mas[0];
        int indx = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                indx = i;
            } else {
                System.out.println();
            }
        }
        System.out.println("Maziausias yra [" + (indx + 1) + "] masyvo elementas. Jo reiksme " + min);
    }

}
