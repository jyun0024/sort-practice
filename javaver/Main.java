class Main {
    public static void main(String[] args) {
        // ツリーソート
        TreeSort.treeSort(GenerateRandom.randMap(10));
        // ヒープソート
        HeapSort.heapSort(GenerateRandom.randArray(10));
        // クイックソート
        QuickSort.quickSort(GenerateRandom.randArray(10));
    }
}