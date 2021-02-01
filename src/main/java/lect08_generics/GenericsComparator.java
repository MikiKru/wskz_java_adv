package lect08_generics;

import java.util.*;

public class GenericsComparator {
    private Collection collection1;
    private Collection collection2;

    private boolean isLonger(Collection c1, Collection c2) {
        return c1.size() > c2.size();
    }

    public static void main(String[] args) {
        GenericsComparator gp = new GenericsComparator();
        System.out.println(gp.isLonger(
                new ArrayList(Arrays.asList(1, 2, 3)),
                new HashSet(Arrays.asList(4, 5, 6, 7, 8))
        ));
        System.out.println(gp.isLonger(
                new ArrayDeque(Arrays.asList(1,1,1,1, 2, 3)),
                new TreeSet()
        ));
    }
}
