package WrapperClass;

//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
public class WrapperExample1{  
	public static void main(String args[]){  
	//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);      //converting int into Integer object explicitly  
		Integer j = a;                       //autoboxing, now compiler will write 
										   //Integer.valueOf(a) internally  
		System.out.println(a+" "+i+" "+j);  
		System.out.println(a + " is of type " + ((Object)a).getClass().getSimpleName()); 
	}
}
 