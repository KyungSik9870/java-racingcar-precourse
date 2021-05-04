package com.nextstep.precourse.racingcar.car;

import java.util.Random;

public class CarGear {

	private Random random = new Random();

	public int getRandomNum() {
		return random.nextInt(10);
	}

	public CarStatus getStatus(int randomNum) {
		if (randomNum >= 4) {
			return CarStatus.FORWARD;
		}
		return CarStatus.STOP;
	}
}
