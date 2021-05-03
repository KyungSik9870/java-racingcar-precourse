package com.nextstep.precourse.racingcar.car;

import java.util.ArrayList;
import java.util.List;

public class CarNames {
	
	private List<CarName> carNames;

	public CarNames(String names) {
		this.carNames = new ArrayList<>();
		String[] carNamesArray = names.split(",");
		for (String name : carNamesArray) {
			CarName carName = new CarName(name);
			carNames.add(carName);
		}
	}

	public List<CarName> getCarNames() {
		return this.carNames;
	}
}
