import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandMap {
    public static Map<Integer, Integer> randMap(int roopTime) {
        Random rand = new Random();
        Map<Integer, Integer> mapNum = new HashMap<Integer, Integer>();
        for (int i = 0; roopTime > i; i++) {
            mapNum.put(rand.nextInt(100), i);
        }
        return mapNum;
    }
}
