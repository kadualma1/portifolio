package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public static double dollarPrice = 0.0;
	
	public static double realPrice (double reais) {
		return (reais * dollarPrice) * (1 + IOF);
	}
	
}
