package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] masyvas = new double[6]; //kadangi zinome kokio ilgio riekes masyvo, tai padarome ji ligesni ir paskutinej vietoj laikysime skaiciu suma
        System.out.println("Iveskite 5 skaicius, po skaiciaus ivedimo spauskite Enter ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Iveskite " + (i + 1) + " kintamaji");
            masyvas[i] = sc.nextDouble();
            masyvas[5] += masyvas[i];
            //System.out.println("suma >> " + masyvas[5]);
        }

        System.out.println("Jus ivedete tokios skaicius :");
        for (int i = 0; i<5; i++){
            System.out.print(masyvas[i]+"\t"); //nera ln prie print - spausdina vienoje eiluteje. /t - reiskia tab'a
        }
        System.out.println();
        System.out.println("Ivestu skaiciu suma yra "+masyvas[5]);

    }
}
