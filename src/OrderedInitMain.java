import java.util.ArrayList;
import java.util.TreeSet;

public class OrderedInitMain {

    public static void main(String... args){
        class OrderedArrayList extends ArrayList<Integer> implements OrderedInts {};
        final OrderedInts some = new OrderedArrayList();
        some.add(1);
        some.add(2);
        some.add(3);

        class OrderedTreeSet extends TreeSet<Integer> implements OrderedInts {};
        final OrderedInts others = new OrderedTreeSet();
        others.add(3);
        others.add(2);
        others.add(1);

        System.out.println(some.compareTo(others)); // 1,2,3 = 1,2,3

        others.add(4);
        System.out.println(some.compareTo(others)); // 1,2,3 < 1,2,3,4

        some.add(6);
        System.out.println(some.compareTo(others)); // 1,2,3,6 > 1,2,3,4

        some.remove(3);
        System.out.println(some.compareTo(others)); // 1,2,6 < 1,2,3,4

    }
