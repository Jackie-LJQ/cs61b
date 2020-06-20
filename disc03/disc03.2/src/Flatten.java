public class Flatten {
    public static int[] flatten(int[][] x){
        int l=0;
        for (int[] y: x){
            l+=y.length;
        }
        int[] res = new int[l];
        int k = 0;
        for (int[] y:x){
            for (int z:y){
                res[k]=z;
                k++;
            }
        }
        return res;
    }
}
