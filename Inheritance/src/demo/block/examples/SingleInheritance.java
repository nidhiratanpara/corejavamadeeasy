package demo.block.examples;

public class SingleInheritance {
	
	void m1() {
		System.out.println("Inside M1");
	}
	
	
	public static void main(String[] args) {
		
		SingleInheritance s=new SingleInheritance();
		s.m1();
		System.out.println(s.hashCode());
		System.out.println(s.getClass());
		
	}

}
