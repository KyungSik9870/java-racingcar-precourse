package com.nextstep.precourse.racingcar;

import java.util.Scanner;

import com.nextstep.precourse.racingcar.race.RacePlay;
import com.nextstep.precourse.racingcar.result.RaceResult;

public class RacingCar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String carNames = scanner.next();
		System.out.println("시도할 회수는 몇회인가요?");
		int roundCount = scanner.nextInt();

		RacePlay racePlay = new RacePlay(carNames, roundCount);
		RaceResult raceResult = racePlay.playRace();
		System.out.println(raceResult.getPrintMessage());
	}
}
