package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.06.
 */
public class Uzduotis_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma =0;
        int sk;
        do{
            System.out.println("Iveskite skaiciu");
            sk = sc.nextInt();
            suma += sk; //prie sumos pridedam naujai ivesta skaiciu
        }while (sk!=0);
        System.out.println("Ivestu skaiciu suma: "+suma);
    }
}
