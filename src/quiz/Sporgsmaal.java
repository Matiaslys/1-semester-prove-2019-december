package quiz;

public class Sporgsmaal implements Translatable {
    // her har vi variablerne som bliver brugt til dette program.
    private String SporgsmaalTekst;
    private int point;
    // her har vi et array som holder styr på svarene
    private Svar[] svar = {};
    private int rigtigeSvarIndex;
    // en masse getter og setter
    public String getSporgsmaalTekst() {
        return SporgsmaalTekst;
    }

    public void setSporgsmaalTekst(String sporgsmaalTekst) {
        StringBuilder words = new StringBuilder();
        // her laver jeg et if statement der siger at hvis et spørgsmål er mere end 100 ord så kommer den en Exception
        if (sporgsmaalTekst.length() > 100) {
            throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
        }
        SporgsmaalTekst = sporgsmaalTekst;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        // det samme bare med point
        if (point > 10) {
            throw new IllegalArgumentException("Du har 10 point du har allerede vundet.");
        }
        this.point = point;
    }

    public int getRigtigeSvarIndex() {
        return rigtigeSvarIndex;
    }

    public void setRigtigeSvarIndex(int rigtigeSvarIndex) {
        this.rigtigeSvarIndex = rigtigeSvarIndex;
    }
}
