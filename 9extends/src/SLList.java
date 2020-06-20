public class SLList<T> {

	private class IntNode{
		public T item;
		public IntNode next;
		public IntNode(T i, IntNode n){
			item = i;
			next = n;
		}
	}

	private int size;
	private IntNode Sentinel;

	public SLList() {
		size = 0;
		Sentinel = new IntNode(null, null);
	}

	public SLList(T x) {
		Sentinel = new IntNode(null, null);
		Sentinel.next = new IntNode(x, null);
		size = 1;
	}


	public void addFist(T x) {
		Sentinel.next = new IntNode(x, Sentinel.next);
		size++;
	}
	public T getFirst() {
		return Sentinel.next.item;
	}


	public void addLast(T x) {
		IntNode dummy = Sentinel;
		while (dummy.next != null){
			dummy = dummy.next;
		}
		dummy.next = new IntNode(x, null);
		size = size + 1;
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		IntNode dummy = Sentinel.next;
		while (i > 0) {
			dummy = dummy.next;
		}
		return dummy.item;
	}

	public T removeFirst() {
		if (size == 0) {
			return null;
		}
		T res = Sentinel.next.item;
		Sentinel.next = Sentinel.next.next;
		size--;
		return res;
	}

	public T removeLast() {
		if (size == 0) {
			return null;
		}
		IntNode dummy = Sentinel;
		for (int i = 1; i < size; i++) {
			dummy = dummy.next;
		}
		T res = dummy.next.item;
		dummy.next = null;
		return res;
	}

	public void insert(T x, int position){
		IntNode dummy = Sentinel;
		while (position > 0 ){
			dummy = dummy.next;
			position-=1;
		}
		dummy.next = new IntNode(x, dummy.next);
	}

	public void reverse(){
		SLList head = new SLList();
		IntNode dummy = Sentinel.next;
		while (dummy!=null){
			head.addFist(dummy.item);
			dummy = dummy.next;
		}
		Sentinel = head.Sentinel;
	}

	public void print() {
		IntNode dummy = Sentinel.next;
		while(dummy != null) {
			System.out.print(dummy.item + " ");
			dummy = dummy.next;
		}
		System.out.println();
	}


//	public static void main(String[] args){
//		int[] x = new int[]{1,1,2,3,4};
//		SLList<Integer> first = new SLList();
//		for (int i : x) {
//			first.addLast(i);
//		}
//		first.insert(10,3);
//		first.print();
//		System.out.println(first.removelast());
//		}
	}