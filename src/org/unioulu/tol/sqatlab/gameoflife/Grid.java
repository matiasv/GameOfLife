package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;
import java.util.List;


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
	
	private List<Cell> getNeighBours(int x, int y) {
		List<Cell> neighBours = new ArrayList<Cell>();
		return null;
	}
	
	public int getSize() {
		return size;
	}
	
	private boolean withinSize(int coord) {
		return coord >= 0 && coord < size;
	}
	
	public void setCell(Cell cell, int x, int y) {
		this.grid[x][y] = cell;
	}
	
	public Cell getCell(int x, int y) {
		if(!withinSize(x) || !withinSize(y)) {
			throw new IllegalArgumentException("Invalid x or y coordinate!");
		}
		return grid[x][y];
	}
}
