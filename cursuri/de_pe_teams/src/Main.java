
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carte> carti = CatalogCarti.initializeazaCatalog();
        for (Carte c:carti)
            System.out.println(c);
    }
}