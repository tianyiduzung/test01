/*
System:���еķ��������Զ��Ǿ�̬�ġ�
out����׼�����Ĭ���ǿ���̨��
in����׼���룬Ĭ���Ǽ��̡�

����ϵͳ��һЩ��Ϣ��
 
��ȡϵͳ������Ϣ:Properties getProperties();

*/


import java.util.*;
class SystemDemo
{
	public static void main(String[] args) 
	{
		Properties prop=System.getProperties();

		//��ΪProperties��Hashtable�����࣬Ҳ����Map���ϵ�һ���������
		//��ô����ͨ��map����ȡ���ü����е�Ԫ�ء�
		//�ü��ϴ洢�Ķ����ַ�����û�з��͵Ķ��塣


		//�����ϵͳ���Զ���һЩ������Ϣ�أ�
		System.setProperty("mykey","myvalue");


		//��ȡָ��������Ϣ
		String value=System.getProperty("os.name");
		System.out.println("value="+value);


		//�ɲ�������jvm����ʱ����̬����һЩ������Ϣ�أ�
		String v=System.getProperty("haha","11");
		System.out.println("v="+v);


		/*
		//��ȡ����������Ϣ��
		for(Object obj:prop.keySet())
		{
			String value=(String)prop.get(obj);

			System.out.println(obj+"::"+value);
		}
		*/
	}
}