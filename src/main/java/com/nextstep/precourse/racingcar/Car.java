package com.nextstep.precourse.racingcar;

public class Car {
	public static final int CAR_NAME_MAX_LENGTH = 5;
	private String carName;

	public Car(String carName) {
		if(carName.length() > CAR_NAME_MAX_LENGTH){
			throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
		}
		this.carName = carName;
	}
}
