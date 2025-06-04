/*public class StringApp
{
	public static void main(String x[])
	{
		String s="abc";
		String s1="abc";
		System.out.println("Output using string constant pool or initilization technique");
		System.out.println("=============================");
		System.out.println("Hashocode of s "+System.identityHashCode(s));
		System.out.println("Hashcode of s1 +"System.identityHashCode(s1));
		System.out.println("=============================");
		System.out.println("Output using new Keyword or heap setion of memory");
		System.out.println("=============================");
		String s2=new String("abc");
		String s3=new String("abc");
		System.out.println("Hashcode of s2 "+System.identityHashCode(s2));
		System.out.println("Hashcode of s3 "+System.identityHashCode(s3)); 
		System.out.println("=============================");
	}
}*/
public class StringApp {
    public static void main(String x[]) {
        String s = "abc";
        String s1 = "abc";

        System.out.println("Output using string constant pool or initialization technique");
        System.out.println("=======================================");
        System.out.println("Hashcode of s  = " + System.identityHashCode(s));
        System.out.println("Hashcode of s1 = " + System.identityHashCode(s1));
        System.out.println("=======================================");

        System.out.println("Output using new keyword or heap section of memory");
        System.out.println("=======================================");
        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.println("Hashcode of s2 = " + System.identityHashCode(s2));
        System.out.println("Hashcode of s3 = " + System.identityHashCode(s3));
        System.out.println("=======================================");
    }
}
