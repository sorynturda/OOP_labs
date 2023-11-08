public class Autor {
    private String nume;
    private String prenume;
    private int varsta;

    public Autor() {
        nume = "";
        prenume = "";
        varsta = 0;
    }

    public Autor(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return this.nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public String toString() {
        return this.nume + " " + this.prenume + " in varsta de " + this.varsta + " de ani";
    }
}
