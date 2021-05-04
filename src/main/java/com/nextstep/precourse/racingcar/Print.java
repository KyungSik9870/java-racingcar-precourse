package com.nextstep.precourse.racingcar;

public class Print {

	public static final String ENTER_CAR_NAMES_WITH_DELIMITER = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String ENTER_HOW_MANY_TRY_ROUND = "시도할 회수는 몇회인가요?";
	public static final String CAR_NAME_CAN_CONTAINS_5CHARACTERS = "자동차 이름은 5자 이하만 가능합니다.";
	public static final String WINNERS_STRING = "가 최종 우승했습니다.";
	public static final String DELIMITER = ",";
	public static final String PLAY_RESULT_STRING = "실행 결과";
	public static final String STR_FORMAT_BETWEEN_NAME_AND_MOVE = " : ";
	public static final String CAR_MOVE = "-";

	public static void enterRacingCarNamesWithDelimiter() {
		System.out.println(ENTER_CAR_NAMES_WITH_DELIMITER);
	}

	public static void enterHowManyTry() {
		System.out.println(ENTER_HOW_MANY_TRY_ROUND);
	}

	public static void printMessage(String message) {
		System.out.println(message);
	}
}
