package foo;

public class StringDemo {

	public static void main(String[] args) {
		String str="Hello";
		String str1=new String("Hello");
		System.out.println(str==str1.intern());
		
		
	}

}
