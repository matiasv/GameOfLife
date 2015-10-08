package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state;
	
	public Cell(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void update(int liveNeighbours) {
		if(this.getState() == "Alive") {
			updateLiveCell(liveNeighbours);
		} else {
			updateDeadCell(liveNeighbours);
		}
	}
	
	private void updateDeadCell(int liveNeighbours) {
		if(liveNeighbours == 3) {
			this.state = "Alive";
		} 
	}
	
	private void updateLiveCell(int liveNeighbours) {
		if(liveNeighbours < 2) {
			this.state = "Dead";
			return;
		}
		
		if(liveNeighbours == 2 || liveNeighbours == 3) {
			this.state = "Alive";
		}
		
		if(liveNeighbours > 3) {
			this.state = "Dead";
		}
	}
}
