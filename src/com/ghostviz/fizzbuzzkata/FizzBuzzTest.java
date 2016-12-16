package com.ghostviz.fizzbuzzkata;

import org.junit.Test;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by thejoenichols on 12/15/16.
 */
public class FizzBuzzTest {
    @Test
    public void shouldReturnNumber() {
        assertThatAnswerFor(1, is("1"));
    }

    @Test
    public void shouldReturnFizzIfDivisibleByThree() {
        assertThatAnswerFor(6, is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzIfDivisibleByFive() {
        assertThatAnswerFor(10, is("Buzz"));
    }


    @Test
    public void shouldReturnFizzBuzzIfDivisibleByThreeAndFive() {
        assertThatAnswerFor(30, is("FizzBuzz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForZero() {
        FizzBuzz.getAnswerFor(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegative() {
        FizzBuzz.getAnswerFor(-1);
    }

    private void assertThatAnswerFor(int number, Matcher<String> matcher) {
        assertThat(FizzBuzz.getAnswerFor(number), matcher);
    }
}
