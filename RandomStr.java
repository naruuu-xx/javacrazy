public class RandomStr
{
	public static void main(String[] args)
	{
		//����һ�����ַ���
		String result = "";
		//����6��ѭ��
		for (int i = 0 ; i < 6 ; i ++)
		{
			//����һ��97-122֮���int��������
			int intVal = (int) (Math.random() * 26 + 97);
			//��intValueǿ��ת��Ϊchar���ͺ����ӵ�result����
			result = result + (char) intVal;
		}
		//�������ַ���
		System.out.println(result);
	}
}