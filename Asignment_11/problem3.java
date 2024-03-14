package Asignment_11;

public class problem3 {
        static int[] findUnion(int[] arr1, int[] arr2, int n, int m) {
            int[] union = new int[n + m];
            int index = 0;
            int i = 0, j = 0;
    
            while (i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    if (index == 0 || arr1[i] != union[index - 1]) 
                        union[index++] = arr1[i];
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    if (index == 0 || arr2[j] != union[index - 1])
                        union[index++] = arr2[j];
                    j++;
                } else {
                    if ((index == 0 || arr1[i] != union[index - 1]) && (index == 0 || arr2[j] != union[index - 1])) 
                        union[index++] = arr1[i];
                    i++;
                    j++;
                }
            }
    
            while (i < n) {
                if (index == 0 || arr1[i] != union[index - 1]) 
                    union[index++] = arr1[i];
                i++;
            }
    
            while (j < m) {
                if (index == 0 || arr2[j] != union[index - 1]) 
                    union[index++] = arr2[j];
                j++;
            }
    
            int[] result = new int[index];
            System.arraycopy(union, 0, result, 0, index);
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr1 = {2, 2, 3, 4, 5};
            int[] arr2 = {1, 1, 2, 3, 4};
            int n = arr1.length;
            int m = arr2.length;
    
            int[] union = findUnion(arr1, arr2, n, m);
            for (int num : union) {
                System.out.print(num + " ");
            }
        }
    }
