public class StringValueOfExample {
	public static void main(String[] args) {  
        boolean boolVal=true;  
        byte byteVal=11;    
        int intVal = 13;  
        float floatVal = 15.5f;  
        double doubleVal = 16.5d;  
        char chr[]={'j','a','v','a'};  

        String s1 = String.valueOf(boolVal);    
        String s2 = String.valueOf(byteVal);       
        String s3 = String.valueOf(intVal);     //int --> String, not String --> int  
        String s4 = String.valueOf(floatVal);    
        String s5 = String.valueOf(doubleVal);    
        String s6 = String.valueOf(chr);    
        System.out.println("boolVal = "+s1);  
        System.out.println("byteVal = "+s2);  
        System.out.println("intVal = "+s3);  
        System.out.println("floatVal = "+s4);  
        System.out.println("doubleVal = "+s5);  
        System.out.println("charVal = "+s6); 
        
        String s = "hello";
        int n = Integer.parseInt(s);
        System.out.println("n = "+n);

    }
}