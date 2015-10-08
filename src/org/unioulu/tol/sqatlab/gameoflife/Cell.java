package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state;
	
	public Cell(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void update(int liveNeigbhours) {
		if(this.getState() == "Alive") {
			updateLiveCell(liveNeigbhours);
		}
		if(liveNeighours == 0) {
			this.state = "Dead";
		}
	}
	
	private void updateLiveCell(int liveNeighbours) {
		if(liveNeighbours < 2) {
			this.state = "Dead";
		}
	}
}
