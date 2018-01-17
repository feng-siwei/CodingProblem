package 剑指offer.重复数;
/**
 * 二分查找的思路,查找长度不大于n+1时,0-n范围的
 * @author 冯思伟
 *
 */
public class 零至n范围不改变数组 {
	public static void main(String[] args) {
		int [] arr = {2,3,5,4,3,2,6,0};
		System.out.println(duplicate(arr));
	}
	
	public static int duplicate(int [] arr) {
		if (arr==null || arr.length == 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length-1;
		while (end>=start) {
			int mid = ((end - start)>>1)+start;
			int count = 0;
			for (int i : arr) {
				if (i>=start && i<=mid) {
					count ++;
				}
			}
//			结果处理
			if(start == end){
				if (count>1) {
					return mid;
				}else {
					break;
				}
			}
			
			if (count>mid-start+1) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}
}
