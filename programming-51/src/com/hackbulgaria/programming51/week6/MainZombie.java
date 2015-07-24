package com.hackbulgaria.programming51.week6;

import java.util.Scanner;
import java.util.Vector;

public class MainZombie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zAmbiesCount = scanner.nextInt();
		int zAmbiesHealth = scanner.nextInt();

		String weapon = scanner.next();
		Weapon a;

		switch (weapon) {
		case "axe": {
			a = new Axe();
			break;
		}
		case "shotgun": {
			a = new Shotgun();
			break;
		}
		case "sword": {
			a = new AncientSword();
			break;
		}
		case "revolver": {
			a = new Revolver();
			break;
		}
		default: {
			System.out.println("Invalid weapon");
		}
		Vector<Zombie> zombies = new Vector<>();
		for (int i = 0; i <zAmbiesCount; i ++){
			zombies.addElement(new CasualZombie(zAmbiesHealth));
		}
		int counter = 0;
		for(int i = 0; i < zombies.size(); i ++){
			Zombie current = zombies.get(i);
			while(!current.isDead());
			current.hit(w.hit());
			counter ++;
		}
		
		
		
		
		
		for(int = 0; i < zombies.size(); i ++){
			
		}
		}
	}
}
