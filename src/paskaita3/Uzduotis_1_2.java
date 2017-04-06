package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.06.
 */
public class Uzduotis_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zodis;
        do {
            System.out.println("Iveskite zodi ");
            zodis = sc.next();
            if (zodis.equals("pabaiga")){
                System.out.println("aciu uz varga");
            }else{
                System.out.println(zodis);
                System.out.println("-----------");
            }
        }while (!zodis.equals("pabaiga"));
    }
}
