package com.ghostviz.primefactorskata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thejoenichols on 12/15/16.
 */
public class PrimeFactors {

    public static List<Integer> computeFactorsFor(int n) {
        ArrayList<Integer> factors =  new java.util.ArrayList<>();

        for(int candidate = 2; n > 1; candidate++) {
            for(; n % candidate == 0; n /= candidate) {
                factors.add(candidate);
            }
        }
        return factors;
    }
}