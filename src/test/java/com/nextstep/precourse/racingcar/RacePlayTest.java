package com.nextstep.precourse.racingcar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacePlayTest {

	private RacePlay racePlay;

	@BeforeEach
	void setUp(){
		this.racePlay = new RacePlay("pobi,crong,honux", 5);
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
			assertEquals(result.getCarResult().size(), 3);
		}
	}
}
