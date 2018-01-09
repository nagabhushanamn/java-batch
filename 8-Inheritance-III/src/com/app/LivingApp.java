package com.app;

import com.app.god.God;
import com.app.live.Animal;
import com.app.live.Human;
import com.app.live.LivingThing;
import com.app.live.Robot;

public class LivingApp {

	public static void main(String[] args) {

		God god = new God();

		// LivingThing livingThing = new LivingThing();
		Human human = new Human();
		Animal animal = new Animal();
		Robot robot = new Robot();

		//

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
		// god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);

	}

}
