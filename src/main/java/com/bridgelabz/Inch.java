package com.bridgelabz;

public class Inch {

	private double value;

	public Inch(double value) {
		this.value = value;
	}

	public Inch() {
    }

    public boolean lengthComparison(double in, int ft) {
        ft = ft * 12;
        return ft == in;
    }

    public boolean lengthComparisonInchYard(double in, double yd) {
		yd = 36 * yd;
        return yd == in;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Inch other = (Inch) obj;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}
}
