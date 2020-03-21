package fi.tuni;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionArrayManipulationTest {

	@Test
	public void testArrayManipulationCase1() {
		
		int[][] test = {{1,2,100},{2,5,100},{3,4,100}};
		long result = SolutionArrayManipulation.arrayManipulation(5, test);
		assertEquals(200, result);
		
	}
	
	@Test
	public void testArrayManipulationCase2() {
		
		int[][] test = {{1,2,100},{2,5,100},{3,4,100}};
		long result = SolutionArrayManipulation.arrayManipulation(-1, test);
		assertEquals(4, result);
		
		
	}
	
	@Test
	public void testArrayManipulationCase3() {
		
		int[][] test = new int[0][0];
		long result = SolutionArrayManipulation.arrayManipulation(-1, test);
		assertEquals(4, result);
		
		
	}

}
