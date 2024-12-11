package LinkedList;

public class Circular_LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node addToEmpty(Node last, int data) {
        if (last != null) {
            return last;
        }
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
        return last;
    }

    public Node addFirstCLL(Node last, int data) {
        // 1->2->3->1
        if (last == null) {
            last = addToEmpty(last, data);
            return last;
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    public Node addEndCLL(Node last, int data) {
        // 1->2->3->1
        if (last == null) {
            last = addToEmpty(last, data);
            return last;
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    public Node addAfter(Node last, int data, int item) {
        if (last == null) {
            return null;
        }

        Node p = last.next;
        do {

            if (p.data == item) {
                Node newNode = new Node(data);
                newNode.next = p.next;
                p.next = newNode;
                if (p == last) {
                    last = newNode;
                }
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println("Item not found");
        return last;
    }

    public Node deleteNode(Node last, int item) {
        // if no nodes
        if (last == null) {
            return null;
        }
        // if only one node
        if (last.data == item && last.next == last) {
            last = null;
            return last;
        }

        Node temp = last.next, prev = last;
        // if first node
        if (temp.data == item) {
            last.next = temp.next;
            return last;
        }

        // if node is in random position
        do {
            if (temp.data == item) {
                prev.next = temp.next;
                // if deleted node is last node update last to prev
                if (temp == last) {
                    last = prev;
                }
                return last;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != last.next);

        System.out.println("Node not found");
        return last;
    }

    public void printCLL(Node last) {
        if (last == null) {
            System.out.println("CLL is Empty");
            return;
        }
        Node p = last.next;
        do {
            System.out.print(p.data + " -> ");
            p = p.next;
        } while (p != last.next);

    }

    public static void main(String[] args) {
        Circular_LinkedList cll = new Circular_LinkedList();
        Node last = null;
        last = cll.addToEmpty(last, 0);
        last = cll.addEndCLL(last, 1);
        last = cll.addEndCLL(last, 2);
        last = cll.addEndCLL(last, 3);

        // last = cll.addAfter(last, 10, 1);
        cll.printCLL(last);
        // System.out.println();
        // cll.deleteNode(last, 3);
        // cll.printCLL(last);

    }
}