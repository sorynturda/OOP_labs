public class Punct<T extends Number> {
    private T x;
    private T y;

    public Punct(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public <T extends Number> Double calculeazaDistanta(Punct<T> p) {
        return Math.sqrt(Math.pow(x.doubleValue() - p.getX().doubleValue(), 2) + Math.pow(y.doubleValue() - p.getY().doubleValue(), 2));
    }

    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
