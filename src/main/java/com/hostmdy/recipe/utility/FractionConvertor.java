package com.hostmdy.recipe.utility;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class FractionConvertor {
	
	private FractionConvertor() {}
	
	public static String convert(BigDecimal decimal) {
		 BigInteger gcd = decimal.unscaledValue().gcd(decimal.scaleByPowerOfTen(decimal.scale()).unscaledValue());

	        // Calculate the numerator and denominator
	     long numerator = decimal.unscaledValue().divide(gcd).longValue();
	     long denominator = decimal.scaleByPowerOfTen(decimal.scale()).unscaledValue().divide(gcd).longValue();

	     return numerator + "/" + denominator;
	}
}
