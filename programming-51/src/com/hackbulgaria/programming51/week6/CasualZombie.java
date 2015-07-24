package com.hackbulgaria.programming51.week6;

public class CasualZombie implements Zombie {

	private int health;

	public CasualZombie(int health) {
		this.health = health;
	}

	@Override
	public int getTotalHealth() {
		return health;
	}

	@Override
	public int getCurrentHealth() {
		return health;
	}

	@Override
	public void hit(int damage) {
		health -= damage;
		if (health <= 0) {
			health = 0;
		}

	}

	@Override
	public boolean isDead() {
		return health == 0;
	}

}
