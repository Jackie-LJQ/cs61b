import java.util.Comparator;

public class Maximizer {
//    public static OurCompare max(OurCompare[] x) {
//        OurCompare res = x[0];
//        for (OurCompare i : x) {
//            if (i.CompareTo(res) > 0) {
//                res = i;
//            }
//        }
//        return res;
//    }

    public static Comparable max(Comparable[] x) {
        Comparable res = x[0];
        Comparator Namecomparator = Dog2.getNameComparator();
        for (Comparable i : x) {
//            if (i.compareTo(res) > 0) {
            if (Namecomparator.compare(i, res) > 0){
                res = i;
            }
        }
        return res;
    }

}
