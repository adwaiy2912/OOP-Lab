class UseStatic
{
  static int a = 3;
  static int b;

 static void meth(int x)
  {
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

 static
  {
    System.out.println("1st Static block initialized.");
    b = a * 4;
  }


 static
  {
      System.out.println("2nd Static block initialized.");
  }


 public static void main(String args[])
  {
    meth(42);
  }
}