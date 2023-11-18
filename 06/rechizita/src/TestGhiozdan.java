public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan g = new Ghiozdan();
        g.add(new Caiet("bio"));
        g.add(new Manual("bio"));
        g.add(new Manual("programare"));
        g.add(new Manual("baze de date"));
        g.add(new Caiet("matematica"));
        g.add(new Caiet("engleza"));
        g.add(new Manual("engleza si franceza"));
        g.add(new Caiet("franceza"));
        g.add(new Caiet("jurnal"));
        Rechizita c = new Caiet("teme");
        g.add(c);
//        g.listCaiet();
//        g.listManual();
        g.listItems();
        System.out.println(g.getNrRechizite());
        System.out.println(g.getNrCaiete());
        System.out.println(g.getNrManuale());
    }
}