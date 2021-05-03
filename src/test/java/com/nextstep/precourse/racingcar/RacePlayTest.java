package com.nextstep.precourse.racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RacePlayTest {
	@Test
	void 사용자가_입력한_회수만큼_자동차의_움직임이_저장되는지_테스트() {
		RacePlay racePlay = new RacePlay("pobi,crong,honux", 5);
		RaceResult raceResults = racePlay.playRace();
		assertEquals(raceResults.getRoundResults().size(), 5);
	}
}
