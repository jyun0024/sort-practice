class Main {
    public static void main(String[] args) {
        // ツリーソート
        TreeSort.treeSort(RandMap.randMap(10));
        // ヒープソート
        HeapSort.heapSort(RandMap.randMap(10));
        // クイックソート
        QuickSort.quickSort(RandMap.randMap(10));
    }
}