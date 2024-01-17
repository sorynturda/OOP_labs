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
}
