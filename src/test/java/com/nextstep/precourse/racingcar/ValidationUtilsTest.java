package com.nextstep.precourse.racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.nextstep.precourse.racingcar.utils.ValidationUtils;

public class ValidationUtilsTest {
	@DisplayName("생성한 랜덤숫자가 0에서 9까지의 수인지 테스트.")
	@ParameterizedTest
	@CsvSource(value = {"1:true", "9:true", "0:true", "10:false", "-1:false"}, delimiter = ':')
	void 랜덤숫자_0에서_9까지_검증테스트(int input, boolean expected) {
		assertEquals(ValidationUtils.validateNumber(input), expected);
	}
}
