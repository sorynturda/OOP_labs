public class Carte {
    private String titlu;
    private Autor autor;
    private int ID;
    private int copiiDisponibile;

    public Carte() {
        titlu = "";
        autor = null;
        ID = 0;
        copiiDisponibile = 0;
    }

    public Carte(String t, Autor a, int ID, int cD) {
        titlu = t;
        autor = a;
        this.ID = ID;
        copiiDisponibile = cD;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getID() {
        return ID;
    }

    public int getCopiiDisponibile() {
        return copiiDisponibile;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCopiiDisponibile(int cd) {
        copiiDisponibile = cd;
    }

    public String toString() {
        return "Cartea: " + this.titlu + " scrisa de " +
                this.autor.toString() + " are ID-ul: " +
                this.ID + " si este disponibila in " +
                this.copiiDisponibile + " exemplare.";
    }
}
