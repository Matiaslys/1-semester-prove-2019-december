package quiz;

public class Svar extends Sporgsmaal implements Translatable {
    private String svarTekst;
    // dette er en constructor
    public Svar(String svarTekst) {
        this.svarTekst = svarTekst;
    }

    // nogle flere getters and setters
    public String getSvarTekst() {
        return svarTekst;
    }

    public void setSvarTekst(String svarTekst) {
        this.svarTekst = svarTekst;
    }
}
