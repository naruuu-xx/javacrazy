//���������
public class ArithmeticTest{
	public static void main(String[] args)
	{
		double a = 5.2;
		double b = 3.1;
		double sum = a + b;
		double mul = a * b;
		double div = a / b;
		//sum��ֵΪ8.3 mul��ֵΪ16.12 div��ֵΪ1.67419354...
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(div);
		//����������Infinity
		System.out.println("5���� 0.0 �Ľ���ǣ�" + 5 / 0.0);
		//����������-Infinity
		System.out.println("-5���� 0.0 �Ľ���ǣ�" + - 5 / 0.0);
		//�쳣����
		//java.lang.ArithmeticException: /by zero
		System.out.println("-5����0�Ľ���ǣ�" + -5 / 0);
	}
}