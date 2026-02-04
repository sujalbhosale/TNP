package pack;

public class Method4 {

	int add (int x, int y) {
		int d=x+y;
		System.out.println("B="+d+"\n");
		
		return 0;
	}
	
	int sub (int x, int y) {
		int d=x-y;
		System.out.println("B="+d+"\n");
		
		return 0;
	}
	
	int mul (int x, int y) {
		int d=x*y;
		System.out.println("B="+d+"\n");
		
		return 0;
	}


	
	int div (int x, int y) {
		int d=x/y;
		System.out.println("B="+d+"\n");
		
		return 0;
	}
	
	public static void main(String[] args) {
		Method4 a= new Method4();
	
		a.add(15,33);
		a.sub(40, 20);
		a.mul(12,66);
		a.div(71, 32);

	}

}
