class A {
	int i = 10;
	
	public void hello() {
		System.out.println("A:Hello");
	}
	
	public void message() {
		System.out.println("A:mess");
	}
}

class B extends A {
	int j = 20;
	
	@Override
	public void hello() {
		System.out.println("B:Hello");
	}
	
	public void hi() {
		System.out.println("B:hi");
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.i);
//		System.out.println(a.j);  //error
		
		a.hello();
		a.message();
//		a.hi();  // error
		
		
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);
		
		b.hello();
		b.message();
		b.hi();
		
		A a1 = new A();
		System.out.println(a1.i);
//		System.out.println(a1.j);   // error
		a1.hello();
		a1.message();
//		a1.hi();   // error
		
//		B b = new A(); // error


	}
}
