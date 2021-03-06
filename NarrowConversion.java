//强制转换
public class NarrowConversion
{
	public static void main(String[] args)
	{
		int iValue = 233;
		//强制把一个 int 类型的值转换成为 byte 类型的值
		byte bValue = (byte)iValue;
		//将输出-233
		System.out.println(bValue);
		double dValue = 3.98;
		//强制把一个double类型的数值转换成int类型
		int tol = (int) dValue;
		//将输出3
		System.out.println(tol);
	}
}