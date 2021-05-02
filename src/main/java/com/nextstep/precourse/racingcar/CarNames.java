package com.nextstep.precourse.racingcar;

import java.util.Arrays;
import java.util.List;

public class CarNames {
	private List<String> carNames;

	public CarNames(String names) {
		this.carNames = Arrays.asList(names.split(","));
	}

	public List<String> getCarNames(CarNames carNames) {
		return this.carNames;
	}
}
