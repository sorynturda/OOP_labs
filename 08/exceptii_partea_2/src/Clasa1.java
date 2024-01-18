public class Clasa1 {
    public static void f() throws ExceptiaMeaAlta {
        System.out.println("functia f()");
        try {
            g();
        }catch (ExceptiaMea e){
            throw new ExceptiaMeaAlta("alta exceptie in f()");
        }

    }

    public static void g() throws ExceptiaMea {
        throw new ExceptiaMea("exceptie in functia g()");
    }
}
