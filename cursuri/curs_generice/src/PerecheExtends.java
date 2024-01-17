public class PerecheExtends<T extends Number> {
    private T first;


    private T second;

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public PerecheExtends(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public <V> void afisareDuala(V a) {
        System.out.printf("first: %s second %s \n", this.toString(), a.toString());
    }

    public <V extends Number> void afisareCuPereche(PerecheExtends<V> another) {
        System.out.printf("first: %s second %s, %s\n", this.toString(), another.getFirst().toString(), another.getSecond().toString());
    }

    public <V extends Number, X> void afusareCuPereche(PerecheExtends<V> a, X b) {
        System.out.printf("first %s: second %s third %s\n", this.toString(), a.toString(), b.toString());
    }

    @Override
    public String toString() {
        return "PerecheExtends{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
