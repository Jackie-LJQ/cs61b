public class Queue {
    Node head = null;

    private class Node {
        int val;
        int priority;
        Node next;
        public Node(int x, int priority) {
            this.val = x;
            this.priority = priority;
            this.next = null;
        }
    }

    public void push(int x) {
        Node newNode = new Node(x,x);
        if (head == null) {
            head = newNode;
            return;
        }
        if (newNode.priority > head.priority) {
            newNode.next = head;
            this.head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null && cur.next.priority > newNode.priority) {
            cur = cur.next;
            }
        newNode.next = cur.next;
        cur.next = newNode;
        return;
        }

    public int peek() {
        return head.val;
    }

    public int pop() {
        int res = head.val;
        this.head = head.next;
        return res;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public static void main(String[] args) {
        Queue start = new Queue();
        start.push(5);
        start.push(6);
        start.push(8);
        start.push(3);
        System.out.println(start.peek());
        start.pop();
        System.out.println(start.peek());
    }
}
