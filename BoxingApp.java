public class BoxingApp
{
	public static void main(String x[])
	{
		Long l=100L;
		short s=l.shortValue();
		int i=l.intValue();
		float f=l.floatValue();

		System.out.printf("L=%d\tS=%d\n",l,s);
		System.out.printf("L=%d\tI=%d\n",l,i);
		System.out.printf("L=%d\tF=%d\n",l,f);
	}
}