package 剑指offer.单例;

/**
 * 单例测试类
 * @author 冯思伟
 *
 */
public class Test {
	public static void main(String[] args) {
		
		Single2 s2_1 = Single2.getInstance();
		Single2 s2_2 = Single2.getInstance();
		if (s2_1 == s2_2) {
			System.out.println("s2是单例");
		}else {
			System.out.println("单例失败");
		}
		Single1 s1_1 = Single1.getInstance();
		Single1 s1_2 = Single1.getInstance();
		if (s1_1 == s1_2) {
			System.out.println("s1是单例");
		}else {
			System.out.println("单例失败");
		}
	}
	/*
	 * 返回结果
	 * 进入了懒汉单例单例的返回方法
		进入了懒汉单例单例的构造方法
		进入了懒汉单例单例的返回方法
		s2是单例
		进入了饿汉单例单例的构造方法
		进入了饿汉单例单例的返回方法
		进入了饿汉单例单例的返回方法
		s1是单例
	 */

}
