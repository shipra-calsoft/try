package jUnit_prac;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Math {

	@Test
	public void test() {
	    assertEquals(4,Calculation.add(2,2));
	    assertEquals(2,Calculation.add(0,2));
    	assertEquals(0,Calculation.add(-2,2));
	    assertEquals(3,Calculation.add(-2,5));
	    assertEquals(-4,Calculation.add(-2,-2)); 
		
	}

}
