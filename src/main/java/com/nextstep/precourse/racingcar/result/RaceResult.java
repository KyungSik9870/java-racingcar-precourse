package com.nextstep.precourse.racingcar.result;

import java.util.ArrayList;
import java.util.List;

import com.nextstep.precourse.racingcar.car.CarName;
import com.nextstep.precourse.racingcar.car.CarPosition;

public class RaceResult implements Printable {

	public static final String WINNERS_STRING = "가 최종 우승했습니다.";
	public static final String DELIMITER = ",";
	private List<RoundResult> roundResults;

	public RaceResult(List<RoundResult> roundResults) {
		this.roundResults = roundResults;
	}

	public List<RoundResult> getRoundResults() {
		return roundResults;
	}

	public List<CarName> getWinnersCarName() {
		RoundResult finalRoundResult = this.roundResults.get(roundResults.size() - 1);
		List<CarResult> finalCarResults = finalRoundResult.getCarResults();
		List<CarName> winnersCarName = new ArrayList<>();
		CarPosition maxPosition = getMaxPosition(finalCarResults);

		for (CarResult carResult : finalCarResults) {
			addCarNameIfHasMaxPosition(winnersCarName, carResult, maxPosition);
		}
		return winnersCarName;
	}

	private void addCarNameIfHasMaxPosition(List<CarName> winnersCar, CarResult carResult, CarPosition maxPosition) {
		if (carResult.getCarPosition().equals(maxPosition)) {
			winnersCar.add(carResult.getCarName());
		}
	}

	private CarPosition getMaxPosition(List<CarResult> carResult) {
		int max = 0;
		for (CarResult result : carResult) {
			CarPosition carPosition = result.getCarPosition();
			max = Math.max(max, carPosition.getValue());
		}
		return new CarPosition(max);
	}

	@Override
	public String getPrintMessage() {
		StringBuilder builder = new StringBuilder();
		List<String> winnersCarName = new ArrayList<>();

		for(CarName carName : this.getWinnersCarName()){
			winnersCarName.add(carName.getName());
		}

		builder.append(String.join(DELIMITER,winnersCarName));
		builder.append(WINNERS_STRING);
		builder.append(System.lineSeparator());
		return builder.toString();
	}
}
