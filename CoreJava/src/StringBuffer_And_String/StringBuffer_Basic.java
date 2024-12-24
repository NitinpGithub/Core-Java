package StringBuffer_And_String;

public class StringBuffer_Basic {
	public static void main(String[] args) {
		
		/*
		 Stringbuffer is an mutable object used to store and manipulate sequence of characters
		 
		 Useful Methods  - 
		 
		 StringBuffer sb = new StringBuffer();
		 
		 sb.append();
		 sb.insert(indexNumber,Adding_String); - sb.insert(6,"Mr");
		 sb.capacity();
		 sb.replace(); - sb.replace(0,4,"HELLO");
		 sb.delete(); - sb.delete(1,5);
		 sb.reverse(); 
		 sb.length();
		 
		 Convert String into StringBuilder - 
		 String s = "Hello";
		 StringBuilder sb = new StringBuilder(s);
		 
		 Convert String Builder into String - 
		 StringBuilder sb = new StringBuilder("Hello");
		 String str = sb.toString();
		 
		 
		 StringBuffer vs StringBuilder - 
		 
		 	>> StringBuffer
		 > Both are same but StringBuffer is more thread safety
		 > StringBuffer is slower because of thread safety
		 
		 	>> StringBuilder
		 > StringBuilder is not thread safety
		 > Faster than StringBuffer
		 
		 >> Both provide same method
		 
		 */
		
		
//		String s1 = strb.toString();
//		StringBuffer sb1 = new StringBuffer();
//		System.out.println(sb.length());
//		sb.reverse();
//		System.out.println(sb);
		
//		sb.append("World");
//		sb.insert(6,"Mr ");
//		System.out.println(sb);
//		sb.replace(0, 5, "HELLO");
//		System.out.println(sb);
//		System.out.println(sb.capacity());
		
		
		String s = "Hello";
		StringBuffer sb2 = new StringBuffer(s);
		
		StringBuffer sb = new StringBuffer("");
		StringBuffer sb1 = new StringBuffer("Hello");
	}

}
