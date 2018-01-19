package 剑指offer;

public class 二维数组查找 {
	public static void main(String[] args) {
		int [] [] matrix={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(new 二维数组查找().find(matrix, 3));
		
		
	}
	private boolean find(int[] [] matrix,int number) {
		if(matrix == null || matrix.length == 0){
			return false;
		}
		for (int i = matrix[0].length-1; i >= 0; i--) {
			if (matrix[0][i] <= number) {
				for (int j = 0; j < matrix.length; j++) {
					if (matrix[j][i] >= number) {
						//小矩阵搜索,如果数组巨大其实还可以从左下角比较一次
						for (int i2 = i; i2 >= 0; i2--) {
							for (int j2 = j; j2 < matrix.length; j2++) {
								if (matrix[j2][i2] == number) {
									System.out.println("找到数字,位置为"+j2+","+i2);
									return true;
								}
							}
						}
						System.out.println("数组中未找到目标数字");
						return false;
					}
				}
			}
		}
		
		return false;

	}
}
