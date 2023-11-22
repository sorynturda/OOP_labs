public class Student implements Cloneable {
    public String nume;
    public String prenume;
    public Masina m;

    public Student(String p, String n, Masina m) {
        nume = n;
        prenume = p;
        this.m = m;
    }

    //shallow copy
//    public Student clone() {
//        try {
//            Student clone = (Student) super.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
    //deep copy
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.m = m.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }
}
