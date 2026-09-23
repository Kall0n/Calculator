package com.baptiste.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(2, 3)).isEqualTo(5);
        assertThat(calculator.add(-2, 3)).isEqualTo(1);
        assertThat(calculator.add(0, 0)).isEqualTo(0);
    }
}
