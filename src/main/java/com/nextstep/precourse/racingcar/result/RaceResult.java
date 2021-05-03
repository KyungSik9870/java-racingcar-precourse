package com.nextstep.precourse.racingcar.result;

import java.util.List;

public class RaceResult {

	private List<RoundResult> roundResults;

	public RaceResult(List<RoundResult> roundResults) {
		this.roundResults = roundResults;
	}

	public List<RoundResult> getRoundResults() {
		return roundResults;
	}
}
