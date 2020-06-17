public class SLList<T> implements List<T> {

	private int size;
	private IntNode Sentinel;

	private class IntNode{
		private T item;
		public IntNode next;
		public IntNode(T i, IntNode n){
			item=i;
			next=n;
		}
	}

	public SLList() {
		size = 0;
		Sentinel= new IntNode(null,null);
	}

	public SLList(T x) {
		Sentinel= new IntNode(null,null);
		Sentinel.next=new IntNode(x,null);
		size ++;
	}

	public void addFist(T x) {
		Sentinel.next = new IntNode(x,Sentinel.next);
		size++;
	}


	public T getFirst() {
		return Sentinel.next.item;
	}

	@Override
	public void addLast(T x) {
		IntNode dummy = Sentinel;
		while (dummy.next != null) {
			dummy = dummy.next;
		}
		dummy.next = new IntNode(x, null);
		size = size + 1;
	}

	@Override
	public int size()  {
		return size;
	}

	public void deleteFirst() {
		if (size == 0) {
			return;
		}
		Sentinel.next = Sentinel.next.next;
		size--;
	}


	public void insert(T x, int position) {
		IntNode dummy = Sentinel;
		while (position > 0 ) {
			dummy = dummy.next;
			position -= 1;
		}
		dummy.next = new IntNode(x, dummy.next);
	}

	public void reverse() {
		SLList head = new SLList();
		IntNode dummy = Sentinel.next;
		while (dummy != null) {
			head.addFist(dummy.item);
			dummy = dummy.next;
		}
		Sentinel = head.Sentinel;
	}

	public T get(int position) {
		IntNode dummy = Sentinel;
		while (position > 0) {
			dummy = dummy.next;
		}
		return dummy.item;
	}

	public void print() {
		System.out.println("print SSList print");
		IntNode dummy = Sentinel.next;
		for (int i = 0; i < size; i++) {
			System.out.print(dummy.item + " ");
			dummy = dummy.next;
		}
	}

	public static void main(String[] args) {
		SLList<Integer> first = new SLList();
		first.addFist(2);
		first.addFist(1);
		first.addLast(3);
		first.insert(10,1);
		while (first.Sentinel.next!=null){
			System.out.println(first.getFirst());
			first.Sentinel=first.Sentinel.next;
		}
	}

}