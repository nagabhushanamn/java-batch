package com.ex;

interface Wheel {
	void rotate();

	void safetyBehav();
}

abstract class MRFAbstractWheel implements Wheel {
	@Override
	public void safetyBehav() {

	}
}

class MRFTwoWheel extends MRFAbstractWheel {
	@Override
	public void rotate() {

	}
}

class MRFFourWheel extends MRFAbstractWheel {
	@Override
	public void rotate() {

	}

}

public class Ex {

	public static void main(String[] args) {

		Wheel wheel = new MRFTwoWheel();

	}

}
