package Paulius_paskaita1;

import jdk.nashorn.internal.objects.NativeRegExp;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by User on 2017-04-04.
 */
public class FirsExample {

    public static void main(String[] args) {
       // System.out.println("Labas rytas");
        FirsExampleSupportClass example = new FirsExampleSupportClass();
       // example.sayHi();
      /*  int sum = example.sum(25,25);
        System.out.println(sum);
        System.out.println(example.sum(25,25));*/

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Iveskite  pirma sveika skaiciu");
        int insertNumb1 = scanner.nextInt();
        System.out.println ("Iveskite  antra sveika skaiciu");
        int insertNumb2 = scanner.nextInt();

        System.out.println("Sveiku skaiciu suma: "+example.sum(insertNumb1,insertNumb2));
        System.out.println ("Sveiku skaiciu skirtumas: "+example.skirtumas(insertNumb1,insertNumb2));

        System.out.println ("Iveskite  pirma skaiciu");
        float insertNumb11 = scanner.nextFloat();
        System.out.println ("Iveskite  antra skaiciu");
        float insertNumb22 = scanner.nextFloat();

        System.out.println("Skaiciu suma: "+example.sum(insertNumb11,insertNumb22));
        System.out.println ("Skaiciu skirtumas: "+example.skirtumas(insertNumb11,insertNumb22));
        //System.out.println("Ivestas skaicius >>"+insertNumb1);

        //example.userName(scanner);*/

        //example.ilgis(scanner);



    }
}


class FirsExampleSupportClass{

    public void userName(Scanner sc){
        System.out.println("Iveskite varda:");
        String name = sc.next();
        System.out.println("Labas" + name);

    }

    public void ilgis (Scanner sc){
        System.out.println("Iveskite zodi:");
        String name = sc.next();
        System.out.println("zodzio ilgis " + name.length());

    }
    public void sayHi(){
        System.out.println("Labas vakaras");
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public int skirtumas (int num1, int num2){
        return num1 - num2;
}
    public float sum(float num1, float num2) {
        return num1 + num2;
    }
    public float skirtumas (float num1, float num2){
        return num1 - num2;
    }


}
