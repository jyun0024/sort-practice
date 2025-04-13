import java.util.Map;
import java.util.TreeMap;

class TreeSort {
    /**
     * ツリーソートを行う関数
     */
    public static void treeSort(Map<Integer, Integer> hMap) {
        System.out.println("ソート前");
        // System.out.println(hMap);
        for (Integer key : hMap.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.println("\nツリーソート後");
        Map<Integer, Integer> tMap = new TreeMap<>(hMap);
        // System.out.println(tMap);
        for (Integer key : tMap.keySet()) {
            System.out.print(key + ", ");
        }
    }

}