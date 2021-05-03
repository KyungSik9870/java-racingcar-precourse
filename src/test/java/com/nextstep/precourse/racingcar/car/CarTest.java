package com.nextstep.precourse.racingcar.car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

	@ParameterizedTest
	@ValueSource(strings = {"abcf", "aaaaa"})
	@DisplayName("자동차의 이름이 6자 이상이면 Exception을 발생시키는지 테스트.")
	void 자동차이름_5자이하면_생성되는지_테스트(String carName) {
		new CarName(carName);
	}

	@ParameterizedTest
	@ValueSource(strings = {"abcdef", "aaaaaaa"})
	@DisplayName("자동차의 이름이 6자 이상이면 Exception을 발생시키는지 테스트.")
	void 자동차이름_6자이상일때_exception_발생하는지_테스트(String carName) {
		assertThrows(IllegalArgumentException.class, () -> new CarName(carName));
	}

	@Test
	@DisplayName("자동차가 생성되면 초기 위치는 0인지 테스트.")
	void 자동차가_생성되면_위치는_0인지_테스트() {
		Car car = new Car(new CarName("abcde"));
		assertEquals(car.getPosition().getValue(), 0);
	}

	@Test
	@DisplayName("자동차가 전진했을때 위치가 1 증가하는지 테스트.")
	void 자동차가_전진했을때_위치가_1증가하는지_테스트() {
		Car car = new Car(new CarName("abcde"));
		CarPosition beforeCarPosition = car.getPosition();
		car.goForward();
		CarPosition afterCarPosition = car.getPosition();
		assertEquals(beforeCarPosition.getValue() + 1, afterCarPosition.getValue());
	}

	@Test
	@DisplayName("자동차가 멈췄을때 위치가 그대로인지 테스트.")
	void 자동차가_멈췄을때_위치가_그대로인는지_테스트() {
		Car car = new Car(new CarName("abcde"));
		CarPosition beforeCarPosition = car.getPosition();
		car.stop();
		CarPosition afterCarPosition = car.getPosition();
		assertEquals(beforeCarPosition.getValue(), afterCarPosition.getValue());
	}

	@Test
	@DisplayName("자동차가 랜덤한 값에 맞게 전진 또는 멈추는지 테스트.")
	void 자동차가_랜덤한값에_맞게_전진하거나멈추는지_테스트() {
		Car car = new Car(new CarName("abcde"));
		CarPosition beforeCarPosition = car.getPosition();
		car.move();
		CarPosition afterCarPosition = car.getPosition();

		boolean isForward = beforeCarPosition.getValue() + 1 == afterCarPosition.getValue();
		boolean isStop = beforeCarPosition.getValue() == afterCarPosition.getValue();
		assertTrue(isForward || isStop);
	}
}
