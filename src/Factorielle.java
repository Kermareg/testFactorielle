
public class Factorielle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Calcul factorielle");
		System.out.println("Factorielle 5 : " + factorielle(5));
		System.exit(0);
	}
	
	public static long factorielle(long i)
	{
		if(i == 1)
			return 1;
		else
			return i * factorielle(i-1);
	}
	
	public static void test(String s)
	{
		System.out.println(s);
	}

}
