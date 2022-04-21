package enumQuantityTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import enumQuantity.Length;
import enumQuantity.QuantityMeasurementSystem;

public class LengthComparisionTest {

	// TC 1.1 - 0 Feet and 0 Feet
	@Test
	public void given0FeetAnd0Feet_ShouldReturnEqual() {
		QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		assertEquals(feet1, feet2);
	}

	@Test
	public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
		QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
		assertNotEquals(feet1, feet2);
	}

	// TC 1.2 - Feet Null Check
	@Test
	public void given0FeetAndNull_ShouldReturnNotEquals() {
		QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		QuantityMeasurementSystem feet2 = null;
		assertNull(feet2);
	}

	// TC 1.13 - Reference Check
	@Test
	public void given0FeetAnd0FeetFromDiffRef_ShouldReturnNotSameRef() {
		QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		assertNotSame(feet1, feet2);
	}

	// TC 1.14 - Feet Type Check Check
	@Test
	public void givenFeetAndInch_WhenDiffType_ShouldReturnNotSame() {
		QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		assertNotSame(inch1, inch2);
	}

	// TC 1.17 - 0 Inch and 0 Inch
	@Test
	public void given0InchAnd0Inch_ShouldReturnEqual() {
		QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		assertEquals(inch1, inch2);
	}

	@Test
	public void given0InchAnd1Inch_ShouldReturnNotEqual() {
		QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 1.0);
		assertNotEquals(inch1, inch2);
	}

	// TC - 1.18 Inch Null Check
	@Test
	public void given0InchAndNull_ShouldReturnNotEquals() {
		QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		QuantityMeasurementSystem inch2 = null;
		assertNotEquals(inch1, inch2);
	}

	// TC 1.19 - Inch Reference Check
	@Test
	public void givenInchAndInchFromDiffRef_ShouldReturnNotSame() {
		QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		assertNotSame(inch1, inch2);
	}

	// TC 1.20 - Inch Type Check Check
	@Test
	public void givenInchAndFeet_WhenDiffType_ShouldReturnNotSame() {
		QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
		QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
		assertNotSame(inch1, inch2);
	}

	@Test
	public void given0FeetAnd0Inch_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 0.0);
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 0.0);
		boolean compareCheck = feet.compare(inch);
		assertTrue(compareCheck);
	}

	@Test
	public void given0FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 0.0);
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
		boolean compareCheck = feet.compare(inch);
		assertFalse(compareCheck);
	}

	// TC 1 Feet = 12 Inch
	@Test
	public void given1FeetAnd12Inch_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 12.0);
		boolean compareCheck = feet.compare(inch);
		assertTrue(compareCheck);
	}

	// TC 12 Inch = 1 Feet
	@Test
	public void given12InchAnd1Feet_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 12.0);
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
		boolean compareCheck = inch.compare(feet);
		assertTrue(compareCheck);
	}

	@Test
	public void given1InchAnd1Feet_WhenCompared_ShouldReturnFalse() {
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
		boolean compareCheck = inch.compare(feet);
		assertFalse(compareCheck);
	}

	@Test
	public void given1FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
		boolean compareCheck = feet.compare(inch);
		assertFalse(compareCheck);
	}

	// TC - 0 Yard = 0 Yard
	@Test
	public void given0YardAnd0Yard_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
		QuantityMeasurementSystem yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
		boolean compareCheck = yard1.compare(yard2);
		assertTrue(compareCheck);
	}

	@Test
	public void given0YardAnd1Yard_WhenCompared_ShouldReturnFalse() {
		QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
		QuantityMeasurementSystem yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
		boolean compareCheck = yard1.compare(yard2);
		assertTrue(compareCheck);
	}

	// TC - Yard Null Check
	@Test
	public void given0YardAndNull_ShouldReturnNotEqual() {
		QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
		QuantityMeasurementSystem yard2 = null;
		assertNotEquals(yard1, yard2);
	}

	// TC - Yard Reference Check
	@Test
	public void given0YardAnd0YardFromDiffRef_ShouldReturnNotSameRef() {
		QuantityMeasurementSystem Yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
		QuantityMeasurementSystem Yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
		assertNotSame(Yard1, Yard2);
	}

	// TC 1.13 - 3 Feet = 1 Yard
	@Test
	public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
		QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
		boolean compareCheck = feet.compare(yard);
		assertTrue(compareCheck);
	}

	// TC 1.14 - 1 Feet != 1 Yard
	@Test
	public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
		QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
		boolean compareCheck = feet.compare(yard);
		assertFalse(compareCheck);
	}

	// TC 1.15 - 1 Inch != 1 Yard
	@Test
	public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
		QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
		boolean compareCheck = inch.compare(yard);
		assertFalse(compareCheck);
	}

	// TC 1.16 - 36 Inch = 1 Yard
	@Test
	public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
		QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
		boolean compareCheck = inch.compare(yard);
		assertTrue(compareCheck);
	}

	// TC 1.17 - 1 Yard = 36 Inch
	@Test
	public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
		boolean compareCheck = yard.compare(inch);
		assertTrue(compareCheck);
	}

	// TC 1.18 - 1 Yard = 3 Feet
	@Test
	public void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
		QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
		boolean compareCheck = yard.compare(feet);
		assertTrue(compareCheck);
	}

	// Centimeter
	// TC - 0 CM = 0 CM
	@Test
	public void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
		QuantityMeasurementSystem cm1 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
		QuantityMeasurementSystem cm2 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
		assertEquals(cm1, cm2);
	}

	// UC 3 - 2 Inch = 5 CM
	@Test
	public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
		QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 5.0);
		boolean compareCheck = inch.compare(cm);
		assertTrue(compareCheck);
	}
	
	// TC - 0 CM != 1 CM
	@Test
	public void given0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
		QuantityMeasurementSystem cm1 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
		QuantityMeasurementSystem cm2 = new QuantityMeasurementSystem(Length.CENTI_METER, 1.0);
		assertNotEquals(cm1, cm2);
	}

	// TC - 5 CM = 2 Inch
	@Test
	public void given5CmAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
		QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 5.0);
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
		boolean compareCheck = cm.compare(inch);
		assertTrue(compareCheck);
	}
	
	// UC 4 : 2 Inch + 2 Inch = 4 Inch
	@Test
	public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
		QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 2.0);
		QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 2.0);
		QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 4.0);
		QuantityMeasurementSystem actualSum = inch1.sumOfQuantity(inch2, Length.INCH);
		assertEquals(expectedSum, actualSum);
	}

	// UC 4 : 1 Feet + 2 Inch = 14 Inch
	@Test
	public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
		QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
		QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 14.0);
		QuantityMeasurementSystem actualSum = feet.sumOfQuantity(inch, Length.INCH);
		assertEquals(expectedSum, actualSum);
	}

	// UC 4 : 1 Feet + 1 Feet = 24 Inch
	@Test
	public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
		QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
		QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
		QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 24.0);
		QuantityMeasurementSystem actualSum = feet1.sumOfQuantity(feet2, Length.INCH);
		assertEquals(expectedSum, actualSum);
	}

	// UC 4 : 2 Inch + 2.5 CM = 3 Inch
	@Test
	public void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
		QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
		QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 2.5);
		QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 3.0);
		QuantityMeasurementSystem actualSum = inch.sumOfQuantity(cm, Length.INCH);
		assertEquals(expectedSum, actualSum);
	}
}
