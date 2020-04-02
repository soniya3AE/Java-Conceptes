package final_finaly_finalized_package;

public class FianlizeMethod {
 
	
	// the main task of finalize method is  clean up the object which doot have any reference type before garbage collection clean up it.
	public static void main(String[] args) {
		
		FianlizeMethod  f = new FianlizeMethod();
		FianlizeMethod  f1 = new FianlizeMethod();
		int result = f1.add(20 , 30);
		System.out.println(result);	
		f = null;
	}
	
	public void  finalized() {
		System.out.println("this is final method");
	}
	
	
	
	public int  add(int a , int b) {
		int c = a+ b;
		return c;
	}
	
	//in the above code the f is object which donot using anywhere in the code hence this object will be taken care by finalized method 
	//by cleaning the f object before garbage collector.

}
