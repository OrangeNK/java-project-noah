public class DoMath {
	
	public static void main(String[] args) {
		
		double pi = 3.14159;
		
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5, 7));
		System.out.println(Calculate.toDegrees(pi/6));
		System.out.println(Calculate.toRadians(30));
		System.out.println(Calculate.discriminant(2, -3, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2,  3,  6,  -7,  "n"));
	}
}
