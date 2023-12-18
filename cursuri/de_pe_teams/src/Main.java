
import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Carte> carti = CatalogCarti.initializeazaCatalog();
        //clasa anonima
        afiseazaCarti(carti, new Predicate<Carte>() {
            @Override
            public boolean test(Carte carte) {
                return carte.getTip() == TipCarte.BIOGRAFIE;
            }
        });
        System.out.println();
        //mostenire clasa anonima
        afiseazaCarti(carti, new PredicatPretCarte(50) {
            int numarPagini;

            {
                numarPagini = 400;
                System.out.println("init numrPagini " + numarPagini);
            }

            @Override
            public boolean test(Carte carte) {
                return super.test(carte) && carte.getNrPagini() > numarPagini;
            }
        });
        System.out.println();
        //funcite lambda
        afiseazaCarti(carti, (c) -> {
            return c.getPret() < 35 && c.getNrPagini() > 400;
        });
        System.out.println();
        afiseazaCarti(carti, (c) -> {
            return c.getTip() == TipCarte.BIOGRAFIE;
        });
    }

    public static void afiseazaCarti(Iterable<Carte> carti, Predicate<Carte> pr) {
        for (Carte c : carti)
            if (pr.test(c))
                System.out.println(c);
    }

    private static void afiseazaCartiBIOGRAFICE(List<Carte> carti) {
        for (Carte c : carti)
            if (c.getTip() == TipCarte.BIOGRAFIE)
                System.out.println(c);
    }

    private static void afiseazaCartiFICTIUNE(List<Carte> carti) {
        for (Carte c : carti)
            if (c.getTip() == TipCarte.FICTIUNE)
                System.out.println(c);
    }

    private static void afiseazaCartiPretMaiMic30(List<Carte> carti) {
        for (Carte c : carti)
            if (c.getPret() < 30.0)
                System.out.println(c);
    }
}