package com.baptiste.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
    void testAddOverflow() {
        assertThatThrownBy(() -> Calculator.add(Integer.MAX_VALUE, 1))
            .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.add(Integer.MIN_VALUE, -1))
            .isInstanceOf(ArithmeticException.class);
    }

    @Test
    void testDivide() {
        assertThat(Calculator.divide(6, 2)).isEqualTo(3);
        assertThat(Calculator.divide(7, 2)).isEqualTo(3);
        assertThat(Calculator.divide(-6, 2)).isEqualTo(-3);
    }

    @Test
    void testDivideByZero() {
        assertThatThrownBy(() -> Calculator.divide(10, 0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Division par zéro");
    }

    @Test
    void testEnsembleChiffres() {
        Calculator calculator = new Calculator();

        Set<Integer> resultatExemple1 = calculator.ensembleChiffres(7679);
        assertThat(resultatExemple1).containsExactlyInAnyOrder(6, 7, 9);

        Set<Integer> resultatExemple2 = calculator.ensembleChiffres(-11);
        assertThat(resultatExemple2).containsExactly(1);

        Set<Integer> resultatZero = calculator.ensembleChiffres(0);
        assertThat(resultatZero).containsExactly(0);

        Set<Integer> resultatAutre = calculator.ensembleChiffres(-505);
        assertThat(resultatAutre).containsExactlyInAnyOrder(0, 5);
    }
}
