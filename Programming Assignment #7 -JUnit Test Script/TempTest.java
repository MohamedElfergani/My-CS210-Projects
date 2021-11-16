import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempTest {
	Temperature  temperature = new Temperature();
	
	

	@Test
    public void testToFahrenheit() {
		double tempInC = 10;
	       double tempInFarenhite = temperature.toFahrenheit(tempInC);
	       assertEquals(50, tempInFarenhite, 2);
	}
	public void testToCelcius() {	
		 double tempInFarenhite = 50;
	       double tempInC = temperature.toCelsius(tempInFarenhite);
	       assertEquals(10, tempInC, 2);
	   }
}
