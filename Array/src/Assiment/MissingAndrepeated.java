package Assiment;

public class MissingAndrepeated {
        public static int findTotalMissing(int[] arr) {
            int l = arr.length;
            int max = 0;
            for (int i = 0; i < l; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            int[] freq = new int[max + 1];

            // Calculate frequency of each element
            for (int i = 0; i < l; i++) {
                freq[arr[i]]++;
            }

            // Find total missing numbers
            int totalMissing = 0;
            for (int i = 1; i <= max; i++) {
                if (freq[i] == 0) {
                    totalMissing++;
                }
            }
            return totalMissing;
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 4, 5, 5, 9, 10, 11, 13, 15};
            System.out.println("Total missing numbers: " + findTotalMissing(arr));
        }
    }

