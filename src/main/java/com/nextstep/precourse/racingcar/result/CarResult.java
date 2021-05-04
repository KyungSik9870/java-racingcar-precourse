package com.nextstep.precourse.racingcar.result;

import static com.nextstep.precourse.racingcar.Print.*;

import java.util.Collections;

import com.nextstep.precourse.racingcar.car.CarName;
import com.nextstep.precourse.racingcar.car.CarPosition;

public class CarResult implements Printable {

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

	@Override
	public String getPrintMessage() {
		StringBuilder builder = new StringBuilder();
		builder.append(carName.getName())
			.append(STR_FORMAT_BETWEEN_NAME_AND_MOVE)
			.append(String.join("", Collections.nCopies(carPosition.getValue(), CAR_MOVE)));
		return builder.toString();
	}
}
