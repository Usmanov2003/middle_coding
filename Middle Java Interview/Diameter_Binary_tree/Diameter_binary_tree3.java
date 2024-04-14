//GFG
// Java code for this approach
class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Main
{

	// Create a new node
	public static Node newNode(int data) {
		Node node = new Node(data);
		return node;
	}

	// Morris traversal to find the diameter of the binary tree
	public static int findDiameter(Node root) {
		int ans = 0;
		Node curr = root;

		while (curr != null) {
			if (curr.left == null) {
				curr = curr.right;
			} else {
				Node pre = curr.left;
				while (pre.right != null && pre.right != curr) {
					pre = pre.right;
				}
				if (pre.right == null) {
					pre.right = curr;
					curr = curr.left;
				} else {
					pre.right = null;
					int leftHeight = 0, rightHeight = 0;
					Node temp = curr.left;
					while (temp != null) {
						leftHeight++;
						temp = temp.right;
					}
					temp = curr.right;
					while (temp != null) {
						rightHeight++;
						temp = temp.left;
					}
					ans = Math.max(ans, leftHeight + rightHeight + 1);
					curr = curr.right;
				}
			}
		}
		return ans;
	}

	// Driver code to test above function
	public static void main(String[] args)
	{
	
		// Create the given binary tree
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(5);

		// Find the diameter of the binary tree using Morris traversal
		int diameter = findDiameter(root);

		// Print the diameter of the binary tree
		System.out.println("The diameter of given binary tree is " + diameter);
	}
}

// This code is written by Sundaram
