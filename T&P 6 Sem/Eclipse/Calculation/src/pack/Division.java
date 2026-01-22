package pack;

public class Division {

	void A() {
		int a=20/12;
		System.out.println("A="+a+"\n");
	}
	
	void B(int x, int y) {
		int b=x/y;
		System.out.println("B="+b+"\n");
	}
	
	int C() {
		int c=50/12;
		System.out.println("A="+c+"\n");
		
		return 0;
	}
	
	int D (int x, int y) {
		int d=x/y;
		System.out.println("B="+d+"\n");
		
		return 0;
	}
	
	public static void main(String[] args) {
		Division a= new Division();
	
		a.A();
		a.B(40, 20);
		a.C();
		a.D(71, 32);

	}

}
