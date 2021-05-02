package com.nextstep.precourse.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	@DisplayName("랜덤한 숫자 생성되는지 테스트.")
	void 랜덤숫자_생성_테스트() {
		Car car = new Car();
		int number = car.getRandomNum();
		assertThat(ValidationUtils.validateNumber(number)).isTrue();
	}

	@Test
	@DisplayName("랜덤한 숫자가 4이상이면 전진을 리턴하는지 테스트.")
	void 랜덤값이_4이상이면_전진(){
		Car car = new Car();
		CarStatus carStatus = car.move(4);
		assertThat(carStatus).isEqualTo(CarStatus.FORWARD);
	}

	@Test
	@DisplayName("랜덤한 숫자가 3이하면 멈춤을 리턴하는지 테스트.")
	void 랜덤값이_3이하면_멈춤(){
		Car car = new Car();
		CarStatus carStatus = car.move(3);
		assertThat(carStatus).isEqualTo(CarStatus.STOP);
	}
}
