class BoxDemo4 
{     public static void main(String args[]) 
	   {       
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		mybox1.width = 10;    
		mybox1.height = 20;     
		mybox1.depth = 15;
		
		mybox2.width = 3;      
		mybox2.height = 6;       
		mybox2.depth = 9;
		
        vol = mybox1.volume2();
		System.out.println("Volume of box1 is " + vol);
		vol = mybox2.volume2();
		System.out.println("Volume of box2 is " + vol);
	   }   
}

