package com.nextstep.precourse.racingcar.result;

import java.util.List;

public class RoundResult {

	private List<CarResult> carResults;

	public RoundResult(List<CarResult> carResults) {
		this.carResults = carResults;
	}

	public List<CarResult> getCarResults() {
		return this.carResults;
	}
}
