public class Film {
    private int movieId;
    private String titlu;
    private String gen;
    private int durata; //in minute
    private boolean esteDisponibil; //disponibilitate pentru streaming

    public Film(int id, String t, String g, int d, boolean disp) {
        movieId = id;
        titlu = t;
        gen = g;
        durata = d;
        esteDisponibil = disp;
    }

    public boolean esteDisponibil() {
        return esteDisponibil;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getGen() {
        return gen;
    }

    @Override
    public String toString() {
        return "Film{" +
                "movieId=" + movieId +
                ", titlu='" + titlu + '\'' +
                ", gen='" + gen + '\'' +
                ", durata=" + durata +
                ", esteDisponibil=" + esteDisponibil +
                '}';
    }
}
