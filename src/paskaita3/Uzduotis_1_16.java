package paskaita3;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.09.
 */
public class Uzduotis_1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        raidziuDerinys(sc.nextLine());
    }

    private static void raidziuDerinys(String zd) {
        int count = 0;
        for (int i = 0; i < zd.length(); i++) {         //tikrinam ar i+1 nera didesne reiksme nei ivesto zodzio ilgis
            if ((i + 1) < zd.length()) {
                if (zd.charAt(i) == 'a' && zd.charAt(i + 1) == 'b') {   //tikrinam ar yra ab deriniu
                    count++;
                }
            }
        }
        System.out.println("Zodyje " + zd + " yra " + count + " ab deriniai");
    }
}
