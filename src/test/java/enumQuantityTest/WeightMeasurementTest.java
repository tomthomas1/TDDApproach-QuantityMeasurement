package enumQuantityTest;

import static org.junit.Assert.*;

import org.junit.Test;

import enumQuantity.QuantityMeasurementSystem;
import enumQuantity.Volume;
import enumQuantity.Weight;

public class WeightMeasurementTest {
	// UC 7 : 1 KG = 1000 Grams
	@Test
	public void given1KGAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
		QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KILOGRAM, 1.0);
		QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
		boolean compareCheck = kg.compare(gram);
		assertTrue(compareCheck);
	}

	// UC 7 : 1 Tonne = 1000 KG
	@Test
	public void given1TonneAnd1000KG_WhenCompared_ShouldReturnEqualWeight() {
		QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
		QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KILOGRAM, 1000.0);
		boolean compareCheck = tonne.compare(kg);
		assertTrue(compareCheck);
	}

	//UC 7 : 1 Tonne + 1000 Gm = 1001 Kg
	@Test
	public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
		QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
		QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
		QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Weight.KILOGRAM, 1001.0);
		QuantityMeasurementSystem actualSum = tonne.sumOfQuantity(gram, Weight.KILOGRAM);
		assertEquals(expectedSum, actualSum);
	}

}
