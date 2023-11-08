package lotto.model;

import lotto.model.constant.RankConstants;

public class Rank {
    private int firstPlace = RankConstants.RANK_INITIAL_VALUE.getNumber();
    private int secondPlace = RankConstants.RANK_INITIAL_VALUE.getNumber();
    private int thirdPlace = RankConstants.RANK_INITIAL_VALUE.getNumber();
    private int fourthPlace = RankConstants.RANK_INITIAL_VALUE.getNumber();
    private int fifthPlace = RankConstants.RANK_INITIAL_VALUE.getNumber();
    private int totalWinningAmount = 0;

    public void addFirstPlace() {
        firstPlace += RankConstants.MATCHING_INCRESE_COUNT.getNumber();
    }

    public void addSecondPlace() {
        secondPlace += RankConstants.MATCHING_INCRESE_COUNT.getNumber();
    }

    public void addThirdPlace() {
        thirdPlace += RankConstants.MATCHING_INCRESE_COUNT.getNumber();
    }

    public void addFourthPlace() {
        fourthPlace += RankConstants.MATCHING_INCRESE_COUNT.getNumber();
    }

    public void addFifthPlace() {
        fifthPlace += RankConstants.MATCHING_INCRESE_COUNT.getNumber();
    }
}