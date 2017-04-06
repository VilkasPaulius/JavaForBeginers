package paskaita3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.06.
 */
public class Uzduotis_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int sk = sc.nextInt();
        if (sk%2==0) {
            System.out.println("Skaicius yra lyginis");
        }else{
            System.out.println("Skaicius nelyginis");
        }
    }

}
