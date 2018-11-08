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

    @Test
    public void substitutionFalacy(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        /**
         * Error:(36, 29) java: incompatible types: java.util.List<java.lang.Number> cannot be converted to java.util.List<java.lang.Integer>
         */
        //List<Number> its = list;
        //its.add(2.9);

    }

    public void otherSubstitutionExample(){
        List<Number> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        /**
         * Incompatible types
         */
        //List<Integer> itms = list;
    }

    public  void voidSubstitutionExample2(){
        //List<Number> list = new ArrayList<Integer>();
        /**
         * Incompatible types
         */
    }

}
