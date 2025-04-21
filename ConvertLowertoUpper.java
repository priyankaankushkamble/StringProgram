import java.util.*;
public class ConvertLowertoUpper
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter String From keyboard");
	String s=xyz.nextLine();
	String newString=" ";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a'&& s.charAt(i)<='z')
	{
		char upper=(char)((int)s.charAt(i)-32);
			newString+=upper;
	}
	if(s.charAt(i)==' ')
	{
		newString+=' ';
	}
	}
	System.out.println(newstring);
	}
}