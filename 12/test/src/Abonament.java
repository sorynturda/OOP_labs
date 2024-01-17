public class Abonament {
    private int idAbonament;
    private String tipAbonament;

    public Abonament(int idAbonament, String tipAbonament) {
        this.idAbonament = idAbonament;
        this.tipAbonament = tipAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public String getTipAbonament() {
        return tipAbonament;
    }

    @Override
    public String toString() {
        return "Abonament{" +
                "idAbonament=" + idAbonament +
                ", tipAbonament='" + tipAbonament + '\'' +
                '}';
    }
}
