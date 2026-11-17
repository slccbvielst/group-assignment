package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HarmonicTest {
	
	private double DELTA = 0.000000001;
	
	
	@Test
	void harmonic_positiveNumber() 
	{
		assertEquals(1.5, Recursion.harmonic(2), DELTA);
	}
	
	@Test
	void harmonic_negativeNumber()
	{
		assertEquals(-1.5, Recursion.harmonic(-2), DELTA);
	}
	
	void harmonic_zero()
	{
		assertThrows(IllegalArgumentException.class, () -> { 
			   Recursion.harmonic(0); 
			}); 
	}

}
