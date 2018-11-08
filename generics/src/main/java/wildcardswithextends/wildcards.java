package wildcardswithextends;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> itrs = Arrays.asList(1,3);
        List<Double> doubles = Arrays.asList(1.23,4.8);
        nums.addAll(itrs);
        nums.addAll(doubles);
        assert nums.toString().equals("[1, 3, 1.23, 4.8]");
    }


}
