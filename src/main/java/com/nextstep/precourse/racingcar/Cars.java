package com.nextstep.precourse.racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	List<Car> cars;

	public Cars(String carNamesString) {
		this.cars = new ArrayList<>();
		CarNames carNames = new CarNames(carNamesString);
		for (CarName carName : carNames.getCarNames()) {
			this.cars.add(new Car(carName));
		}
	}

	public List<Car> getCars() {
		return this.cars;
	}
}
