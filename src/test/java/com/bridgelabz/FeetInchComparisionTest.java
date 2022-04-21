package com.bridgelabz;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.Feet;
import com.bridgelabz.Inch;

public class FeetInchComparisionTest {

	// 0 Feet = 0 Feet
	@Test
	public void given0FeetAnd0Feet_ShouldReturnEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		assertEquals(feet1, feet2);
	}

	// 0 Inch == 0 Inch
	@Test
	public void given0InchAnd0Inch_ShouldReturnEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		assertEquals(inch1, inch2);
	}

	// 1 Feet = 12 Inches
	@Test
	public void given1FeetAnd12Inch_WhenCorrect_ShouldReturnTrue() {
		Feet feetToInch = new Feet();
		boolean result = feetToInch.lengthComparison(1.0, 12.0);
		assertTrue(result);
	}

	// 12 Inches = 1 Feet
	@Test
	public void given12InchAnd1Feet_WhenCorrect_ShouldReturnTrue() {
		Inch InchToFeet = new Inch();
		boolean result = InchToFeet.lengthComparison(12.0, 1);
		assertTrue(result);
	}

	// 1 Feet != 1 Inch
	@Test
	public void given1FeetAnd1Inch_WhenWrong_ShouldReturnFalse() {
		Feet feetToInch = new Feet();
		boolean result = feetToInch.lengthComparison(1.0, 1.0);
		assertFalse(result);
	}

	// 1 Inch != 1 Feet
	@Test
	public void given1InchAnd1Feet_WhenWrong_ShouldReturnFalse() {
		Feet InchToFeet = new Feet();
		boolean result = InchToFeet.lengthComparison(1.0, 1.0);
		assertFalse(result);
	}
}
