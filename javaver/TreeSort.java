import java.util.Map;
import java.util.TreeMap;

class TreeSort {
    /**
     * ツリーソートを行う関数
     */
    public static void treeSort(Map<Integer, Integer> hMap) {
        System.out.println("「ツリーソート」");

        System.out.print("ソート前：");
        for (Integer key : hMap.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.println();

        System.out.print("ソート後：");
        Map<Integer, Integer> tMap = new TreeMap<>(hMap);
        for (Integer key : tMap.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.println();
    }

}