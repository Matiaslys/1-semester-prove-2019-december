package quiz;

public class Svar extends Sporgsmaal {
    private String svarTekst;

    public Svar(String svarTekst) {
        this.svarTekst = svarTekst;
    }


    public String getSvarTekst() {
        return svarTekst;
    }

    public void setSvarTekst(String svarTekst) {
        this.svarTekst = svarTekst;
    }
}
