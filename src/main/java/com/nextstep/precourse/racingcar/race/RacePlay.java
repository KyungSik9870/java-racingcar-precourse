package com.nextstep.precourse.racingcar.race;

import java.util.ArrayList;
import java.util.List;

import com.nextstep.precourse.racingcar.car.Car;
import com.nextstep.precourse.racingcar.car.Cars;
import com.nextstep.precourse.racingcar.result.CarResult;
import com.nextstep.precourse.racingcar.result.RaceResult;
import com.nextstep.precourse.racingcar.result.RoundResult;

public class RacePlay {

	private final Cars playCars;
	private final RoundCount roundCount;

	public RacePlay(String carNamesString, RoundCount roundCount) {
		this.roundCount = roundCount;
		this.playCars = new Cars(carNamesString);
	}

	public Cars getPlayCars() {
		return this.playCars;
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
		for (Car car : playCars.getCars()) {
			car.move();
			CarResult carResult = new CarResult(car.getCarName(), car.getPosition());
			carResults.add(carResult);
		}
		return new RoundResult(carResults);
	}
}
