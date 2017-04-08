package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int skaicius = 0;
        boolean tinka = true;

        System.out.println("Suskaiciuosime visu skaiciu nuo vieno iki ivesto skaiciaus suma arba sandauga");
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

        System.out.println("Iveskite + jei skaiciuosime skaiciu suma");
        System.out.println("Iveskite x jei skaiciuosime skaiciu sandauga");
        char poz = sc.next().charAt(0);
        int suma = 0; //int turi savo max riba 2 147 483 647
        if (poz == '+') {
            for (int i = 1; i <= skaicius; i++) {   //pradedam skaiciuoti nuo vieno, prie sumos pridedam ciklo kintamaji
                suma += i;
            }
            System.out.println("Suma iki ivesto skaiciaus yra : " + suma);
        } else if (poz == 'x') {
            suma=1;
            for (int i = 1; i <= skaicius; i++) {   //maksimalus skaicius 12
                suma = suma*i;
            }
            System.out.println("Sandauga iki ivesto skaiciaus yra : "+suma);
        }
           }

}

