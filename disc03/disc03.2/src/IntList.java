public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public IntList(int[] l, int i){
        if (i<l.length-1){
            first = l[i];
            rest = new IntList(l, i+1);}
        else
        {first = l[i]; rest = null;}
    }

    public static void removeDuplicates(IntList dummy){
        IntList p = dummy;
        if (p==null || p.rest==null)   return;
        else if (p.first==p.rest.first) {
            p.rest = p.rest.rest;
            removeDuplicates(p);
        }
        else {
            p = p.rest;
            removeDuplicates(p);
        }
    }
}
