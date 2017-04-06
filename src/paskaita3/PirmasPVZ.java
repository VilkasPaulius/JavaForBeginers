package paskaita3;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Admin on 2017.04.06.
 */
public class PirmasPVZ {
    public static void main(String[] args) {


        /*int a = 30;
        int b = 40;

        if (a <= b && a < b) {
            System.out.println("Taip tai tiesa");
        } else {
            System.out.println("Ne ne");
        }

        System.out.println("Value is >>" + (a < b ? 120 : 100)); */


        //exceptionEx();
        masExample();
    }


    private static void MasSp (int[] masyvas){

        for(int i=0;i < masyvas.length; i++){
            System.out.println("mas ["+i+"] yra >>" + masyvas[i]);
        }
    }

    private static void masExample() {
        int[] mas = new int[3];

        mas[0] = 10;
        mas[1] = 11;
        mas[2] = 12;

        //reiksmes paemimas is masyvo

        System.out.println("pirma reiksme " + mas[0]);
        MasSp(mas);
    }


    private static void exceptionEx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");

        try {
            int numb = sc.nextInt();
            System.out.println("Jusu skaicius yra >> " + numb);

        } catch (InputMismatchException e) {
            System.out.println("Ivestas neteisingai");
        }


    }
}