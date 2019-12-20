/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    //har lavet nogle datatyper om til int og double da det passede bedre.
    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    String fritidsStringeresser; // Snitning, LOL, strikke
    String smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    String hojde; // 1.56 m
    String vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    String eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    String opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    // har lavet resten af denne person færdigt
    @Override
    public String toString() {
        return "Navn: " + navn + "\n" +
                "By: " + by + "\n" +
                "Alder: " + alder + "\n" +
                "Postnummer: " + postNummer + "\n" +
                "Vej: " + vej + "\n" +
                "Husnummer: " + husnummer + "\n" +
                "Nationalitet: " + nationalitet + "\n" +
                "FritidsStringeresser: " + fritidsStringeresser + "\n" +
                "SmarthomeDevices " + smarthomeDevices + "\n" +
                "Hojde: " + hojde + "\n" +
                "Vaegt: " + vaegt + "\n" +
                "Karraktergennemsnit: " + karaktergennemsnit + "\n" +
                "EksamensKarakterer: " + eksamensKarakterer + "\n" +
                "OpdateretDato: " + opdateretDato;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        person.alder = 18;
        person.postNummer = 4700;
        person.vej = "Femøvej";
        person.husnummer = "3B";
        person.nationalitet = "Dansk";
        person.fritidsStringeresser = "Snitning, LOL, strikke";
        person.smarthomeDevices = "Xbox, 3 Smartlamper, Køleskab m.m.";
        person.hojde = "1.56 m";
        person.vaegt = "76 kg";
        person.karaktergennemsnit = 5.33;
        person.eksamensKarakterer = "7, 12, -3, 4, 2, 10";
        person.opdateretDato = "Sun Jan 08 00:00:00 CET 1978";
        System.out.println(person);
    }

}
