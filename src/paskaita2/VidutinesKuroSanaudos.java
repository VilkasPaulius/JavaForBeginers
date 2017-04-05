package paskaita2;


import java.util.Scanner;

/**
 * Created by Admin on 2017.04.05.
 */
public class VidutinesKuroSanaudos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vidutines kuro sanaudos " + ivedimas());
    }

    public static double ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite  kilometrus");
        double km = sc.nextDouble();
        System.out.println("Iveskite  litrus");
        double ltr = sc.nextDouble();
        return vidurkis(km, ltr);
    }

    public static double vidurkis(double km, double ltr) {
        return (ltr * 100) / km;
    }
}
