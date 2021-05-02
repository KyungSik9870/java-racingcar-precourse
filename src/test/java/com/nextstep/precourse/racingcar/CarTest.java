package com.nextstep.precourse.racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {
	@ParameterizedTest
	@ValueSource(strings = {"abcf", "aaaaa"})
	@DisplayName("자동차의 이름이 6자 이상이면 Exception을 발생시키는지 테스트.")
	void 자동차이름_5자이하면_생성되는지_테스트(String carName){
		new Car(carName);
	}

	@ParameterizedTest
	@ValueSource(strings = {"abcdef", "aaaaaaa"})
	@DisplayName("자동차의 이름이 6자 이상이면 Exception을 발생시키는지 테스트.")
	void 자동차이름_6자이상일때_exception_발생하는지_테스트(String carName) {
		assertThrows(IllegalArgumentException.class, () -> new Car(carName));
	}
}
