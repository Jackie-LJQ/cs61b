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


	public SLList(int x){
		Sentinel.next=new IntNode(x,null);
		size ++;
	}
	public void addFist(int x){
		Sentinel.next = new IntNode(x,Sentinel.next);
		size++;
	}
	public int getFirst(){
		return Sentinel.next.item;
	}
	public void addLast(int x){
		size++;
		IntNode dummy = Sentinel;
		while (dummy.next!=null){
			dummy=dummy.next;
		}
		dummy.next = new IntNode(x,null);

	}
	public int size(){
		return size;
	}
}