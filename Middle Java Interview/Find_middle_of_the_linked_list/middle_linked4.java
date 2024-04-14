class Node {
    int data; 
    Node next; 
        Node(int x) {
            data = x; 
                next = null;
        }
}

public class Main { 
    static void pushNode(Node[] head_ref, int data_val) 
    {
        Node new_node = new Node(data_val);
        
        new_node.next = head_ref[0];

        head_ref[0] = new_node;
    }

    static int getMiddle(Node head) 
    {
        Node new_node = new Node(data_val);

        new_node.next = head_ref[0];

        head_ref[0] = new_node;
    }

    static int getMiddle(Node head) 
    {
        Node slow_ptr = head; 
        Node fast_ptr = head;
        
        while (fast_ptr != null && fast_ptr.next != null) {

            fast_ptr = fast_ptr.next.next;

            slow_ptr = slow_ptr.next;
        }
        return slow_ptr.data;
    }

    public static void main(String[] args) 
    {
        Node[] head = new Node[1];
        for (int i = 5; i > 0; i--) {
            pushNode(head, i);
        }
        System.out.println(
            "Middle Value of Linked List is: " 
                + getMiddle(head[0]);
        )
    }
}