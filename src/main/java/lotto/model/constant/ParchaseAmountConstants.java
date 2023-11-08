package lotto.model.constant;

public enum ParchaseAmountConstants {
    PARCHASE_AMOUNT_UNIT(1000),
    POSITIVE_BENCHMARK(0),
    DIVISIBLE_THOUSAND(0);

    private final int number;

    ParchaseAmountConstants(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
