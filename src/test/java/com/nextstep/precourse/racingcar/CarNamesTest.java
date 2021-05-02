package com.nextstep.precourse.racingcar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CarNamesTest {
	@Test
	void 쉼표로_자동차이름을_구분짓는지_테스트() {
		CarNames carNames = new CarNames("abc,defg,hijk,lmnop");
		List<String> carNamesList = carNames.getCarNames(carNames);
		List<String> expectedList = Arrays.asList("abc", "defg", "hijk", "lmnop");
		assertEquals(carNamesList, expectedList);
	}
}
