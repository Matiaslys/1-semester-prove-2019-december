import java.util.Arrays;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {

        for (int i = 0; i < brugere.length ; i++) {
            System.out.print(brugere[i] + " ");
        }
        System.out.println("");
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {
        for (int i = brugere.length - 1; i >= 0 ; i--) {
            System.out.print(brugere[i] + " ");
        }
        System.out.println("");

    }

    public void waitingFor0() {
        Scanner scanner = new Scanner(System.in);
        int tal = 1000;
        while (!(tal == 0)) {
            System.out.print("Venter på 0! Skriv et tal... ");
             tal = scanner.nextInt();
        }
        System.out.println("Du har tastet 0. Så er det slut!");
 
    }
}
