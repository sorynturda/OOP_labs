public class Main {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("haha");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("s-a ajuns aici");
        }
        try {
            throw new ExceptiaMea("exceptia mea");
        } catch (ExceptiaMea e) {
            System.out.println(e);
        }
        //
        try {
            Clasa1.f();
        } catch (ExceptiaMeaAlta e) {
            System.out.println(e);
        }
        System.out.println();
        try {
            Clasa1.g();
        } catch (ExceptiaMea e) {
            System.out.println(e);
        }
    }
}