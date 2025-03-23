class MinHeap {
    int[] arr;
    int maxSize, heapSize;

    MinHeap(int maxSize) {
        this.maxSize = maxSize;
        heapSize = 0;
        arr = new int[maxSize];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int lChild(int i) {
        return 2 * i + 1;
    }

    int rChild(int i) {
        return 2 * i + 2;
    }

    int getMin() {
        return arr[0];
    }

    int curSize() {
        return heapSize;
    }

    void MinHeapify(int i) {
        int l = lChild(i);
        int r = rChild(i);
        int smallest = i;

        if (l < heapSize && arr[l] < arr[i])
            smallest = l;
        if (r < heapSize && arr[r] < arr[smallest])
            smallest = r;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            MinHeapify(smallest);
        }
    }

    void removeMin() {
        if (heapSize <= 0) {
            System.out.println("Heap is empty");
            return;
        }
        if (heapSize == 1) {
            heapSize--;
            return;
        }

        // Replace root with last element
        arr[0] = arr[heapSize - 1];
        heapSize--;

        // Restore Min Heap property
        MinHeapify(0);
    }

    void insertKey(int x) {
        if (heapSize == maxSize) {
            System.out.println("\nOverflow: Could not insertKey\n");
            return;
        }

        int i = heapSize;
        arr[i] = x;
        heapSize++;

        // Restore Min Heap property by moving up
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap(15);
        int elements[] = {3, 10, 12, 8, 2, 14};

        for (int e : elements)
            h.insertKey(e);

        System.out.println("The current size of the heap is " + h.curSize());
        System.out.println("The current minimum element is " + h.getMin());

        for (int i = 0; i < h.heapSize; i++) {
            System.out.print(" " + h.arr[i]);
        }
        System.out.println();

        h.removeMin();
        for (int i = 0; i < h.heapSize; i++) {
            System.out.print(" " + h.arr[i]);
        }
        System.out.println();

        System.out.println("The current size of the heap is " + h.curSize());

        h.insertKey(15);
        h.insertKey(5);
        System.out.println("The current size of the heap is " + h.curSize());
        System.out.println("The current minimum element is " + h.getMin());

        for (int i = 0; i < h.heapSize; i++) {
            System.out.print(" " + h.arr[i]);
        }
        System.out.println();
    }
}

