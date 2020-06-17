public class Sort {

    public static void sortArray(String[] x, int start){
        if (start==x.length-1){
            return;
        }
        int smallestindex = findSmallest(x, start);
        swap(x, start, smallestindex);
        sortArray(x, start+1);
    }

    public static int findSmallest(String[] x, int start){
        int index = start;
        for (int i=start+1; i<x.length; i++){
            int cmp = x[i].compareTo(x[index]);
            if (cmp<0){
                index = i;
            }
        }
        return index;
    }

    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
