//ǿ��ת��
public class NarrowConversion
{
	public static void main(String[] args)
	{
		int iValue = 233;
		//ǿ�ư�һ�� int ���͵�ֵת����Ϊ byte ���͵�ֵ
		byte bValue = (byte)iValue;
		//�����-233
		System.out.println(bValue);
		double dValue = 3.98;
		//ǿ�ư�һ��double���͵���ֵת����int����
		int tol = (int) dValue;
		//�����3
		System.out.println(tol);
	}
}