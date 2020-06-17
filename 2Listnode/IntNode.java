public class IntNode
{
  public int item;
  public IntNode next;

  public IntNode(int f, IntNode r)
  {
    item = f;
    next = r;
  }

  public int size()
  {
    if (next == null)
    return 1;
    else
    return 1+this.next.size();
  }

  public int iterationsize()
  {
    int i = 0;
    IntNode p = this;
    while (p!=null)
    {
      i++;
      p = p.next;
    }
    return i;
  }

  public int get(int i)
  {
    if (i==0)
    return item;
    else
    return next.get(i-1);
  }

  /** incrList will increse every element in L
  and return a new IntList*/
  // public static IntNode incrList(IntNode L, int x)
  // {
  //   IntNode newList = new IntNode(0, null);
  //   IntNode Lhead = L;
  //   if (Lhead != null)
  //   newList.next = new IntNode(L.item+x, incrList(L.next, x));
  //   return newList.next;
  // }

  /** dincrList will change the variable L */
  // public static void dincrList(IntNode L, int x)
  // {
  //   IntNode head = L;
  //   while (head != null)
  //   {
  //     head.item += x;
  //     head = head.next;
  //   }
  // }

  public static void main(String[] args)
  {
    IntNode L = new IntNode(15, null);
    L = new IntNode(10, L);
    L = new IntNode(5, L);
    // System.out.println(L.size());
    // IntNode p = incrList(L, 40);
    // System.out.println(L.get(1));
    // System.out.println(p.get(1));
    // dincrList(L, 40);
    // System.out.println(L.get(1));
  }

}
