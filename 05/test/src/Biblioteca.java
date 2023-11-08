public class Biblioteca {
    private Carte[] listaCarti = new Carte[5];

    public void adaugaCarte(Carte carte) {
        if (carte == null || carte.getCopiiDisponibile() <= 0)
            return;
        int pozitie = gasesteUrmatoareaPozitie();
        if (exista(carte))
            return;
        if (pozitie == -1) {
            System.out.println("biblioteca este plina de carti");
            return;
        }
        listaCarti[pozitie] = carte;
    }

    public Carte gasesteCarteDupaTitlu(String titlu) {
        for (Carte carte : listaCarti) {
            if (carte != null && titlu.equals(carte.getTitlu()))
                return carte;
        }
        System.out.println("cartea nu a fost gasita");
        return null;
    }

    public void listeazaCarti() {
        for (Carte carte : listaCarti)
            if (carte != null)
                System.out.println(carte);
    }

    private int gasesteUrmatoareaPozitie() {
        for (int i = 0; i < listaCarti.length; i++)
            if (listaCarti[i] == null)
                return i;
        return -1;
    }

    private boolean exista(Carte carte) {
        for (int i = 0; i < listaCarti.length; i++) {
            if (listaCarti[i] != null && listaCarti[i].getID() == carte.getID())
                return true;
        }
        return false;
    }
}
