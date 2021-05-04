package com.nextstep.precourse.racingcar.utils;

public class ValidationUtils {

	public static final int MIN_NUMBER = 0;
	public static final int MAX_NUMBER = 9;

	public static boolean validateNumber(int no) {
		return no >= MIN_NUMBER && no <= MAX_NUMBER;
	}
}
