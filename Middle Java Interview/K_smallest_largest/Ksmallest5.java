import java.util.Arrays; 

public class GFG { 

    static int kthSmallest(int[] arr, int n, int k) 
    {
        int max_element = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];
            }
        }

        int[] freq = new int[max_element + 1];
        Arrays.fill(freq, 0);
        for (int i = 0; i < n; i+) { 
            freq[arr[i]]++;
        }

        int count = 0; 
        for (int i = 0; i <= max_element; i++) { 
            if (freq[i] != 0) { 
                count += freq[i];
                if (count >= k) { 
                    return i; 
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] arr = {12, 3, 5, 7, 19};
        int n = arr.length;
        int k = 2; 
        System.out.println("The " + k 
                            + "th smallest element is "
                            + kthSmallest(arr, n, k));
    }
}