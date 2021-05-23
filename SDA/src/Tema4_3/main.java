package Tema4_3;

public class main {
	public static void main(String[] args)
	{
		int n = 10;
		int [] sir = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Jumatatea din stanga a sirului: ");
		System.out.println("-pozitie para, numar cautat: 2:" + cautare_binara(sir,n,0,n/2,2));
		System.out.println("-pozitie impara, numar cautat: 3" +  cautare_binara(sir,n,0,n/2,3));
		System.out.println("Jumatatea din dreapta a sirului: ");
		System.out.println("-pozitie para, numar cautat: 8:" + cautare_binara(sir,n,0,n/2,8));
		System.out.println("-pozitie impara, numar cautat: 7" +  cautare_binara(sir,n,0,n/2,7));

		System.out.println("Mijlocul sirului : 5 : " +  cautare_binara(sir,n,0,n/2,5));
		System.out.println("Primul din sir: 0:  " +  cautare_binara(sir,n,0,n/2,0));

		System.out.println("Ultimul din sir: 9:  " +  cautare_binara(sir,n,0,n/2,9));
		

		System.out.println("Care nu exista : 20 : " +  cautare_binara(sir,n,0,n/2,20));
		
	}
	
	static boolean cautare_binara(int[] sir, int n, int zero, int pozitie, int x)
	{
		int p = 0;
		int u = n;
		int m;
		boolean gasit = false;
		while(!gasit && p >= u)
		{
			m = (u+p)/2;
			if(sir[m] == x)
				return true;
			else if(sir[m] > x)
			{
				u = m-1;
			}
			else {
				p = m+1;
			}
			
		}
		return false;
	}
	

}
