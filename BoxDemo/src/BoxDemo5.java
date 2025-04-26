class Box2 
{       double width; double height; double depth;
		
		//compute and return volume
	    double volume()
	    	{     	return width * height * depth;    }

	    //sets dimensions of box
	    void setDim(double w, double h, double d) 
		  {
			width = w;
			height = h;
			depth = d;
		  }
}

class BoxDemo5
{		public static void main(String args[]) 
		{
			Box2 mybox1 = new Box2();
			Box2 mybox2 = new Box2();
			double vol;
			mybox1.setDim(10, 20, 15);
			mybox2.setDim(3, 6, 9);
			
			vol = mybox1.volume();
			System.out.println("Volume is " + vol);

			vol = mybox2.volume();
			System.out.println("Volume is " + vol);
		}
}