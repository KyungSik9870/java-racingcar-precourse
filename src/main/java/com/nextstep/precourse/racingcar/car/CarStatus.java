package com.nextstep.precourse.racingcar.car;

public enum CarStatus {
	STOP, FORWARD;

	public boolean isForward() {
		return this == FORWARD;
	}

	public boolean isStop() {
		return this == STOP;
	}
}
