package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state;
	
	public Cell(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void update(int liveNeighours) {
		if(liveNeighbours == 0) {
			this.state = "Dead";
		}
	}
}
