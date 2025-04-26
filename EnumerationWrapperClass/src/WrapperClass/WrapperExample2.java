package WrapperClass;

//Java program to convert object into primitives  
//Unboxing example of Integer to int  
public class WrapperExample2{    
	public static void main(String args[]){    
		//Converting Integer to int    
		Integer a = new Integer(3);    	//The constructor Integer(int) has been 
										//deprecated since version 9 and marked 
										//for removal
		int i = a.intValue();			//converting Integer to int explicitly  
		int j = a;						//unboxing, now compiler will write 
										//a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);    
	}
}  