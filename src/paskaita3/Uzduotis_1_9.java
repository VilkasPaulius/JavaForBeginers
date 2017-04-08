package paskaita3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Admin on 2017.04.07.
 */
public class Uzduotis_1_9 {
    public static void main(String[] args) {

        while (tikrinamTN() == 'T') {
            Tikrinti();
        }
        System.out.println("Programa baige darba.");
    }

    private static void Tikrinti() {
        Scanner sc = new Scanner(System.in);
        boolean poz = false;
        while (!poz) {
            try {
                System.out.println("Iveskite norima atlikti veiksma");
                String[] veiksmas = sc.nextLine().split("\\s"); //eilutes isskaidymas i String masyva pagal tarpus
                double sk1 = Double.parseDouble(veiksmas[0]); //String reiksmes keitimas i double
                double sk2 = Double.parseDouble(veiksmas[2]);
                kalkuliatorius(sk1, veiksmas[1], sk2); //skaiciujam pateikta veiksmu seka
                poz = true;
            } catch (Exception e) {
                System.out.println("Ivedet bloga salyga");
                poz = false;
            }
        }

    }

    //sukurtas skaiciuotuvas
    public static void kalkuliatorius(double kint1, String op, double kint2) {
        switch (op) {
            case "+":
                System.out.println("Suma: " + (kint1 + kint2));
                break;
            case "-":
                System.out.println("Skirtumas: " + (kint1 - kint2));
                break;
            case "*":
                System.out.println("Sandauga: " + (kint1 * kint2));
                break;
            case "/":
                if (kint2 == 0) {
                    System.out.println("Dalyba is nulio negalima");
                } else {
                    System.out.println("Dalyba: " + kint1 / kint2);
                }
                break;
            default:
                System.out.println("nieko nedarem");
                break;
        }
    }

    //tikrinam Taip/Ne reiksme; Ivesta reiksme padarom didziaja
    public static char tikrinamTN() {
        Scanner sc = new Scanner(System.in);
        char raide = 'N';
        int ilg = 0;
        boolean x = false;
        while (!x) {
            System.out.println("Ar atliksite skaiciavimus? T/N");
            String tn = sc.nextLine();
            raide = Character.toUpperCase(tn.charAt(0)); //Imam pirma ivestos eilutes simboli ir darom ji didziaja raide
            if ((raide == 'T' || raide == 'N') && tn.length() == 1) {
                x = true;
            } else {
                System.out.println("Jusu pasirinkimas netinkamas");
                x = false;
            }
        }
        return raide;
    }


}