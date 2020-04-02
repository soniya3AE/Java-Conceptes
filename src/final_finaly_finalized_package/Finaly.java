package final_finaly_finalized_package;

public class Finaly {

	public static void main(String[] args) {
		// finally is the block ,which will be used in the try and catch block as shown
		// bellow
		// the statements which are mentioned in the finally block which will be
		// executed irrespective exception
		
		Finaly f = new Finaly();
		f.devision();
	}

	public void devision(){
		try {
		int a = 10;
		int i = 0;
		int c = a/i;
		System.out.println(c);
	}
		catch(ArithmeticException e ) {
			System.out.println("This is arithemetic exception");
		}
		finally {
			System.out.println("this is finally block");
		}
}
}
