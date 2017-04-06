package paskaita3;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Admin on 2017.04.06.
 */
public class Uzduotis_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma =0;
        int sk = 0;
        do{
            try {
                System.out.println("Iveskite skaiciu");
                sk = sc.nextInt();
                suma += sk; //prie sumos pridedam naujai ivesta skaiciu
            }catch (InputMismatchException a){
                System.out.println("Ivedete ne skaiciu");
                sc.next(); //atlaisvina buferi - be sitos eilutes gaunasi amzinas ciklas
            }
        }while (sk!=0);
        System.out.println("Ivestu skaiciu suma: "+suma);
    }
}
