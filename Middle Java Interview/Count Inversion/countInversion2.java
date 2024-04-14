import java.util.Arrays; 

public class GFG 
{
    private static int mergeAndCount(int[] arr, int l,
                                    int m, int r)
    {
        int[] left = arrays.coptOfRange(arr,l,
                                        m + 1);

        int[] right = Arrays.coptOfRange(arr, m + 1, 
                                        r + 1);
                                    
        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length)
        {
            if (left[i] <= right[i]) 
                arr[k++] = left[i++];
            else 
            {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length) 
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    } 

    private static int mergeSortAndCount(int[] arr, 
                                            int l, int r)
    {
        int[] arr = {1, 20,6, 4, 5};

        System.out.println(
            mergeSortAndCount(arr, 0, arr.length - 1));
    }
}