package Asignment_8;

public class problem2 {
     static int[] find(int[] arr, int n, int x) {
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (firstIndex == -1)
                    firstIndex = i;
                lastIndex = i;
            }
        }

        return new int[]{firstIndex, lastIndex};
    }
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
            int n = arr.length;
            int x = 5;
    
            int[] result = find(arr, n, x);
            System.out.println(result[0]+" "+result[1]);
        }
    
        
    }
     
