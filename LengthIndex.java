public class LengthIndex
{
	public static void main(String x[])
	{
	String s=new String("Priyanka");
	int l=s.length();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		System.out.printf("s[%d]------>%c\n",i,ch);
	}
	}
}