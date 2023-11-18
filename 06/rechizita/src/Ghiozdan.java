public class Ghiozdan {
    private static int nrManuale;
    private static int nrCaiete;
    Rechizita[] rechizite = new Rechizita[100];

    public void add(Rechizita r) {
        if (r.getClass() == Manual.class)
            add((Manual) r);
        else
            add((Caiet) r);
    }

    public void add(Caiet c) {
        rechizite[nrCaiete++ + nrManuale] = c;
    }

    public void add(Manual m) {
        rechizite[nrManuale++ + nrCaiete] = m;
    }

    public void listItems() {
        for (int i = 0; i < nrCaiete + nrManuale; i++)
            System.out.println(rechizite[i].getNume());
    }

    public void listManual() {
        for (int i = 0; i < nrCaiete + nrManuale; i++)
            if (rechizite[i].getClass() == Manual.class)
                System.out.println(rechizite[i].getNume());
    }

    public void listCaiet() {
        for (int i = 0; i < nrCaiete + nrManuale; i++)
            if (rechizite[i].getClass() == Caiet.class)
                System.out.println(rechizite[i].getNume());
    }

    public int getNrRechizite() {
        return nrManuale + nrCaiete;
    }

    public int getNrManuale() {
        return nrManuale;
    }

    public int getNrCaiete() {
        return nrCaiete;
    }
}
