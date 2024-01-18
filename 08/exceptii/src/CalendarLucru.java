public class CalendarLucru {
    Zi[] zile;

    public CalendarLucru() {
        zile = new Zi[]{
                new Zi("Dum", false),
                new Zi("Lun", true),
                new Zi("Mar", true),
                new Zi("Mie", true),
                new Zi("Joi", true),
                new Zi("Vin", true),
                new Zi("Sam", false),
        };
    }

    public Zi getZi(String zi) {
        for (int i = 0; i < zile.length; i++)
            if (zile[i].getNume().equals(zi))
                return zile[i];
        return null;
    }

    public void setLucratoare(int x) {
        zile[x].setEsteLucratoare(true);
    }
}
