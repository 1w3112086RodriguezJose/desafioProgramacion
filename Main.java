
package DesafioProgramacion;

import java.math.BigInteger;


public class Main {

   final static BigInteger M = new BigInteger("2021");

    private static BigInteger compute(long n) {

        String s = "";

        for (long i = 0; i < n; i++) {

            s = s + n;
            //System.out.println(s); 
        }
        
        return new BigInteger(s.toString()).mod(M);

    }

    public static void main(String args[]) {

        for (long n : new long[]{1L, 2L, 5L, 10L, 20L}) {

            System.out.println("compute:" + n + ": " + compute(n));
            System.out.println("divisolve:" + n + ": " + Divisolve.compute(n));

        }
        long bigOne = 67489454811002199L;
        //System.out.println(new BigInteger( String.valueOf(bigOne) ).mod(M));
        System.out.println("divisolve the big one: " + Divisolve.compute(bigOne));
    }
}
