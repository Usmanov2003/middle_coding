class Node { 
    omt data; 
    Node next;
        Node(int x) {
            data = x; 
                next = null;
        }
}

public class GFG { 
    static void pushNode(Node[] head_ref, int data_val) 
    {
        Node new_node = new Node(data_val);

        new_node.next = head_ref[0];

        head_ref[0] = new_node;
    }

    static int getMiddle(Node head) 
    {
        Node mid = head; 
        int counter = 1; 

        while (head != null) {

            if (counter % 2 == 0) {
                mid = mid.next;
            }
            head = head.next;

            counter++;
        }
        return mid.data;
    }

    public static void main(String[] args) 
    {
        Node[] head = new Node[1];
        for (int i = 5; i > 0; i--) { 
            pushNode(head, i);
        }

        System.out.println(
            "Middle value of Linked List is: "
                + getMiddle(head[0]));
    }
}