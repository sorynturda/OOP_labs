import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persoana a1 = new Persoana("J.K. Rowling", 55);
        Persoana a2 = new Persoana("Rick Riordan", 40);
        Persoana a3 = new Persoana("J. R. R. Tolkien", 123);
        Carte c1 = new Carte(a1, 1997, "Egmont", "Harry Potter și piatra filozofală");
        Carte c2 = new Carte(a1, 1998, "Egmont", "Harry Potter și Camera Secretelor");
        Carte c3 = new Carte(a1, 1999, "Egmont", "Harry Potter și Prizonierul din Azkaban");
        Carte c4 = new Carte(a2, 2022, "Arthur", "Percy Jackson şi Olimpienii (#1). Hoţul fulgerului");
        Carte c5 = new Carte(a2, 2023, "Arthur", "Percy Jackson şi Olimpienii (#4). Bătălia din Labirint");
        Carte c6 = new Carte(a3, 1955, "RAO", "The Fellowship of the Ring");
        Carte c7 = new Carte(a3, 1954, "RAO", "The Two Towers");
        ArrayList<Carte> a = new ArrayList<>();
        a.add(c1);
        a.add(c2);
        a.add(c3);
        a.add(c4);
        a.add(c5);
        a.add(c5);
        a.add(c6);
        a.add(c7);
//        Collections.sort(a);
//        for(Carte c : a)
//            System.out.println(c);
        LinkedList<Carte> lista = new LinkedList<>();
        HashSet<Carte> S = new HashSet<>();
        LinkedHashSet<Carte> LS = new LinkedHashSet<>();
        TreeSet<Carte> TS = new TreeSet<>(); //fara comparator da eroare
        for (Carte c : a) {
            lista.add(c);
            S.add(c);
            LS.add(c);
            TS.add(c);
        }
//        for (Carte c : lista)
//            System.out.println(c);
//        for (Carte c : S)
//            System.out.println(c);
//        System.out.println("linked");
//        for(Carte c : LS)
//            System.out.println(c);
        for (Carte c : TS)
            System.out.println(c);

    }
}