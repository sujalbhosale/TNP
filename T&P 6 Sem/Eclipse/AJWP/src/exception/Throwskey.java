package exception;

public class Throwskey {
	
	String str;
	
	void checkLength() throws NullPointerException {
		try {
			NullPointerException ne= new NullPointerException();
			System.out.println("Length"+str.length());
			throw ne;
			
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		Throwskey t= new Throwskey();
		t.checkLength();

	}

}
