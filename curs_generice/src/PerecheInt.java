public class PerecheInt {
    private int first;
    private int second;

    public PerecheInt(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "PerecheInt{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}
