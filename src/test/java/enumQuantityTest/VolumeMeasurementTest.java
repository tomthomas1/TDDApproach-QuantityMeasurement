package enumQuantityTest;

import static org.junit.Assert.*;

import org.junit.Test;

import enumQuantity.Length;
import enumQuantity.QuantityMeasurementSystem;
import enumQuantity.Volume;

public class VolumeMeasurementTest {
	// TC : 0 Gallon = 0 Gallon
	@Test
	public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
		QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
		QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
		assertEquals(gallon1, gallon2);
	}

	// TC : 1 Gallon != 2 Gallon
	@Test
	public void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
		QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 2.0);
		assertNotEquals(gallon1, gallon2);
	}

	// TC : Gallon Null Check
	@Test
	public void given1GallonAndNull_ShouldReturnNotEqualVolume() {
		QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		QuantityMeasurementSystem gallon2 = null;
		assertNotEquals(gallon1, gallon2);
	}

	// TC : Gallon Reference Check
	@Test
	public void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
		QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		assertNotSame(gallon1, gallon2);
	}

	// TC : Gallon Type Check
	@Test
	public void given1GallonAnd1FeetFromDiffType_ShouldReturnNotEqual() {
		QuantityMeasurementSystem volume = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		QuantityMeasurementSystem length = new QuantityMeasurementSystem(Length.FEET, 1.0);
		assertNotEquals(volume, length);
	}

	//  Liter Check
	// 0 Liter = 0 Liter
	@Test
	public void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
		QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
		QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
		assertEquals(liter1, liter2);
	}

	@Test
	public void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
		QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 1.0);
		QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 2.0);
		assertNotEquals(liter1, liter2);
	}

	@Test
	public void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
		QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 0.0);
		boolean compareCheck = gallon.compare(liter);
		assertTrue(compareCheck);
	}

	@Test
	public void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
		QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
		boolean compareCheck = gallon.compare(liter);
		assertFalse(compareCheck);
	}

	// UC 5 : 1 Gallon = 3.78 Litres
	@Test
	public void given1GallonAnd3_78Liter_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
		boolean compareCheck = gallon.compare(liter);
		assertTrue(compareCheck);
	}

	// UC 5 : 3.78 Liter = 1 Gallon
	@Test
	public void given3_78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
		QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
		boolean compareCheck = liter.compare(gallon);
		assertTrue(compareCheck);
	}

	// UC 5 : 1 Litre = 1000 Ml
	@Test
	public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
		QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
		boolean compareCheck = liter.compare(ml);
		assertTrue(compareCheck);
	}

	// UC 5 : 1000 Ml = 1 Litres
	@Test
	public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
		QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
		boolean compareCheck = ml.compare(liter);
		assertTrue(compareCheck);
	}
}
