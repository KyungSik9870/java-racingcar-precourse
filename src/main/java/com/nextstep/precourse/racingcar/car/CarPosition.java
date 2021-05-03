package com.nextstep.precourse.racingcar.car;

import java.util.Objects;

public class CarPosition {
	
	private int value;

	public CarPosition(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CarPosition that = (CarPosition)o;
		return value == that.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
