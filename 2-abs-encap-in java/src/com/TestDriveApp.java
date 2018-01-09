package com;

import com.car.Car;
import com.wheel.CEATWheel;
import com.wheel.MRFWheel;
import com.wheel.Wheel;

public class TestDriveApp {

	public static void main(String[] args) {

		Wheel mrfWheel = new MRFWheel();
		Wheel ceatWheel = new CEATWheel();

		Car car = new Car();
		car.setWheel(mrfWheel);
		car.move();

		//-------------------------------------
	}

}
