package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek noresite ivesti skaiciu");
        int ilg = sc.nextInt();
        int[] masyvas = new int[ilg];
        for (int i = 0; i < ilg; i++) {
            System.out.println("iveskite " + (i + 1) + " skaiciu");
            masyvas[i] = sc.nextInt();
        }

        apsuktiMasyva(masyvas);
        System.out.println("programos pabaiga");
    }


    private static void apsuktiMasyva(int[] mas) {

        int[] apsuktas = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            apsuktas[mas.length - i - 1] = mas[i];
        }
        System.out.println("Jusu ivestas masyvas:");
        spMasyva(mas);
        System.out.println();
        System.out.println("Apsuktas masyvas:");
        spMasyva(apsuktas);
        System.out.println();
        System.out.println();
    }

    private static void spMasyva(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + "\t");
        }
    }
}
