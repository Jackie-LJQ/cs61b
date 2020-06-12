import java.util.List;
public class LinkedListDeque<T>{
    private int size;
    private ListNode sentinel;
    private class ListNode{
        public T item;
        public ListNode prev;
        public ListNode next;

        public ListNode(T x, ListNode p, ListNode n){
            item = x; prev=p; next=n;
        }
    }

    public LinkedListDeque(){
        sentinel = new ListNode(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public void addFirst(T item){
        sentinel.next = new ListNode(item, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size++;
    }

    public void addLast(T item){
        sentinel.prev = new ListNode(item, sentinel.prev, null);
        sentinel.prev.prev.next = sentinel.prev;
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        ListNode dummy = sentinel.next;
        while (dummy!=null){
            System.out.print(dummy.item+" ");
            dummy = dummy.next;
        }
        System.out.println();
    }

    public T removeFirst(){
        ListNode res = sentinel.next;
        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;
        size--;
        return res.item;
    }

    public T removeLast(){
        ListNode res = sentinel.prev;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        size--;
        return res.item;
    }

    public T get(int index){
        ListNode dummy = sentinel.next;
        while (index>0){
            dummy = dummy.next;
            index--;
        }
        return dummy.item;
    }

}