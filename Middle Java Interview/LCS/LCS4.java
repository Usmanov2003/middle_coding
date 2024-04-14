import java.util.Arrays; 

public class GFG { 

    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];

        for (int idx1 = 1; idx1 < n + 1; idx1++) {
            for (int idx2 = 1; idx2 < m + 1; idx2++) {

                if (text1.charAt(idx1 - 1) == text2.charAt(idx2 - 1)) 
                    cur[idx2] = 1 + prev[idx2 - 1];

                else 
                    cur[idx2] = Math.max(cur[idx2 - 1], prev[idx2]);
            }
            prev = Arrays.copyOf(cur, m + 1);
        } 

        return cur[m];
    }

    public static void main(String[] args)
    {
        String S1 = "AGGTAB"; 
        String S2 = "GXTXAYB"; 

        System.out.println("Lenth of LCS is " + longestCommonSubsequence(S1, S1));
    }
}