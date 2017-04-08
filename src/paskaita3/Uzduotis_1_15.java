package paskaita3;


import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_15 {
    public static void main(String[] args) {

        raides();
    }


    private static void raides() {
        Scanner sc = new Scanner(System.in);
        String zodis;
        char raide;
        System.out.println("Iveskite zodi");
        zodis = sc.next();
        System.out.println();
        System.out.println("iveskite raide");
        raide = sc.next().charAt(0);
        int ilg = zodis.length();
        int kiek = 0;
        for (int i = 0; i < zodis.length(); i++) {
            if (raide == zodis.charAt(i)) {
                kiek++;
            }//ar reikia else?
        }
        System.out.println("Zodyje " + zodis + " raidziu " + raide + " yra: " + kiek);


    }
}
