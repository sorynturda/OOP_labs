public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("James", "Smith", new Masina("rosu","marca"));
        Student s2 = s1.clone();
        s2.prenume = "John";
        s2.nume = "Doe";
        System.out.println(s1.prenume+ " " + s1.nume + " " + s1.m.marca + " " + s1.m.culoare);
        System.out.println(s2.prenume+ " " + s2.nume + " " + s2.m.marca + " " + s2.m.culoare);
        s2.m.culoare = "verde";
        System.out.println(s1.prenume+ " " + s1.nume + " " + s1.m.marca + " " + s1.m.culoare);
        System.out.println(s2.prenume+ " " + s2.nume + " " + s2.m.marca + " " + s2.m.culoare);
    }
}