package com.ghostviz.primefactorskata;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by thejoenichols on 12/15/16.
 */
public class PrimeFactorsTest {

    @Test
    public void oneHasNoPrimeFactor() {
        assertEquals(asList(), PrimeFactors.computeFactorsFor(1));
    }

    @Test
    public void twoHasOnlyItselfAsAPrimeFactor() {
        assertEquals(asList(2), PrimeFactors.computeFactorsFor(2));
    }

    @Test
    public void threeHasOnlyItselfAsAPrimeFactor() {
        assertEquals(asList(3), PrimeFactors.computeFactorsFor(3));
    }

    @Test
    public void fourHasTwoTimesTwoAsPrimeFactors() {
        assertEquals(asList(2,2), PrimeFactors.computeFactorsFor(4));
    }

    @Test
    public void fiveHasOnlyItselfAsAPrimeFactor() {
        assertEquals(asList(5), PrimeFactors.computeFactorsFor(5));
    }

    @Test
    public void sixHasTwoAndThreeAsPrimeFactors() {
        assertEquals(asList(2,3), PrimeFactors.computeFactorsFor(6));
    }

    @Test
    public void eightHasTwoThreeTimesAsPrimeFactors() {
        assertEquals(asList(2,2,2), PrimeFactors.computeFactorsFor(8));
    }

    @Test
    public void nineHasThreeTwiceASPrimeFactors() {
        assertEquals(asList(3,3), PrimeFactors.computeFactorsFor(9));
    }

    @Test
    public void TenHasTwoAndFiveAsPrimeFactors() {
        assertEquals(asList(2,5), PrimeFactors.computeFactorsFor(10));
    }
}

