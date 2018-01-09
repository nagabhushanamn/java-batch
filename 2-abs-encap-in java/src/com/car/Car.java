package com.car;

import com.wheel.Wheel;

public class Car {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car Moving...");
	}

}
