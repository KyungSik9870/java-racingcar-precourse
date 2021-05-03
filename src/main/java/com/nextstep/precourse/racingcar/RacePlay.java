package com.nextstep.precourse.racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacePlay {

	private final Cars cars;
	private final RoundCount roundCount;

	public RacePlay(String carNamesString, RoundCount roundCount) {
		this.roundCount = roundCount;
		this.cars = new Cars(carNamesString);
	}

	public RaceResult playRace() {
		List<RoundResult> roundResults = new ArrayList<>();
		for (int i = 0; i < roundCount.getValue(); i++) {
			RoundResult roundResult = playRound();
			roundResults.add(roundResult);
		}
		return new RaceResult(roundResults);
	}

	private RoundResult playRound() {
		List<CarResult> carResults = new ArrayList<>();
		for (Car car : cars.getCars()) {
			car.move();
			CarResult carResult = new CarResult(car.getCarName(), car.getPosition());
			carResults.add(carResult);
		}
		return new RoundResult(carResults);
	}
}
