package quiz;

public class Sporgsmaal implements Translatable {
    private String SporgsmaalTekst;
    private int point;
    private Svar[] svar = {};
    private int rigtigeSvarIndex;

    public String getSporgsmaalTekst() {
        return SporgsmaalTekst;
    }

    public void setSporgsmaalTekst(String sporgsmaalTekst) {
        StringBuilder words = new StringBuilder();

        if (sporgsmaalTekst.length() > 100) {
            throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
        }
        SporgsmaalTekst = sporgsmaalTekst;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        if (point > 10) {
            throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
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
