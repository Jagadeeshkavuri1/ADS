import java.util.Scanner;

public class QuickSort {
    // Partition function to divide the array
    public static int partition(int[] a, int low, int high) {
        int pivot = a[low]; // Choosing the first element as pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && a[i] <= pivot)
                i++;
            while (i <= j && a[j] >= pivot)
                j--;
            if (i < j)
                interchange(a, i, j);
        }
        interchange(a, low, j);
        return j;
    }

    // Function to swap two elements in the array
    public static void interchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // QuickSort function
    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quickSort(a, low, j - 1);
            quickSort(a, j + 1, high);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, n-1);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
