//算术运算符
public class ArithmeticTest{
	public static void main(String[] args)
	{
		double a = 5.2;
		double b = 3.1;
		double sum = a + b;
		double mul = a * b;
		double div = a / b;
		//sum的值为8.3 mul的值为16.12 div的值为1.67419354...
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(div);
		//输出正无穷大：Infinity
		System.out.println("5除以 0.0 的结果是：" + 5 / 0.0);
		//输出负无穷大：-Infinity
		System.out.println("-5除以 0.0 的结果是：" + - 5 / 0.0);
		//异常代码
		//java.lang.ArithmeticException: /by zero
		System.out.println("-5除以0的结果是：" + -5 / 0);
	}
}