import java.util.Scanner;

//    Zadatak 3: Unijeti u program broj ocjena po želji, ispisati prosjek ocjena. (int prosjekOcjena = Integer.parseInt(sc.nextLine());)

public class Zadatak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite koliko ocjena zelite unijeti:");
        int kolicinaOcjena = sc.nextInt();

        int[] ocjene = new int[kolicinaOcjena];
        int zbrojOcjena = 0;

        for (int i = 0; i < ocjene.length; i++) {
            System.out.println("Unesite ocjenu broj " + (i+1) + ": ");
            int unesenaOcjena = sc.nextInt();
            ocjene[i] = unesenaOcjena;
            zbrojOcjena += unesenaOcjena;
        }

        double prosjekOcjena = (double) zbrojOcjena / kolicinaOcjena;

        System.out.println("Prosjek unesenih ocjena: " + prosjekOcjena);

    }
}
