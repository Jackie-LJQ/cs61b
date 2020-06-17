public class SLList{
	private static class IntNode{
		public int item;
		public IntNode next;
		public IntNode(int i, IntNode n){
			item=i;
			next=n;
		}
	}

	private int size=0;
	private IntNode Sentinel= new IntNode(0,null);

	public SLList(){
	}

	public SLList(int x){
		Sentinel.next=new IntNode(x,null);
		size ++;
	}

	public SLList(int[] x){
		IntNode dummy = Sentinel;
		for(int i : x){
			dummy.next = new IntNode(i,null);
			dummy=dummy.next;
			size++;
		}
	}
	public void addFist(int x){
		Sentinel.next = new IntNode(x,Sentinel.next);
		size++;
	}
	public int getFirst(){
		return Sentinel.next.item;
	}
	public void addLast(int x){
		IntNode dummy = Sentinel.next;
		while (dummy.next!=null){
			IntNode temp = dummy.next;
			dummy.next=new IntNode(dummy.item,temp);
			dummy = temp;
		}
		dummy.next = new IntNode(dummy.item, new IntNode(x,null));
		size = size*2+1;
	}
	public int size(){
		return size;
	}
	public void deleteFirst(){
		Sentinel.next = Sentinel.next.next;
		size--;
	}
	public void addAdjacent(){
		IntNode dummy = Sentinel.next;
		while (dummy.next!=null){
			if (dummy.item==dummy.next.item){
				IntNode temp = dummy.next.next;
				dummy.item = dummy.item*2;
				dummy.next = temp;
			}
			else
				{dummy = dummy.next;}
		}
	}

	public void insert(int x, int position){
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


	public static void main(String[] args){
		int[] x = new int[]{1,1,2,3,4};
		SLList first = new SLList(x);
		first.insert(10,3);
		while (first.Sentinel.next!=null){
			System.out.println(first.getFirst());
			first.Sentinel=first.Sentinel.next;
		}
	}

}