package basicSorting;

public class SelectionSort {
    public static void selctionsor(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {2,5,1,7,3,9};
        selctionsor(arr);
    }
}
