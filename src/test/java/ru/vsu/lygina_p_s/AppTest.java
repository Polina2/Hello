package ru.vsu.lygina_p_s;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void test() {
        assertEquals(4, 2 + 2);
    }

    public void testMatrixAdd() {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] m2 = {
                {-9, -8, -7},
                {-6, -5, -4},
                {-3, -2, -1}
        };
        int[][] expected = {
                {-8, -6, -4},
                {-2, 0, 2},
                {4, 6, 8}
        };

        int[][] actual = App.matrixAdd(m1, m2);

        assertTrue(Arrays.deepEquals(actual, expected));
    }
}
