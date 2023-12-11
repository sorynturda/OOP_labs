public class PerecheString {
    private String first;
    private String second;

    @Override
    public String toString() {
        return "PerecheString{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public PerecheString(String first, String second) {
        this.first = first;
        this.second = second;
    }
}
