public class Calculate {
	
	public static double square (double num) {
		return num * num;
	}
	
	public static double cube (double num) {
		return num * num * num;
	}
	
	public static double average (double num1, double num2) {
		return (num1 + num2) / 2;
	}
	
	public static double toDegrees(double num) {
		return (num * 180) / 3.14159;
	}
	
	public static double toRadians(double num) {
		return (num * 3.14159) / 180;
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}
	
	public static String toImproperFrac(int num1, int num2, int num3) {
		return (num1 * num3) + num2 + "/" + (num3);
	}
	
	public static String toMixedNum(int num1, int num2) {
		return num1 / num2 + "_" + num1 % num2 + "/" + num2;
	}
	
	public static String foil(int num1, int num2, int num3, int num4, String variable) {
		return num1 * num3 + variable + "^2 + " + ((num1 * num4) + (num2 * num3)) + variable + " + " + num4 * num2;
	}
}