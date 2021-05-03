package com.nextstep.precourse.racingcar.car;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CarNamesTest {
	@Test
	void 쉼표로_자동차이름을_구분짓는지_테스트() {
		CarNames carNames = new CarNames("abc,defg,hijk,lmnop");
		List<CarName> carNamesList = carNames.getCarNames();
		List<CarName> expectedList = new ArrayList<>();
		for (String name : "abc,defg,hijk,lmnop".split(",")) {
			CarName carName = new CarName(name);
			expectedList.add(carName);
		}
		assertEquals(carNamesList, expectedList);
	}
}
