public class Sofer {
    private String nume;
    private String prenume;
    private String numarPermisDeConducere;
    private int varsta;

    public Sofer(String nume, String prenume, String numarPermisDeConducere, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.numarPermisDeConducere = numarPermisDeConducere;
        this.varsta = varsta;
    }

    public String getNume() {
        return this.nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public String getNumarPermisDeConducere() {
        return this.numarPermisDeConducere;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public String toString(){
        return this.getPrenume() + " " + this.getNume() + " in varsta de " + this.getVarsta() + " ani";
    }
}
