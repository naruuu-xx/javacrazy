//���������
public class MathTest
{
	public static void main(String[] args)
	{
		double a = 3.2;//������� a Ϊ 3.2
		//�� a �� 5 �η��� ��������������� b
		double b = Math.pow(a , 5);
		System.out.println(b);//���b��ֵ
		//�� a ��ƽ�����������������c
		double c = Math.sqrt(a);
		System.out.println(c);//���c��ֵ
		//���������������һ��0��1֮���α�����
		double d = Math.random();
		System.out.println(d);//��������d��ֵ
		//��1.57��sin����ֵ��1.57�����ɻ�����
		double e = Math.sin(1.57);
		System.out.println(e);//����ӽ�1
	}
}