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
}
