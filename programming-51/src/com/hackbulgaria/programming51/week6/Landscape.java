package com.hackbulgaria.programming51.week6;

import java.util.ArrayList;

public class Landscape {
	private ArrayList<Tile> tiles = new ArrayList<>();

	public void addTile(Tile t) {
		tiles.add(t);
	}

	public String renderAll() {
		String result = "";
		for (Tile t : tiles) {
			result += t.render();

		}
		return result;
	}
}
