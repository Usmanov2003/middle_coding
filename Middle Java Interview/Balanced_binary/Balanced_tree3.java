class Node { 
    int val; 
    Node left, right; 

    public Node(int v) {
        val = v; 
        left = null; 
        right = null; 
    }
}

class Solution { 
    private Pair<Boolean, Integer> isBalancedfast(Node root) { 
        
        if (root == null) {
            Pair<Boolean, Integer> p = new Pair<>(true, 0);
            return p;
        }

        Pair<Boolean, Integer> left = isBalancedfast(root.left);
        Pair<Boolean, Integer> right = isBalanced(root.right);

        boolean leftAns = left.first;
        boolean rightAns = right.first; 

        boolean diff = Math.abs(left.second - right.second) <= 1; 

        Pair<Boolean, Integer> ans = new Pair<>(false, Math.max(left.second, right.second) + 1); 

        if (leftAns && rightAns && diff) {
            ans = new Pair<>(true, Math.mxa(left.second, right.second) + 1); 
        } 

        return ans;
    }

    public boolean isBalanced(Node root) {
        return isBalanced(root).first;
    }
}

public class Main {
    public static void main(String[] args) 
    { 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        Solution obj = new Solution();

        if (obj.isBalanced(root)) {
            System.out.println("The given binary tree is balanced");
        } else { 
            System.out.println("The given binary tree is not balanced");
        }
    }
}