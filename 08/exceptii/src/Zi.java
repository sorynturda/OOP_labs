public class Zi {
    private String nume;
    private boolean esteLucratoare;

    public Zi(String nume, boolean lucratoare) {
        this.nume = nume;
        this.esteLucratoare = lucratoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean esteLucratoare() {
        return esteLucratoare;
    }

    public void setEsteLucratoare(boolean esteLucratoare) {
        this.esteLucratoare = esteLucratoare;
    }
}
