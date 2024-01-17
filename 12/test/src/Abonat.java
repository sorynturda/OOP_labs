import java.util.HashSet;

public class Abonat implements Vizonare {
    private int subscriberId;
    private String nume;
    private Abonament abonament;
    HashSet<Film> wishList;
    HashSet<Film> alreadyWatchedList;

    public Abonat(int subscriberId, String nume, Abonament abonament) {
        this.subscriberId = subscriberId;
        this.nume = nume;
        this.abonament = abonament;
        wishList = new HashSet<>();
        alreadyWatchedList = new HashSet<>();
    }

    public void setTipAbonament(String tip) {
        abonament.setTipAbonament(tip);
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void watchFilm(Film film) throws FilmIndisponibilException {
        if (!film.esteDisponibil())
            throw new FilmIndisponibilException("Filmul nu este disponibil pentru streaming!");
        alreadyWatchedList.add(film);
        wishList.remove(film);
    }

    @Override
    public void addToWishList(Film film) throws PremiumNotEnabledException {
        if (abonament.getTipAbonament().equalsIgnoreCase("standard"))
            throw new PremiumNotEnabledException("Nu aveti acces la aceasta functie!");
        wishList.add(film);
    }

    @Override
    public void showWishList() {
        for (Film film : wishList)
            System.out.println(film);
    }

    @Override
    public void showAlreadyWatchedList() {
        for (Film film : alreadyWatchedList)
            System.out.println(film);
    }

    @Override
    public String toString() {
        return "Abonat{" +
                "subscriberId=" + subscriberId +
                ", nume='" + nume + '\'' +
                ", abonament=" + abonament +
                ", wishList=" + wishList +
                ", alreadyWatchedList=" + alreadyWatchedList +
                '}';
    }
}
