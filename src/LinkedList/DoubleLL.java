package LinkedList;

public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirstDLL(int data) {
        // create a newNode
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printDLL() {
        if (head == null) {
            System.out.println("The DLL is Empty");
            return;
        }

        Node temp = head;
        // System.out.print("null -> ");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFist() {
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int var = head.data;
            size--;
            head = tail = null;
            return var;
        }
        int var = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return var;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void reverseDLL() {
        Node cur = head;
        Node prev = null;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            cur.prev = next; // one step extra

            prev = cur;
            cur = next;
        }
        // tail = head;
        head = prev;
    }

    public static void main(String[] args) {

        DoubleLL dll = new DoubleLL();
        // dll.addFirstDLL(3);
        // dll.addFirstDLL(2);
        // dll.addFirstDLL(1);
        // dll.printDLL();
        // System.out.println(dll.size);

        // dll.removeFist();
        // dll.printDLL();
        // System.out.println(dll.size);

        // dll.addLast(1);
        // dll.addLast(2);
        // dll.addLast(3);
        // dll.printDLL();
        // System.out.println(dll.size);

        // dll.removeLast();;
        // dll.printDLL();
        // System.out.println(dll.size);

        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(1);
        dll.printDLL();
        dll.reverseDLL();
        dll.printDLL();
        System.out.println(dll.tail.data);

        
    }
}
