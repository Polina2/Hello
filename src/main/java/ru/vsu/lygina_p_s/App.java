package ru.vsu.lygina_p_s;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int[][] matrixAdd(int[][] m1, int[][] m2) {
        int[][] res = null;
        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            res = new int[m1.length][m1[0].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = m1[i][j] + m2[i][j];
                }
            }
        }
        return res;
    }
}
