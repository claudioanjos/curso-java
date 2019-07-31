package util;

public class CurrencyConverter {

	public static double IOF = 6.0 / 100.0;
	
	public static double dollarToReal(double dollar, double bought) {
		return dollar * bought * (1.0 + IOF); 
	}
}
