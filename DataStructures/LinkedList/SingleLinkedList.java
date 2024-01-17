package DataStructures.LinkedList;

public class SingleLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        public LinkedList(Node head) {
            this.head = head;
        }
    }

    public class Main {
        public void main(String[] args) {
            // Create nodes
            Node node1 = new Node(4);
            Node node2 = new Node(8);

            // Connect nodes to form a linked list
            node1.next = node2;

            // Create a linked list with the head node
            LinkedList linkedList = new LinkedList(node1);
        }
    }
}