package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	int size;
	Cell [][] grid;
	
	public Grid(int size) {
		if(size <= 0) {
			throw new IllegalArgumentException("Size must be > 0");
		}
		
		this.size = size;
		this.grid = new Cell[size][size];
	}
	
	public int getSize() {
		return size;
	}
	
	private boolean withinSize(int coord) {
		return coord >= 0 && coord < size;
	}
	
	public Cell getCell(int x, int y) {
		if(!withinSize(x) || !withinSize(y)) {
			throw new IllegalArgumentException("Invalid x or y coordinate!");
		}
		return grid[x][y];
	}
}
