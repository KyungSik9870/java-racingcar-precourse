package com.nextstep.precourse.racingcar;

import java.util.Objects;

public class CarName {
	public static final int CAR_NAME_MAX_LENGTH = 5;
	private String name;

	public CarName(String name) {
		if (name.length() > CAR_NAME_MAX_LENGTH) {
			throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
		}
		this.name = name;
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
