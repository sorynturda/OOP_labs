import java.util.HashSet;

public class Abonat {
    private int subscriberId;
    private String nume;
    private Abonament abonament;
    HashSet<Film> wishList;
    HashSet<Film> alreadyWatchedList;

    public Abonat(int subscriberId, String nume, Abonament abonament) {
        this.subscriberId = subscriberId;
        this.nume = nume;
        this.abonament = abonament;
    }

    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }
}
