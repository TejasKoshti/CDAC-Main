public class DeadAndUnreachableCode {
	public static void main(String ... args) {
		int a = 20;
		a = a;
		
		while(true) {
			System.out.println("Inside while");
		} 
		
		if(true) {
			System.out.println("Inside if");
		} else {
		System.out.println("inside else");
		}
	}
}