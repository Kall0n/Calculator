package com.baptiste.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testAdd() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
        assertThat(calculator.add(-2, 3)).isEqualTo(1);
        assertThat(calculator.add(0, 0)).isEqualTo(0);
    }

    @Test
    void testDivide() {
        assertThat(calculator.divide(6, 2)).isEqualTo(3);
        assertThat(calculator.divide(7, 2)).isEqualTo(3);
        assertThat(calculator.divide(-6, 2)).isEqualTo(-3);
    }
}
