import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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

}
