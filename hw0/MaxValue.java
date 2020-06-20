public class MaxValue{
  public static int max(int[] x) {
    int maximum = x[0];
    for(int i=0;i<x.length;i++){
      if (maximum < x[i]) {
        maximum = x[i];
      }
    }
    return maximum;
  }
  public static void main(String[] args) {
    int[] x = new int[]{8,10,4,2,3,6};
    System.out.println(max(x));
  }
}
