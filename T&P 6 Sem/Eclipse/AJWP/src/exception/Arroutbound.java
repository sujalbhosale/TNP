package exception;

public class Arroutbound {
	
	void checkindex() {
		try {
			int arr[]= {1,2,3,4,5};
			
			System.out.println("5th index is "+arr[5]);
			
		}catch(ArrayIndexOutOfBoundsException ae){
			System.err.println(ae);
			
		}
		
		finally {
			System.out.println("Finally");
		}
	}

	public static void main(String[] args) {
		
		Arroutbound a=new Arroutbound();
		
		a.checkindex();

	}

}
