package com.hackbulgaria.programming51.week6;

public abstract class Weapon {
	protected int damage;
	protected int durability;
	protected int maxDurability;

	public Weapon(int damage, int durability) {
		this.damage = damage;
		this.durability = durability;
	}

	public int getDamage() {
		return damage;
	}

	public int getDurability() {
		return maxDurability;
	}

	public abstract String getType();

	public abstract void hit();

}
