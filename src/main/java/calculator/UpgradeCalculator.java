package calculator;

import calculator.Calculator;

public class UpgradeCalculator extends Calculator {

    public UpgradeCalculator() {
        super();
    }

    void minus(int val) {
        super.value -= val;
    }
}
