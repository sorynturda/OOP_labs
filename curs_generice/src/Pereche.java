public class Pereche<T> {
    private T first;
    private T second;

    public Pereche(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public <V> void afisareDuala(V a) {
        System.out.printf("first: %s second second %s \n", this.toString(), a.toString());
    }

    public <V> void afisareCuPereche(Pereche<V> another) {
        System.out.printf("first: %s second %s, %s\n", this.toString(), another.getFirst().toString(), another.getSecond().toString());
    }

    @Override
    public String toString() {
        return "Pereche{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

}
