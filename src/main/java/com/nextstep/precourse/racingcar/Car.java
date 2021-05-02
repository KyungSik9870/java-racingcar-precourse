package com.nextstep.precourse.racingcar;

public class Car {
	public static final int INIT_CAR_POSITION = 0;

	private CarName carName;
	private CarPosition carPosition;
	private CarGear carGear;

	public Car(CarName carName) {
		this.carName = carName;
		this.carPosition = new CarPosition(INIT_CAR_POSITION);
		this.carGear = new CarGear();
	}

	public CarPosition getPosition() {
		return this.carPosition;
	}

	public void goForward() {
		this.carPosition = new CarPosition(getPosition().getValue() + 1);
	}

	public void stop() {
		this.carPosition = new CarPosition(getPosition().getValue());
	}

	public void move() {
		int randomNo = this.carGear.getRandomNum();
		CarStatus carStatus = this.carGear.getStatus(randomNo);
		if (carStatus.isForward()) {
			goForward();
		}
		if (carStatus.isStop()) {
			stop();
		}
	}
}
