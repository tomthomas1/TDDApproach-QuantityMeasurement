import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.Feet;
import com.bridgelabz.Inch;
import com.bridgelabz.Yard;

public class QuantityMeasurementTest {

	// TC 1.1 - Same Feet value test.
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {
		Feet feet1 = new Feet(0);
		Feet feet2 = new Feet(0);
		assertEquals(feet1, feet2);
	}

	// TC 1.1 - Different Feet value test.
	@Test
	public void given0Feetand1Feet_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(0);
		Feet feet2 = new Feet(1);
		assertNotEquals(feet1, feet2);
	}

	// TC 1.2 - Null Check
	@Test
	public void given0FeetandNullFeet_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(0);
		Feet feet2 = null;
		Assert.assertNotSame(feet1, feet2);
	}

	// TC 1.3 - Reference Check
	@Test
	public void givenFeetandFeetFromSameRef_WhenEqual_ShouldReturnTrue() {
		Feet feet1 = new Feet(0);
		boolean result = feet1 == feet1;
		Assert.assertTrue(result);
	}

	// TC 1.3 - Reference Check With Different values
	@Test
	public void given0Feetand1FeetWithDiffRef_WhenNotEqual_ShouldReturnFalse() {
		Feet feet1 = new Feet(0);
		Feet feet2 = new Feet(1);
		boolean result = feet1 == feet2;
		Assert.assertFalse(result);
	}

	// TC 1.4 - Type Check
	@Test
	public void given0Feetand0FeetFromDifferentType_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0);
		Assert.assertNotSame(feet1, feet2);
	}

	// TC 1.6 - Value check for equality.
	@Test
	public void given0Feetand0Feet_SameValue_ShouldReturnEqual() {
		Feet feet1 = new Feet(1);
		Feet feet2 = new Feet(1);
		assertEquals(feet1, feet2);
	}

	// Inch Test Cases
	// TC 1.7 - Same Inch value test.
	@Test
	public void given0Inchand0Inch_ShouldReturnEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertEquals(inch1, inch2);
	}

	// TC 1.7 - Different Inch value test.
	@Test
	public void given0Inchand1Inch_ShouldReturnNotEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(1.0);
		Assert.assertNotSame(inch1, inch2);
	}

	// TC 1.8 - Inch Null Check
	@Test
	public void given0InchAndNullInch_ShouldReturnNotEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = null;
		Assert.assertNotSame(inch1, inch2);
	}

	// TC 1.9 - Reference Check
	@Test
	public void givenInchAndInchFromSameRef_WhenEqual_ShouldReturnTrue() {
		Inch inch1 = new Inch(0);
		boolean result = inch1 == inch1;
		Assert.assertTrue(result);
	}

	// TC 1.9 - Reference Check with different values.
	@Test
	public void givenInchAndInchWithDiffSameRef_WhenNotEqual_ShouldReturnFalse() {
		Inch inch1 = new Inch(0);
		Inch inch2 = new Inch(1);
		boolean result = inch1 == inch2;
		Assert.assertFalse(result);
	}

	// TC 1.10 - Type Check
	@Test
	public void given0Inchand0InchFromDifferentType_ShouldReturnNotEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0);
		Assert.assertNotSame(inch1, inch2);
	}

	// TC 1.11 - Value check for equality
	@Test
	public void given0Inchand0Inch_SameValue_ShouldReturnEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertEquals(inch1, inch2);
	}

	// TC 1.12 - Value check for different values
	@Test
	public void given0Inchand1Inch_DiffValue_ShouldReturnNotEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(1.0);
		Assert.assertNotEquals(inch1, inch2);
	}

	// Yard Test Cases

	// Same Yard value test.
	@Test
	public void given0Yardand0Yard_ShouldReturnEqual() {
		Yard yard1 = new Yard(0.0);
		Yard yard2 = new Yard(0.0);
		Assert.assertEquals(yard1, yard2);
	}

	// Different Yard value test.
	@Test
	public void given0Yardand1Yard_ShouldReturnNotEqual() {
		Yard yard1 = new Yard(0.0);
		Yard yard2 = new Yard(1.0);
		assertNotEquals(yard1, yard2);
	}

	// Yard Null Check
	@Test
	public void given0YardAndNullYard_ShouldReturnNotEqual() {
		Yard yard1 = new Yard(0.0);
		Yard yard2 = null;
		assertNull(null, yard2);
	}

	// Reference Check
	@Test
	public void givenYardAndYardFromSameRef_WhenEqual_ShouldReturnTrue() {
		Yard yard1 = new Yard(0.0);
		boolean result = yard1 == yard1;
		Assert.assertTrue(result);
	}

	// Yard Type Check
	@Test
	public void given0Yardand0YardFromDifferentType_ShouldReturnNotEqual() {
		Yard yard1 = new Yard(0.0);
		Yard yard2 = new Yard(0);
		Assert.assertNotSame(yard1, yard2);
	}

	// UC2 - 3 Feet = 1 Yard
	@Test
	public void given3FeetAnd1Yard_WhenCorrect_ShouldReturnTrue() {
		Feet feetToYard = new Feet();
		boolean result = feetToYard.lengthComparisonFeetYard(3.0, 1.0);
		assertTrue(result);
	}

	// UC2 - 3 Feet != 2 Yard
	@Test
	public void given3FeetAnd2Yard_WhenWrong_ShouldReturnFalse() {
		Feet feetToYard = new Feet();
		boolean result = feetToYard.lengthComparisonFeetYard(3.0, 2.0);
		assertFalse(result);
	}

	// TC-1.14 1Feet != 1 Yard
	@Test
	public void given1FeetAnd1Yard_WhenWrong_ShouldReturnFalse() {
		Feet feetToYard = new Feet();
		boolean result = feetToYard.lengthComparisonFeetYard(1.0, 1.0);
		assertFalse(result);
	}

	// TC-1.15 1Inch != 1 yard
	@Test
	public void given1InchtAnd1Yard_WhenWrong_ShouldReturnFalse() {
		Inch InchToYard = new Inch();
		boolean result = InchToYard.lengthComparisonInchYard(1.0, 1.0);
		assertFalse(result);
	}

	// TC-1.16 1Yard = 36 Inch
	@Test
	public void given1YardAnd36Inch_WhenCorrect_ShouldReturnTrue() {
		Yard yardToFeet = new Yard();
		boolean result = yardToFeet.lengthComparisonYardInch(1.0, 36.0);
		assertTrue(result);
	}

	// TC-1.17 36Inch = 1 yard
	@Test
	public void given36InchtAnd1Yard_WhenCorrect_ShouldReturnTrue() {
		Inch InchToYard = new Inch();
		boolean result = InchToYard.lengthComparisonInchYard(36.0, 1.0);
		assertTrue(result);
	}
	
	// TC-1.18 1Yard = 3 Feet
		@Test
		public void given1YardAnd3Feet_WhenCorrect_ShouldReturnTrue() {
			Yard yardToFeet = new Yard();
			boolean result = yardToFeet.lengthComparisonYardFeet(1.0, 3.0);
			assertTrue(result);
		}

}
