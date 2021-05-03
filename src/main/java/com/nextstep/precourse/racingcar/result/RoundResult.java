package com.nextstep.precourse.racingcar.result;

import java.util.List;

public class RoundResult implements Printable {

	private List<CarResult> carResults;

	public RoundResult(List<CarResult> carResults) {
		this.carResults = carResults;
	}

	public List<CarResult> getCarResults() {
		return this.carResults;
	}

	@Override
	public String getPrintMessage() {
		StringBuilder builder = new StringBuilder();
		for (CarResult carResult : carResults) {
			builder.append(carResult.getPrintMessage());
			builder.append(System.lineSeparator());
		}
		builder.append(System.lineSeparator());
		return builder.toString();
	}
}
