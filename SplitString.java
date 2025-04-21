public class SplitString
{
	public static void main(String x[])
	{
		String s="abc@gmail.com,mno@gmail.com,pqr@gmail.com,xyz@gmai.com";
		String words[]=s.split(",");
		for(String word:words)
		{
		System.out.println(word);
		}
	}
}