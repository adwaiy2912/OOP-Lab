public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc,def,123";
        String[] arrOfStr = str.split(",");
  
        for (String a : arrOfStr)
            System.out.println(a);


	}

}

