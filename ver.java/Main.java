import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;

class Main {
    public static void main(String[] args) {
        // TODO ランダムな数字の配列を生成
        
        // ArrayList<Integer> array_num = new ArrayList<>();
        // array_num = RandArrya(1);
        System.out.println(RandArrya(3));
        // TODO ツリーソート
    }

    public static ArrayList<Integer> RandArrya(int roopTime) {
        Random rand = new Random();
        ArrayList<Integer> randArray = new ArrayList<>();
        for (int i = 0; roopTime > i; i++) {
            randArray.add(rand.nextInt(100));
        }
        return randArray;
    }
}