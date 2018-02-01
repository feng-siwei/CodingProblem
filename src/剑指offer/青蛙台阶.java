package 剑指offer;

public class 青蛙台阶 {
	public static void main(String[] args) {
		int step = 1;
		if (step<0) {
			System.out.println("输入有误");
		}
		long result = step == 0 ? 0 : (fibonacci(step+1));
		
		System.out.println(result);
	}
	
	private static long fibonacci(int n) {
		int [] result = {0,1};
		if (n<2) {
			return result[n];
		}
		long fibOne = 0;
		long fibTwo = 1;
		long sun = 0;
		for (int i = 2; i <= n; i++) {
			sun = fibOne+fibTwo;
			fibOne =fibTwo;
			fibTwo = sun;
		}
		return sun;
	}
}
