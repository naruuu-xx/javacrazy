//mod��������
public class ModTest
{
	public static void main(String[] args)
	{
		double a = 5.2;
		double b = 3.1;
		double mod = a % b;
		System.out.println(mod);//mod��ֵΪ2.1
		System.out.println("5��0.0����Ľ���ǣ�" + 5 % 0.0);//�������
		System.out.println("-5.0��0����Ľ���ǣ�" + -5.0 % 0);//�������
		System.out.println("0��5.0����Ľ���ǣ�" + 0 % 5.0);//���0.0
		System.out.println("0��0.0����Ľ���ǣ�" + 0 % 0.0);//�������
		//�쳣����
		System.out.println("-5��0����Ľ���ǣ�" + -5 % 0);
	}
}