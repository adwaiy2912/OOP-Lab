/*
 * Default constructor demo
 */
class Box6
{     
         double width;
         double height;
         double depth;
	     Box6()
	       {	     
              System.out.println("Constructing Box");
		      width = 10;
		      height = 20;
		      depth = 30;
	       }
	      double volume()
	      {      
	    	  return width * height * depth;
	      }  
 }

class BoxDemo6
{        public static void main(String args[]) 
	      {
		    Box6 mybox1 = new Box6();
		    Box6 mybox2 = new Box6();
		    
            double vol1, vol2;
		    vol1 = mybox1.volume();
		    System.out.println("1. Volume is " + vol1);
		    vol2 = mybox2.volume();
		    System.out.println("2. Volume is " + vol2);
		    /*
		     * as both mybox1 and mybox2 are taking Box() constructor,
		     * they will display same results
		     */
	    }
}

