package Test;

/**
 * Created by i.riznychenko on 19.04.2017.
 */
import com.company.MyCalculate;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculateTest
{
    MyCalculate testObj;
    @Before
    public void initialize()
    {
        testObj=new MyCalculate();
    }

    @Test
    public void testCalcSum()
    {
        //testObj=new MyCalculate();
        assertEquals(4,testObj.calcSum(2,2));
    }

    @Test
    public void testCalcMult()
    {
        //testObj=new MyCalculate();
        assertEquals(4,testObj.calcMult(2,2));
    }

    @Test
    public void testCalcSub()
    {
        //testObj=new MyCalculate();
        assertEquals(0,testObj.calcSub(2,2));
    }

    @After
    public void closing()
    {
        System.out.println("Test finished");
    }

}
