public class CoversionApp
{

	public static void main(String x[])
	{
		int a=11;
		long b=a;//implicit conversion
		System.out.printf("A=%d\tB=%d\n",a,b);

		int p=18;
		long k=(int)p;//explicite conversion
		System.out.printf("P=%d\tK=%d\n",p,k);
	}
}