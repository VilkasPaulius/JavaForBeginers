package paskaita2;

import java.util.Scanner;

/**
 * Created by Admin on 2017.04.05.
 */
public class Skaiciuotuvas {
    public static void main(String[] args) {

        calc(); //pagrindinis metodas
    }


    //veiksmo simbolio nuskaitymas
    public static char veiksmas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koki veiksma atliksime? ");
        System.out.println(" + sudetis");
        System.out.println(" - atimtis");
        System.out.println(" * daugyba");
        System.out.println(" / dalyba");
        char op = sc.next().charAt(0);
        return op;
    }

    //kintamojo nuskaitymas, paduodamas reikalingas tekstas
    public static double kintamasis(Scanner sc, String tekstas) {
        System.out.println(tekstas);
        return sc.nextDouble();
    }
    //pagrindinis skaiciuotuvas
    public static void calc() {
        double kint1, kint2;
        boolean baigti;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ar norite skaiciuoti (T/N)? "); //reikia ivesti T didziaja
            char poz = sc.next().charAt(0);
            if (poz == 'T') {
                baigti = false;
                kint1 = kintamasis(sc, "Iveskite pirma kintamaji");
                kint2 = kintamasis(sc, "Iveskite antra kintamaji");
                switch (veiksmas()) {
                    case '+':
                        System.out.println("Rezultatas: " + suma(kint1, kint2));
                        break;
                    case '-':
                        System.out.println("Rezultatas: " + atimtis(kint1, kint2));
                        break;
                    case '*':
                        System.out.println("Rezultatas: " + daugyba(kint1, kint2));
                        break;
                    case '/':
                        System.out.println("Rezultatas: " + dalyba(kint1, kint2));
                        break;
                    default:
                        baigti = true;
                        System.out.println("Skaiciavimu pabaiga!!!");
                }
            } else {
                baigti = true;
                System.out.println("Skaiciavimu pabaiga!!!");
            }
            System.out.println();
        } while (baigti != true);
    }
    //veiksmu metodai
    public static double suma(double s1, double s2) {
        return s1 + s2;
    }

    public static double dalyba(double d1, double d2) {
        return d1 / d2;
    }

    public static double daugyba(double x1, double x2) {
        return x1 * x2;
    }

    public static double atimtis(double a1, double a2) {
        return a1 - a2;
    }


}
