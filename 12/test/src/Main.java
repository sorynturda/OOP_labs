import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Film f1 = new Film(1, "Cars 1", "Comedie", 120, false);
        Film f2 = new Film(2, "Cars 2", "Comedie", 110, true);
        Film f3 = new Film(3, "Cars 3", "Comedie", 130, true);
        Film f4 = new Film(4, "Cars 4", "Comedie", 150, false);
        Film f5 = new Film(55, "Cars 5", "Comedie", 155, true);
        Abonat a1 = new Abonat(1, "George", new Abonament(1, "Standard"));
        Abonat a2 = new Abonat(1, "Dorian", new Abonament(2, "Premium"));
        ArrayList<Film> filme = new ArrayList<>();
        filme.add(f1);
        filme.add(f2);
        filme.add(f3);
        filme.add(f4);
        filme.add(f5);
        a1.setTipAbonament("Premium");
        try {
            a1.addToWishList(filme.get(1));
        } catch (Exception e) {
            System.out.println("blabla");
        }
        try {
            a1.watchFilm(filme.get(0));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(a1);
        a1.watchFilm(filme.get(1));
        a1.watchFilm(filme.get(2));
        System.out.println(a1);
        ServiciuStreamingFilme ss = new ServiciuStreamingFilme();
        ss.addAbonat(a1);
        ss.addAbonat(a2);
        for (Film it : filme)
            ss.addFilm(it);
        ss.listaFilme();
        ss.addAbonat(a1);
        ss.stergeFilm(filme.get(0));
        ss.listaFilme();
        ss.listaAbonati();
        System.out.println(ss.cateFilmeDeGenul("comedie"));
        System.out.println(ss.cautaFilm("Cars 3"));
        System.out.println(ss.cautaFilm("Cars 2"));

        a2.watchFilm(filme.get(1));
        a2.addToWishList(filme.get(3));
        System.out.println("lista de dorinte");
        a2.showWishList();
        System.out.println(a2);
        a2.showAlreadyWatchedList();
    }
}