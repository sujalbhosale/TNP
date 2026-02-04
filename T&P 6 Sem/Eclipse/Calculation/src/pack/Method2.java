package pack;

public class Method2 {
	
	void add(int x, int y) {
		int b=x+y;
		System.out.println("B="+b+"\n");
	}
	
	void sub(int x, int y) {
		int b=x-y;
		System.out.println("B="+b+"\n");
	}
	
	void mul(int x, int y) {
		int b=x*y;
		System.out.println("B="+b+"\n");
	}
	
	void div(int x, int y) {
		int b=x/y;
		System.out.println("B="+b+"\n");
	}
	



	public static void main(String[] args) {
		
		Method2 a = new Method2();

		a.add(12,14);
		a.sub(10, 20);
		a.mul(32,45);
		a.div(21, 32);
		
	}

}
