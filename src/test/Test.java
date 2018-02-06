package test;



public class Test {
	public static void main(String[] args) {
		int [] a = {1,2,3};
		int [] b = inverted(a);
		System.out.println(a[2]);
		System.out.println(b[2]);
	}

	private static int[] inverted(int[] a) {
		int [] c = {3,4,5};
		a = c;
		return a;
	}
	


}
