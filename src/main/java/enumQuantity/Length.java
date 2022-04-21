package enumQuantity;

public enum Length implements MeasurementUnits {
	CENTI_METER(0.4), INCH(1), FEET(12), YARD(36);

	public final double baseUnitConversion;

	Length(double baseUnitConversion) {
		this.baseUnitConversion = baseUnitConversion;
	}

	public double convertToBaseUnit(QuantityMeasurementSystem obj) {
		return obj.value * baseUnitConversion;
	}
}
