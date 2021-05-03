package com.nextstep.precourse.racingcar;

import java.util.Scanner;

import com.nextstep.precourse.racingcar.race.RacePlay;
import com.nextstep.precourse.racingcar.result.RaceResult;

public class RacingCar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Print.enterRacingCarNamesWithDelimiter();
		String carNames = scanner.next();
		Print.enterHowManyTry();
		int roundCount = scanner.nextInt();

		RacePlay racePlay = new RacePlay(carNames, roundCount);
		RaceResult raceResult = racePlay.playRace();
		System.out.println(raceResult.getPrintMessage());
	}
}
