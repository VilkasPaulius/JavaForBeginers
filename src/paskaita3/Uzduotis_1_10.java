package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int skaicius = 0;
        boolean tinka = true;
        System.out.println("Suskaiciuosime visu skaiciu nuo vieno iki ivesto skaiciaus suma");
        do {

            System.out.println("iveskite skaiciu");
            skaicius = sc.nextInt();
            if (skaicius < 1) {
                System.out.println("Ivedete bloga skaiciu");
                System.out.println("_____________________");
                tinka = false;
            } else {
                tinka = true;
            }
        } while (!tinka);

        int suma = 0; //int turi savo max riba 2 147 483 647
        for (int i = 1; i <= skaicius; i++) {   //pradedam skaiciuoti nuo vieno, prie sumos pridedam ciklo kintamaji
            suma += i;
        }
        System.out.println("Suma iki ivesto skaiciaus yra :" + suma);

    }
}
