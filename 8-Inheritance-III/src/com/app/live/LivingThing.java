
package com.app.live;

public abstract class LivingThing {

	// common variables

	// common methods

	public void eat() {
		System.out.println("LT eat()");
	}

	public final void sleep() {
		System.out.println("LT sleep");
	}

	public abstract void work();
}
