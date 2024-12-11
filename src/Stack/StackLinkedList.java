package Stack;

import Stack.StackLinkedList.Node.stack;

// import Stack.StackLinkedList.Node.stack;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        static class stack {
            static Node head = null;

            // isEmpty()
            public boolean isEmpty() {
                return head == null;
            }

            // push
            public void push(int data) {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            // pop
            public int pop() {
                if (isEmpty()) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            // peek
            public int peek() {
                if (isEmpty()) {
                    return -1;
                }
                return head.data;
            }

        }
    }

    public static void main(String[] args) {
        // StackLinkedList.Node.stack st = new Stack.StackLinkedList.Node.stack();
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
