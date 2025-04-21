public class ReplaceString
{
	public static void main(String x[])
	{
		String s="good morning india";
		System.out.println("Before Replace string "+s);
		String newString=s.replace("morning","evening");
		System.out.println("After Replacement "+newString);
	}
}