package 剑指offer;


public class 快排算法 {
	public static void main(String[] args) {
		int [] a = {50,10,70,50,30,40,60,30,80,90,20};
		sort(a);
		for (int i : a) {
			System.out.print(i+",");
		}
	
		
		
	}
	public static void sort(int[] a) {
		qSort(a, 0, a.length-1);
	}
	
	private static void qSort(int[]a ,int low ,int high){
		int pivot;
		while (low < high) {
			pivot = partition(a, low, high);
			qSort(a, low, pivot-1);
//			qSort(a, pivot+1, high);
//			尾递归
			low=pivot+1;
		}
		
	}
	private static int partition(int[]a ,int low ,int high){
//		三点取值
		int m = low+ (high-low)/2;
		if (a[low]>a[m]) {
			swap(a, low, m);
		}
		if (a[m]>a[high]) {
			swap(a, m, high);
		}
		if (a[low]>a[high]) {
			swap(a, low, high);
		}
		int pivotKey = a[low];
		
		
		while (low<high) {
			while (low<high&&a[high]>=pivotKey) {
				high--;
			}
			a[low]=a[high];
			while (low<high&&a[low]<=pivotKey) {
				low++;
			}
			a[high]=a[low];
			
		}
		a[low]=pivotKey;
		return low;
	}
	private static void swap(int[] a, int low, int high) {
		int tmp= a[low];
		a[low]=a[high];
		a[high] =tmp;
		
	}
	
}
