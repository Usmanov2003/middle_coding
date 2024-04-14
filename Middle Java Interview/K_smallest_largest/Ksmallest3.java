import java.util.PriorityQueue; 

public class KthSmallestElement {

    public static int kthSmallest(int[] arr, int N, int K) { 

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < N; i++) { 
            pq.offer(arr[i]);

            if(pq.size() > K) 
                pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) { 
        int N = 10; 
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int K = 4;

        System.out.println("Kth Smallest Element is: " + KthSmallest(arr, N, K));
    }
}