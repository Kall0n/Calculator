package com.baptiste.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void testAdd() {
        assertThat(Calculator.add(2, 3)).isEqualTo(5);
        assertThat(Calculator.add(-2, 3)).isEqualTo(1);
        assertThat(Calculator.add(0, 0)).isEqualTo(0);
    }

    @ParameterizedTest
    @CsvSource({
        "0, 1, 1",
        "1, 2, 3",
        "-2, 2, 0",
        "0, 0, 0",
        "-1, -2, -3"
    })
    void testAddParameterized(int opG, int opD, int resultatAttendu) {
        assertThat(Calculator.add(opG, opD)).isEqualTo(resultatAttendu);
    }

    @Test
    void testDivide() {
        assertThat(Calculator.divide(6, 2)).isEqualTo(3);
        assertThat(Calculator.divide(7, 2)).isEqualTo(3);
        assertThat(Calculator.divide(-6, 2)).isEqualTo(-3);
    }
}
