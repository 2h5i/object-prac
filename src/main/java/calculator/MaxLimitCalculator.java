package calculator;

import calculator.Calculator;

public class MaxLimitCalculator extends Calculator {

    void add(int val) {
        if (!(super.value + val > 100)) {
            super.value += val;
        }
    }
}
