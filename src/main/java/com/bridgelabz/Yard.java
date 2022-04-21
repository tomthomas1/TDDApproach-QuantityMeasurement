package com.bridgelabz;

public class Yard {
	private double yard;

	public Yard(double yard) {
		this.yard = yard;
	}

	public Yard() {
    }

	public boolean lengthComparisonYardFeet(double yd, double ft) {
        yd = 3 * yd;
        return yd == ft;
    }

	public boolean lengthComparisonYardInch(double yd, double in) {
		yd = 36 * yd;
        return yd == in;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Yard yard1 = (Yard) o;
		return Double.compare(yard1.yard, yard) == 0;
	}

}
