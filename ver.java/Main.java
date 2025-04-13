import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // TODO ランダムな数字の配列(Map)を生成
        Map<Integer, Integer> hMap = new HashMap<>();
        hMap = randMap(10);
        System.out.println(hMap);
        // System.out.println(randArrya(10));
        // TODO ツリーソート
        System.out.println("TreeSort");
        Map<Integer, Integer> tMap = new TreeMap<>(hMap);
        System.out.println(tMap);
        // for (Integer key : tMap.keySet()) {
        // System.out.println(key + ":" + tMap.get(key));
        // }
    }

    public static Map<Integer, Integer> randMap(int roopTime) {
        Random rand = new Random();
        Map<Integer, Integer> mapNum = new HashMap<Integer, Integer>();
        for (int i = 0; roopTime > i; i++) {
            mapNum.put(rand.nextInt(100), i);
        }
        return mapNum;
    }

}