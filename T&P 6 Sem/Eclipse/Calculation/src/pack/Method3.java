package pack;

public class Method3 {
	
	int add() {
		int c=24+12;
		System.out.println("A="+c+"\n");
		
		return 0;
	}
	
	int sub() {
		int c=10-12;
		System.out.println("A="+c+"\n");
		
		return 0;
	}
	
	
	int mul() {
		int c=10*12;
		System.out.println("A="+c+"\n");
		
		return 0;
	}
	
	int div() {
		int c=50/12;
		System.out.println("A="+c+"\n");
		
		return 0;
	}


	public static void main(String[] args) {
		Method3 a=new Method3();
		
		a.add();
		a.sub();
		a.mul();
		a.div(
				);

	}

}
