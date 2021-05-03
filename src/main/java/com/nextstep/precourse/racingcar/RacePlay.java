package com.nextstep.precourse.racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacePlay {

	private final Cars cars;
	private final int roundCount;

	public RacePlay(String carNamesString, int roundCount) {
		this.roundCount = roundCount;
		this.cars = new Cars(carNamesString);
	}

	public RaceResult playRace() {
		List<RoundResult> roundResults = new ArrayList<>();
		for (int i = 0; i < roundCount; i++) {
			RoundResult roundResult = new RoundResult(cars);
			roundResults.add(roundResult);
		}
		return new RaceResult(roundResults);
	}
}
