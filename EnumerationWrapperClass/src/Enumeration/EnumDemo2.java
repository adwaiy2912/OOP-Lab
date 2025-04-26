package Enumeration;

//Use the built-in enumeration methods.
//values() and valueOf() demo

class EnumDemo2 {
	public static void main(String args[])
	{
		Apple ap;
		System.out.println("Here are all Apple constants:");
		// use values()
		Apple allApples[] = Apple.values(); 		//storing
		for(Apple a : allApples)
			System.out.println(a);
			System.out.println();
		System.out.println("******************************");
		// use valueOf()
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
		System.out.println("Index of Winesap is: "+Apple.valueOf("Winesap").ordinal()); 
	}
}
