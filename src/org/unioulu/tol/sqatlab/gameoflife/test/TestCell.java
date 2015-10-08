package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	
	@Test
	public void testLiveCellWithNoNeighboursDies() {
		Cell cell = new Cell("Alive");
		cell.update(0);
		assertEquals("Dead",cell.getState());
	}
	
	@Test
	public void testLiveCellWith1NeighbourDies() {
		Cell cell = new Cell("Alive");
		cell.update(1);
		assertEquals("Dead",cell.getState());
	}

}
