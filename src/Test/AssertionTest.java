package Test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by i.riznychenko on 19.04.2017.
 */
public class AssertionTest {
    @Test
    public void test()
    {
        String s1="str1";
        String s2="str1";
        String s3="test";
        String s4="test";
        String s5=null;
        int a1=1,a2=2;
        int []arr1={1,2,3};
        int []arr2={1,2,3};
        assertEquals(s1,s2);
        assertSame(s3,s4);
        assertNotSame(s2,s4);
        assertNotNull(s1);
        assertNull(s5);
        assertTrue(a1==a2);
        assertArrayEquals(arr1,arr2);
    }


}
