import java.util.Arrays; 
import java.util.Collections; 

class GFG { 

    public static int partition(Integer[] arr, int l, int r) 
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) { 
            if (arr[j] <= x) { 

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }

    public static int kthSmallest(Integer[] arr, int l, int r, int K) 
    {
        if (K > 0 && K <= r - l + 1) {

            int pos = partition(arr, l, r);

            if (pos - l == K - 1) 
                return arr[pos];

            if (pos - l > K - 1) 
                return kthSmallest(arr, l, pos - 1, K);

            return kthSmallest(arr, pos + 1, r, K - pos + k - 1);
        }

        return Integer.MAX_VALUE; 
    }

    public static void main(String[] args) 
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26};
        int K = 3; 

        System.out.print(
                "K'th smallest element is" 
                    + kthSmallest(arr, 0, arr.length - 1, K));
    }
}