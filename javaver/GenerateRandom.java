import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
    /**
     * 1～100で乱数を指定の回数生成する。
     * ソート対象なので、MapのKeyにセットする。
     * 
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

    /**
     * 1~100の乱数を指定の回数生成する。
     * 生成した値は配列に入れる。
     * 
     * @param roopTime ループ回数、乱数の生成数
     * @return
     */
    public static int[] randArray(int roopTime) {
        int[] numArray = new int[roopTime];
        Random rand = new Random();
        for (int i = 0; roopTime > i; i++) {
            numArray[i] = rand.nextInt(100);
        }
        return numArray;
    }
}
