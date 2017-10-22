import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet();
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new LinkedHashSet();

        System.out.println("set: " + set);
        System.out.println("set is empty: " + set.isEmpty());

        set.add(12);
        set.add(15);
        set.add(15);
        set.add(25);
        set.add(34);
        set.add(34);

        System.out.println("set: " + set);
        System.out.println("set is empty: " + set.isEmpty());

        set1.add(12);
        set1.add(15);
        set1.add(15);
        set1.add(25);
        set1.add(34);
        set1.add(34);

        System.out.println("set1: " + set1);
        System.out.println("set1 is empty: " + set1.isEmpty());

        set2.add(12);
        set2.add(15);
        set2.add(15);
        set2.add(25);
        set2.add(34);
        set2.add(34);

        System.out.println("set2: " + set2);
        System.out.println("set2 is empty: " + set2.isEmpty());
    }

}
