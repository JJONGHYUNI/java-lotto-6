package lotto.model.constant;

public enum LottoConstant {
    LOTTO_MAX_COUNT(6),
    LOTTO_NUMBER_MIN_RANGE(1),
    LOTTO_NUMBER_MAX_RANGE(45);

    private final int number;

    LottoConstant(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}