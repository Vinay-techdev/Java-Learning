package chapter_02;

public class string {

	public static void main(String[] args) {
		// String name = new String("vinay"); or 
		String name = " vinay ";
		System.out.println(name);
		
		// Strings Methods
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.charAt(3));
		System.out.println(name.equals(" vinay"));
		System.out.println(name.endsWith("y"));
		System.out.println(name.startsWith("v"));
		System.out.println(name.substring(2, 4));
		System.out.println(name.replace("ay", "nu"));
	}
}
