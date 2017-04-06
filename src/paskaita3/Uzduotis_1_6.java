package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] masyvas = new String[5];
        System.out.println("Iveskite 5 zodzius, po ivedimo spauskite Enter ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Iveskite " + (i + 1) + " zodi");
            masyvas[i] = sc.next();
        }

        System.out.println("Jus ivedete tokius zodzius :");
        for (int i = 0; i < 5; i++) {
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();

    }
}
