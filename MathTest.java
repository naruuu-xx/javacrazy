//复杂运算符
public class MathTest
{
	public static void main(String[] args)
	{
		double a = 3.2;//定义变量 a 为 3.2
		//求 a 的 5 次方， 并将其计算结果赋给 b
		double b = Math.pow(a , 5);
		System.out.println(b);//输出b的值
		//求 a 的平方根，并将结果赋给c
		double c = Math.sqrt(a);
		System.out.println(c);//输出c的值
		//计算随机数，返回一个0到1之间的伪随机数
		double d = Math.random();
		System.out.println(d);//输出随机数d的值
		//求1.57的sin函数值：1.57被当成弧度数
		double e = Math.sin(1.57);
		System.out.println(e);//输出接近1
	}
}