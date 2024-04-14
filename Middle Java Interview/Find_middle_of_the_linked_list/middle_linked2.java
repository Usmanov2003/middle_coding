class Node {
    int data;
    Node next;
      Node(int x) {
        data = x;
          next = null;
    }
}

public class Main {
    // Function to add a new node
    static void pushNode(Node[] head_ref, int data_val)
    {
        // Allocate node
        Node new_node = new Node(data_val);
        // Link the old list of the new node
        new_node.next = head_ref[0];
        // Move the head to point to the new node
        head_ref[0] = new_node;
    }

    // Utility Function to find length of linked list
    static int getLen(Node head)
    {
        int len = 0;
        Node temp = head;
        // Traverse the entire linked list and increment len
        // by 1 for each node
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        // Return the number of nodes in the linked list
        return len;
    }

    // Function to get the middle value of the linked list
    static int getMiddle(Node head)
    {
        // find length
        int len = getLen(head);
        Node temp = head;

        // traverse till we reached half of length
        int midIdx = len / 2;
        while (midIdx > 0) {
            temp = temp.next;
            midIdx--;
        }
        // temp will be storing middle element
        return temp.data;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Node[] head = new Node[1];
        for (int i = 5; i > 0; i--) {
            pushNode(head, i);
        }
        System.out.println(
            "Middle Value Of Linked List is: "
            + getMiddle(head[0]));
    }
}
