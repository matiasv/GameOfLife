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
	
	@Test
	public void testLiveCellWith2NeighboursLives() {
		Cell cell = new Cell("Alive");
		cell.update(2);
		assertEquals("Alive",cell.getState());
	}
	
	@Test
	public void testLiveCellWith3NeighboursLives() {
		Cell cell = new Cell("Alive");
		cell.update(3);
		assertEquals("Alive",cell.getState());
	}
	
	@Test
	public void testLiveCellWitHMoreThan3NeighboursDies() {
		Cell cell = new Cell("Alive");
		cell.update(4);
		assertEquals("Dead",cell.getState());
	}
	
	@Test
	public void testDeadCellWith3NeighboursResurects() {
		Cell cell = new Cell("Dead");
		cell.update(3);
		assertEquals("Alive",cell.getState());
	}
	
	@Test
	public void testDeadCellWithNot3NeighBoursStaysDead() {
		Cell cell = new Cell("Dead");
		cell.update(4);
		assertEquals("Dead",cell.getState());
		
		cell = new Cell("Dead");
		cell.update(2);
		assertEquals("Dead",cell.getState());
	}

}
