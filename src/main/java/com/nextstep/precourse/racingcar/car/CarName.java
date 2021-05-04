package com.nextstep.precourse.racingcar.car;

import static com.nextstep.precourse.racingcar.Print.*;

import java.util.Objects;

public class CarName {

	private static final int CAR_NAME_MAX_LENGTH = 5;
	private String name;

	public CarName(String name) {
		if (name.length() > CAR_NAME_MAX_LENGTH) {
			throw new IllegalArgumentException(CAR_NAME_CAN_CONTAINS_5CHARACTERS);
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CarName carName = (CarName)o;
		return Objects.equals(name, carName.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
