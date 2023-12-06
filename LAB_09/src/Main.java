import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String text = "Buna ce mai faci? Buna sunt mai bine";
        HashMap<String, Integer> H = new HashMap();
//        Map<String, Integer> H = new TreeMap();
        for (String s : text.split(" "))
            if (H.get(s) == null)
                H.put(s, 1);
            else
                H.replace(s, H.get(s) + 1);
        for (Map.Entry<String, Integer> it : H.entrySet()) {
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }
}