package pack;

public class Method1 {
	
	void add() {
		int a=10+12;
		System.out.println("A="+a+"\n");
	}
	
	
	void sub() {
		int a=10-12;
		System.out.println("A="+a+"\n");
	}
	
	void mul() {
		int a=10*12;
		System.out.println("A="+a+"\n");
	}
	
	void div() {
		int a=20/12;
		System.out.println("A="+a+"\n");
	}
	
	
	

	


	public static void main(String[] args) {
		Method1 a = new Method1();
		
		a.add();
		a.sub();
		a.mul();
		a.div();

	}

}
