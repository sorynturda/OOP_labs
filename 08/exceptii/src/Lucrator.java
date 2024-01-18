public class Lucrator {
    private String nume;
    private CalendarLucru cal;

    public Lucrator(String nume, CalendarLucru cal) {
        this.nume = nume;
        this.cal = cal;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare{
        Zi ziL = cal.getZi(zi);
        if(ziL == null)
            System.out.println(zi + " nu este o zi a saptamanii");
        if(!ziL.esteLucratoare())
            throw new ExceptieZiNelucratoare(zi + " nu se lucreaza");
        System.out.println(nume + " lucreaza " + zi);
    }

    public CalendarLucru getCal() {
        return cal;
    }
}
