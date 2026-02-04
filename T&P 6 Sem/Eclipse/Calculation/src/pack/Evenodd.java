package pack;

public class Evenodd {
	
	int even_odd(int n)
	{
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		
		Evenodd e=new Evenodd();
		
		e.even_odd(21);

	}

}
