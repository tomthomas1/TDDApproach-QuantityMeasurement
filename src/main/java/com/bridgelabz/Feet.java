package com.bridgelabz;

public class Feet {
	private final int value;

	public Feet(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feet other = (Feet) obj;
		if (value != other.value)
			return false;
		return true;
	}

}
