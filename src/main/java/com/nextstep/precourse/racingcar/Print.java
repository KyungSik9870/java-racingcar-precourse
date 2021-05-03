package com.nextstep.precourse.racingcar;

public class Print {

	public static final String ENTER_CAR_NAMES_WITH_DELIMITER = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String ENTER_HOW_MANY_TRY_ROUND = "시도할 회수는 몇회인가요?";

	public static void enterRacingCarNamesWithDelimiter() {
		System.out.println(ENTER_CAR_NAMES_WITH_DELIMITER);
	}

	public static void enterHowManyTry() {
		System.out.println(ENTER_HOW_MANY_TRY_ROUND);
	}
}
