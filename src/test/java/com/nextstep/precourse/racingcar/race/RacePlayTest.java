package com.nextstep.precourse.racingcar.race;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nextstep.precourse.racingcar.car.Car;
import com.nextstep.precourse.racingcar.car.CarName;
import com.nextstep.precourse.racingcar.car.Cars;
import com.nextstep.precourse.racingcar.result.RaceResult;
import com.nextstep.precourse.racingcar.result.RoundResult;

public class RacePlayTest {

	private RacePlay racePlay;

	@BeforeEach
	void setUp() {
		this.racePlay = new RacePlay("pobi,crong,honux", new RoundCount(5));
	}

	@Test
	@DisplayName("사용자가 입력한 회수만큼 자동차가 움직인 결과가 저장되는지 테스트.")
	void 사용자가_입력한_회수만큼_자동차의_움직임이_저장되는지_테스트() {
		RaceResult raceResults = racePlay.playRace();
		assertEquals(raceResults.getRoundResults().size(), 5);
	}

	@Test
	@DisplayName("입력된 자동차의 수만큼 라운드에 움직임이 저장되는지 테스트.")
	void 라운드결과에_자동차의_움직임이_자동차_수만큼_저장되는지_테스트() {
		RaceResult raceResult = racePlay.playRace();
		List<RoundResult> roundResult = raceResult.getRoundResults();
		for (RoundResult result : roundResult) {
			assertEquals(result.getCarResults().size(), 3);
		}
	}

	@Test
	@DisplayName("결과에서 우승한 자동차 이름을 추출하는지 테스트.")
	void 결과에서_우승한_자동차이름_찾기_테스트() {
		RaceResult raceResult = racePlay.playRace();
		List<CarName> winnersCarName = raceResult.getWinnersCarName();

		Cars playCars = racePlay.getPlayCars();
		List<Car> cars = playCars.getCars();
	 	List<CarName> sampleCarNames = new ArrayList<>();
	 	for(Car car : cars){
	 		sampleCarNames.add(car.getCarName());
		}

	 	assertThat(sampleCarNames.containsAll(winnersCarName)).isTrue();
	}
}
