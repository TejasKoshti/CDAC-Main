public class PlusStringTest {
	public static void main(String [] args) {
		String str = "ACTS";
		str = "CDAC" + str;
		System.out.println(str);
		str = 4 + str;
		System.out.println(str);
		int i = 40;
		str = i + str;
		System.out.println(str);
		
		String str1  = i +  "ACTS";
		System.out.println(str1);
		System.out.println("Number=" + i +" " + str1); 
		
	}
	
}