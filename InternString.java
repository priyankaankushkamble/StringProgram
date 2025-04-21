public class InternString
{
	public static void main(String x[])
	{
		String s="Good Morning";
		String s1=s.intern();
		System.out.println(s1);
	}
}