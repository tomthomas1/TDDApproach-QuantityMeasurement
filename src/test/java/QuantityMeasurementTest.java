import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.Feet;

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
	
	//TC 1.2 - Null Check
	@Test
    public void given0FeetandNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0);
        Feet feet2 = null;
        Assert.assertNotSame(feet1, feet2);
    }
	
	//TC 1.3 - Reference Check
	@Test
    public void givenFeetandFeetFromSameRef_WhenEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        boolean result = feet1 == feet1;
        Assert.assertTrue(result);
    }
	
	//TC 1.3 - Reference Check With Different values
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

}
