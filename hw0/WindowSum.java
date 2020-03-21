public class WindowSum{
  public static void windowPosSum(int[] a, int n) {
    for (int i = 0; i < a.length; i++) {
      int x = 0;
      if (a[i]<0) {
        x = a[i];
      }
      else if (i < a.length - n){
        for (int j=0; j<=n; j++) {
          x = x+a[i+j];
        }
        }
      else {
          for (int j=0; j<=a.length-i-1; j++) {
            x = x+a[i+j];
          }
      }

    a[i] = x;
    }
  }
  public static void main(String[] args) {
    int[] a = {1, -1, -1, 10, 5, -1};
    int n = 2;
    windowPosSum(a,n);
    System.out.println(java.util.Arrays.toString(a));
  }
}









//
