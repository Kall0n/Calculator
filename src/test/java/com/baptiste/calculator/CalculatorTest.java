package com.baptiste.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void testAdd() {
        assertThat(Calculator.add(2, 3)).isEqualTo(5);
        assertThat(Calculator.add(-2, 3)).isEqualTo(1);
        assertThat(Calculator.add(0, 0)).isEqualTo(0);
    }

    @Test
    void testDivide() {
        assertThat(Calculator.divide(6, 2)).isEqualTo(3);
        assertThat(Calculator.divide(7, 2)).isEqualTo(3);
        assertThat(Calculator.divide(-6, 2)).isEqualTo(-3);
    }
}
