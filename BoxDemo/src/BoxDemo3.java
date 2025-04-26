class BoxDemo3 {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		// assign values to mybox1's instance variables
		mybox1.width = 1;
		mybox1.height = 2;
		mybox1.depth = 5;
		
		/* assign different values to mybox2's
		instance variables */
		mybox2.width = 32;
		mybox2.height = 16;
		mybox2.depth = 92;
		
		// display volume of first box
		System.out.print(" mybox1 ");
		mybox1.volume2();
		// display volume of second box
		System.out.print(" mybox2 ");
		mybox2.volume2();
	}
}