// StringBuffer length vs. capacity.
class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("buffer = " + sb);
		System.out.println("length = " + sb.length());		//length of string
		System.out.println("capacity = " + sb.capacity());	//16 additional characters is automatically added.
	}
}