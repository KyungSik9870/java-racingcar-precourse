package com.nextstep.precourse.racingcar;

public class Car {

	public int getRandomNum() {
		return (int)(Math.random() * 9 + 1);
	}

	public CarStatus move(int randomNum) {
		if (randomNum >= 4) {
			return CarStatus.FORWARD;
		}
		return CarStatus.STOP;
	}
}
