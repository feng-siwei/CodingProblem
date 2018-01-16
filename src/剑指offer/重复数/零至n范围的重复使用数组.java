package 剑指offer.重复数;

public class 零至n范围的重复使用数组 {
	/**
	 * 这种方法只能处理0-n范围的长度需"要为n+1(防止n的交换,长度不足需要补足,长度过长不需要处理),
	 * 优点尽管需要两个循环,但每个数字子最多只需要两个小孩就可能找到
	 * 所以时间复杂度为n,空间只需要1
	 * 而HashSet时间也为n,但空间也需要一个n的HashSet,但适用范围更广
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr ={1,2,3,4,6,3,0};
		System.out.println(duplicate(arr));

	}

	private static boolean duplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i) {
				if (arr[i] == arr[arr[i]]) {
					System.out.println("重复数字为"+arr[i]);
					return false;
				}
				
				int temp = arr[i];
				//注意数组的长度
				arr[i] = arr[arr[i]];
				arr[temp] = temp;
				
			}
			
		}
		return true;
	}

}
