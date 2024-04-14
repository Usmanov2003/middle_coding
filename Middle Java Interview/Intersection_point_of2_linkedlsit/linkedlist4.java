import java.util.*; 

class GFG { 

    static class Node {
        int data; 
        Node next; 
            Node(int x) {
                data = x; 
                    next =null;
            }
    };

    static  Node intersectionPoint(Node head1, Node head2) 
    {
        Node ptr1 = head1; 
        Node ptr2 = head2; 

        if (ptr1 == null || ptr2 == null) {
            return null; 
        }

        while (ptr1 != ptr2) {

            ptr1 =  ptr1.next; 
            ptr2 = ptr2.next; 

            if (ptr1 == ptr2) { 
                
                return ptr1;
            }

            if (ptr1 == null) {
                ptr1 = head2; 
            }

            if (ptr2 == null) {

                ptr2 = head1; 
            }
        }

        return ptr1; 
    }

    public static void main(String[] args) 
    {

        Node newNode;
        Node head1 = new Node(10);
        Node head2 = new Node(3);
        newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        Node intersect_node = null;
    
        intersect_node = intersectPoint(head1, head2); 

        if (intersect_node == null) { 
            System.out.println("No intersection point");
        }
        System.out.println("Intersection Point: " + intersect_node.data);
    }
}