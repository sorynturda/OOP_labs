import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

public class ServiciuStreamingFilme {
    private Map<String, Film> filme = new HashMap<>();
    private Map<String, Abonat> abonati = new HashMap<>();

    public void addFilm(Film film) {
        if (!filme.containsKey(film.getTitlu()))
            filme.put(film.getTitlu(), film);
    }

    public void addAbonat(Abonat a) {
        if (!abonati.containsKey(a.getNume()))
            abonati.put(a.getNume(), a);
    }

    public void stergeAbonat(Abonat a) {
        abonati.remove(a.getNume());
    }

    public void stergeFilm(Film film) {
        filme.remove(film.getTitlu());
    }

    public void listaFilme() {
        for (Map.Entry<String, Film> it : filme.entrySet())
            System.out.println(it.getKey() + " " + it.getValue());
        System.out.println();
    }

    public void listaAbonati() {
        for (Map.Entry<String, Abonat> it : abonati.entrySet())
            System.out.println(it.getKey() + " " + it.getValue());
        System.out.println();
    }

    public int cateFilmeDeGenul(String gen) {
        int cnt = 0;
        for (Map.Entry<String, Film> it : filme.entrySet())
            if (it.getValue().getGen().equalsIgnoreCase(gen))
                cnt++;
        return cnt;
    }
    public Film cautaFilm(String titlu){
        return filme.get(titlu);
    }
}
