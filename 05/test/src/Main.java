public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        Autor a1 = new Autor("Preda", "Marin", 55);
        Autor a2 = new Autor("Creanga", "Ion", 72);
        Autor a3 = new Autor();
        Autor a4 = new Autor("Gustav", "Le Bon", 48);
        Autor a5 = new Autor("Matthew", "Walker", 40);
        Carte c1 = new Carte("Morometii I", a1, 22, 12);
        Carte c2 = new Carte("Amintiri din copilarie", a2, 12, 55);
        Carte c3 = new Carte("Programare orientata pe obiecte", a3, 23, 11);
        Carte c4 = new Carte("Psihologia multimii", a4, 100101010, 4);
        Carte c5 = new Carte("Why we sleep?", a5, 10012010, 4);
        b.adaugaCarte(c1);
        b.adaugaCarte(c2);
        b.adaugaCarte(c3);
        b.adaugaCarte(c4);
        Carte c=null;
        b.adaugaCarte(c);
        b.adaugaCarte(c5);
        b.listeazaCarti();
        Carte carte = b.gasesteCarteDupaTitlu("Why we sleep?");
        System.out.println("\n" + carte);
    }
}