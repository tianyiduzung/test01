/*
3�� ��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
	"abkkcdkkefkkskk"
	˼·��
	1���������������
	2����ȡkk��һ�γ��ֵ�λ��
	3���ӵ�һ������λ�ú�ʣ����ַ����м�����ȡkk���ֵ�λ��
		ÿ��ȡһ�ξͼ���һ��
	4������ȡ����ʱ��������ɡ�

*/

class StringTest2 
{

	//��ϰ��
	public static int getSubCount(String str,String key)
	{
		int count=0;
		int index=0;

		while((index=str.indexOf(key))!=-1)
		{
			sop("str="+str);
			str=str.substring(index+key.length());
			count++;
		}
		return count;
	}

	//��ϰ������ʽ��
	public static int getSubCount_2(String str,String key)
	{
		int count=0;
		int index=0;

		while((index=str.indexOf(key,index))!=-1)
		{
			sop("index="+index);
			index=index+key.length();
			count++;
		}
		return count;
	}


	public static void main(String[] args) 
	{
		String str="abkkcdkkefkkskk";
		//sop("count==="+str.split("kk").length);������ʹ��

		sop("count="+getSubCount_2(str,"kk"));
	}

	public static void sop(String str)
	{
		System.out.println(str);
	}
}