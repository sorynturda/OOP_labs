public class Carte implements Comparable <Carte>{
    private Persoana autor;
    private int anAparitie;
    private String editura;
    private String titlu;

    public Carte(Persoana autor, int anAparitie, String editura, String titlu) {
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.editura = editura;
        this.titlu = titlu;
    }

    public Persoana getAutor() {
        return autor;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public String getEditura() {
        return editura;
    }

    public void setAutor(Persoana autor) {
        this.autor = autor;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "autor=" + autor +
                ", anAparitie=" + anAparitie +
                ", editura='" + editura + '\'' +
                ", titlu='" + titlu + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carte o) {
//        return this.getEditura().compareTo(o.getEditura()); editura
        return (this.getAnAparitie()-o.getAnAparitie());
    }
}
