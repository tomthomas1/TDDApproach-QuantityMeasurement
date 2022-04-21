package enumQuantityTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import enumQuantity.QuantityMeasurementSystem;
import enumQuantity.Temperature;

public class TemperatureMeasurementTest {

	// UC 8 : 212 F = 100 C
	@Test
	public void given212DegFAnd100DegC_WhenCompared_ShouldReturnEqualTemp() {
		QuantityMeasurementSystem DegF = new QuantityMeasurementSystem(Temperature.DEG_F, 212.0);
		QuantityMeasurementSystem DegC = new QuantityMeasurementSystem(Temperature.DEG_C, 100.0);
		boolean compareCheck = DegF.compare(DegC);
		assertTrue(compareCheck);
	}

}
