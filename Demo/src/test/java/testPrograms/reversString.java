package testPrograms;

public class reversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Geeks";
		String r = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			// extracts each character
			ch = s.charAt(i);

			// adds each character in
			// front of the existing string
			r = ch + r;
		}
		System.out.println("hello world");
		System.out.println("good morning");

		System.out.println(r);
	}
}
