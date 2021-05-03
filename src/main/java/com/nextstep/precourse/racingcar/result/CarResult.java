package com.nextstep.precourse.racingcar.result;

import com.nextstep.precourse.racingcar.car.CarName;
import com.nextstep.precourse.racingcar.car.CarPosition;

public class CarResult {

	private CarName carName;
	private CarPosition carPosition;

	public CarResult(CarName carName, CarPosition position) {
		this.carName = carName;
		this.carPosition = position;
	}

	public CarName getCarName() {
		return this.carName;
	}

	public CarPosition getCarPosition() {
		return this.carPosition;
	}
}
