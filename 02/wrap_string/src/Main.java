public class Main {

    public static void main(String[] args) {
        int varsta = 21; // 7 bits
        int sex = 1; // 1 bit
        int inaltime = 185; // 8 bits
        short wrap =(short) (inaltime | (sex << 8) | (varsta << 9));
        System.out.println(wrap);
        System.out.println((wrap >> 8) & 1); // sex
        System.out.println((wrap>>9) & 0x7F); // varsta
        System.out.println(wrap & 0xFF); // inaltime
        String s1 = "Ana a";
        String s2 = "re mere";
        String s3 = s1 + s2;
        System.out.println(s3 == "Ana are mere");
        System.out.println("Ana are mere".equals(s3));
    }
}
