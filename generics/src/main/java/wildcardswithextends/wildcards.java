package wildcardswithextends;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class wildcards {
    /**
     * Sometimes we would like to accept
     * not only lists with given type
     * but also lists with any subtypes.
     */
    interface  Collection<E>{
        public boolean addAll(Collection<? extends E> c);
    }

    /**
     * ? extends E --> Some type that is subtype of E
     */

    @Test
    public void collectionWildCardTest(){
        List<Number> nums  = new ArrayList<>();

        List<Integer> itrs = new ArrayList<>();
        itrs.add(1);
        itrs.add(3);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.23);

        nums.addAll(itrs);
        nums.addAll(doubles);
    }


}
