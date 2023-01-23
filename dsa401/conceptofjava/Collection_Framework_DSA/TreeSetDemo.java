import java.util.*;
import java.util.Comparator;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyCom());
        t.add(5);
        t.add(7);
        t.add(17);
        t.add(35);
        System.out.println(t);
    }
}

class MyCom implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if (i1 > i2) {
            return -1;
        } else if (i1 < i2) {
            return 1;
        } else {
            return 0;
        }
    }
}