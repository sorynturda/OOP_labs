public class Main {
    private String name;

    public Main(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void modify1(Main p) {
        p = new Main("Modified name");
        System.out.println(p.getName());
    }

    public static void modify2(Main p) {
        p.setName("Modified Name");
        System.out.println(p.getName());
    }

    public static void main(String[] args) {
        Main p = new Main("Initial Person");
        modify1(p);
        System.out.println("Method modify1(Main p): " + p.getName());
        modify2(p);
        System.out.println("Method modify2(Main p): " + p.getName());
    }
}