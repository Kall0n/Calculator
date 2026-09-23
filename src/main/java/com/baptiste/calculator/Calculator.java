package com.baptiste.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD) {
        return Math.addExact(opG, opD);
    }

    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return opG / opD;
    }

    public Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        String str = String.valueOf(Math.abs((long) pNombre));
        for (char c : str.toCharArray()) {
            chiffres.add(c - '0');
        }
        return chiffres;
    }
}
