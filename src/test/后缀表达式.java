package test;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 输入后缀表达式,求值
 * 输入案例
 * 3 4 + 5 * 6 -
 * 输出案例
 * 29
 * 输入案例2
 * 3 2 5 - 6 * 3 / +
 * 输出
 * -3
 */
public class 后缀表达式 {
	public static void main(String[] args) {
		Stack<Double> numStack = new Stack<>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String str = in.nextLine();
			String[] strArr = str.split(" ");
			Pattern pattern = Pattern.compile("-?[0-9]\\d*");
			for (int i = 0; i < strArr.length; i++) {
				Matcher isNum = pattern.matcher(strArr[i]);
				if (isNum.matches()) {
					double num = Double.parseDouble(strArr[i]);
					numStack.push(num);
				}else {
					double a = numStack.pop();
					double b = numStack.pop();
					switch (strArr[i]) {
					case "+":
						b += a;
						break;
					case "-":
						b -= a;
						break;
					case "*":
						b *= a;
						break;
					case "/":
						try {
							b /= a;
						} catch (Exception e) {
							System.out.println("发生错误,被除数为0");
						}
						break;
					default:
						System.out.println("符合有误,请只包含+-*/");
						break;
					}
					numStack.push(b);	
				}
			}
			//输出结果
			System.out.println(numStack.pop());
			
		}
	}
}
