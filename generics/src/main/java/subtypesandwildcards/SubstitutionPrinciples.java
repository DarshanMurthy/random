package subtypesandwildcards;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Integer is a subtype of Number
 * Double is a subtype of Number
 */

/**
 * ArrayList<E> is a subtype of List<E>
 */

public class SubstitutionPrinciples {
    @Test
    public void subTypeTest(){
        List<Number> list = new ArrayList<Number>();
        list.add(1);
        list.add(3);
        System.out.print(list.toString());
        assert list.toString().equals("[1, 3]");
    }
}
