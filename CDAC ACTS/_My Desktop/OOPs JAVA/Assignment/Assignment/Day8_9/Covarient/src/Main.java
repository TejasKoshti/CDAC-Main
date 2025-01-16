
public class Main {
	public static void main(String[] args) {
		Base b = new Derived();
		System.out.println(b.add(10, 20));
		
		b = new Base();
		System.out.println(b.add(5, 6));
		
	}
}
