package com.ghostviz.primefactors1217;

import java.util.ArrayList;

/**
 * Created by thejoenichols on 12/18/16.
 */
public class PrimeFactors {
    public static ArrayList<Integer> computeFactorsFor(int n) {

        ArrayList<Integer> factors = new java.util.ArrayList<Integer>();

        for(int candidate = 2; n > 1; candidate++) {
            for (; n % candidate == 0; n /= candidate) {
                factors.add(candidate);
            }
        }

        return factors;
    }
}
