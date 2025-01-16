public class ArithOperation {
	
	
	 public static int add( int a, int b) {
		 return a + b;
	 }
	 
	 static public int subtract( int a, int b) {
		 return a - b;
	 }
	 
	 public static void main(String... args) {
		 //ArithOperation operation = new ArithOperation();
		 int sum = ArithOperation.add(10, 20);
		 System.out.println("Sum = "+ sum);
	 }
	 
}