package test;

public class Test {
	public static void main(String[] args) {
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		Integer i3 = 1;
		Integer i4 = 128;
		Integer i5 = 128;
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i4==i5);
		
		StringBuffer s1 = new StringBuffer(10);
		System.out.println(s1+","+s1.length()+","+s1.capacity());
	}

}
