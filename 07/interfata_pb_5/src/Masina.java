public class Masina implements Cloneable {
    public String marca;
    public String culoare;

    public Masina(String c, String m) {
        culoare = c;
        marca = m;
    }
    public Masina clone() {
        try {
            Masina clone = (Masina) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
