package com.nextstep.precourse.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {
	@Test
	@DisplayName("랜덤한 숫자 생성되는지 테스트.")
	void 랜덤숫자_생성_테스트() {
		RandomNumber randomNumber = new RandomNumber();
		int number = randomNumber.getNumber();
		assertThat(ValidationUtils.validateNumber(number)).isTrue();
	}
}
