package com.nextstep.precourse.racingcar;

public class RandomNumber {

	private int no;

	public RandomNumber() {
		generateRandomNumber();
	}

	public int getNumber() {
		return this.no;
	}

	private void generateRandomNumber() {
		this.no = (int)(Math.random() * 9 + 1);
	}
}
