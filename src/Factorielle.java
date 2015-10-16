/**
 * Classe de présentation des fonctionnalités GIT.
 * @author tesla
 *
 */
public class Factorielle
{

	/**
	 * Methode principale
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Calcul factorielle");
		System.out.println("Factorielle 5 : " + factorielle(5));
		System.exit(0);
	}
	
	/**
	 * Calcul de la factorielle par récursion.
	 * @param i - la valeur initiale dont il faut calculer la factorielle.
	 * @return la factorielle.
	 */
	public static long factorielle(long i)
	{
		if(i == 1)
			return 1;
		else
			return i * factorielle(i-1);
	}
	
	/**
	 * Méthode inutile de test
	 * @param s
	 */
	public static void test(String s)
	{
		System.out.println(s);
		
	}

}
