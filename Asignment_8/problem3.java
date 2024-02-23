package Asignment_8;

public class problem3 {
     static void rearrange(int[] arr, int n) {
        int maxIndex = n - 1;
        int minIndex = 0;
        int maxElement = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }

        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / maxElement;
    }

     static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5, 6};
            int n1 = arr1.length;
            rearrange(arr1, n1);
            printArray(arr1); 
            
            int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
            int n2 = arr2.length;
            rearrange(arr2, n2);
            printArray(arr2); 
        }
    }
    
