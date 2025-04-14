import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandMap {
    /**
     * 1～100で乱数を指定の回数生成する。
     * ソート対象なので、MapのKeyにセットする。
     * @param roopTime ループ回数、乱数の生成数
     * @return
     */
    public static Map<Integer, Integer> randMap(int roopTime) {
        Random rand = new Random();
        Map<Integer, Integer> mapNum = new HashMap<Integer, Integer>();
        for (int i = 0; roopTime > i; i++) {
            mapNum.put(rand.nextInt(100), i);
        }
        return mapNum;
    }
}
