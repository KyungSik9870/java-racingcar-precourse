package com.nextstep.precourse.racingcar;

import java.util.List;

public class RoundResult {

	private List<CarResult> carResults;

	public RoundResult(List<CarResult> carResults) {
		this.carResults = carResults;
	}

	public List<CarResult> getCarResult() {
		return this.carResults;
	}
}
