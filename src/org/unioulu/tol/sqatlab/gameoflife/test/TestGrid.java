package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	private Grid grid = null;
	
	public void setup() {
		this.grid = new Grid(10);
	}
	
	@Test
	public void test5sizeGridLiveNeighBours() {
		/*
		 * a = alive, e = empty, d = dead
		 * ------------------------------
		 * a a e e e
		 * a a e a a
		 * a a e a a
		 * e a e a a
		 * e a e a a
		 */
		Grid grid = new Grid(5);
		grid.setCell(new Cell("Alive"), 0, 0);
		grid.setCell(new Cell("Alive"), 0, 1);
		grid.setCell(null, 0, 2); //null = empty
		//TODO: implement this
		
	}
	/*@Test
	public void testGridSizeNotNegativeOrZero() {
		Grid grid = new Grid(-1);
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}
