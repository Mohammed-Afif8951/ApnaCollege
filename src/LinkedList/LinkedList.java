package LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step 1: create a new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: newNode.next = head
        newNode.next = head;
        // Step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step 1: create a new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        // step 2: tail.next = newNode
        tail.next = newNode;

        // step 3: tail = newNode
        tail = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in any index
    public void add(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < indx - 1) { // go to indx indx-1th location (prev)
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data; // or head.data it is same
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (key == temp.data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        // Base case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);

        if (indx == -1) {
            return -1;
        }

        return indx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // Reverse a LL (Iterative)
    public void reverse() {
        Node prev = null;
        Node cur = tail = head;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void deleteNthNodeFromEnd(int n) {
        // calculate size for interview and coding platform test
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // remove first (remove head)
        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n; // prev
        Node prev = head;
        while (i < iToFind) { // go to prev
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow is the mid node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1: find mid node
        Node midNode = findMid(head);

        // step 2: reverse second half (after mid node)

        // if 1-> 2-> 3 -> 4-> 5-> null
        // after reverse second half nodes
        // 1-> 2-> 3-> null 5-> 4-> 3-> null

        Node prev = null;
        Node cur = midNode;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        Node right = prev; // right half's head
        Node left = head;

        // step 3: check left half == right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public boolean findCyclesInLL() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find the meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // removing cycle -> last.next = null
        prev.next = null;
    }

    // Merge Sort

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    private Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // mid Node
    }

    public Node merge_Sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // Right half and left half
        Node rightHead = mid.next;
        mid.next = null;

        Node newleft = merge_Sort(head);
        Node newright = merge_Sort(rightHead);

        return merge(newleft, newright);
    }

    public static void zigzagLL(Node head) {
        // step 1: find mid (last node of left half)
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // step 2: reverse right half
        Node cur = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // step 3: make zigzag(alternate node)
        Node rightHead = prev; 
        Node leftHead = head;
        Node nextL, nextR;
        while (leftHead != null && rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            // update leftHead && rightHead
            leftHead = nextL;
            rightHead = nextR;
        }
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.printLL();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printLL();

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        // ll.removeFirst();
        // ll.printLL();

        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.size);

        // System.out.println(ll.iterativeSearch(3));

        // System.out.println(ll.recursiveSearch(3));

        // ll.reverse();

        // ll.deleteNthNodeFromEnd(3);

        // System.out.println(ll.checkPalindrome());
        // System.out.println(ll.findCyclesInLL());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // // ll.printLL();
        // System.out.println(ll.findCyclesInLL());
        // ll.removeCycle();
        // ll.printLL();

        // Merge Sort
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.addFirst(6);
        // ll.printLL();
        // ll.head = ll.merge_Sort(head);
        // ll.printLL();

        // zigzig LL
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLL();
        ll.zigzagLL(head);
        ;
        ll.printLL();

    }
}
