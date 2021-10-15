package demo.block.examples;

public class Child extends Parent {
	
	static{
		System.out.println("Child static block");
	}
	
	{
		System.out.println("Child non-static block");
	}
	
	Child() {
		System.out.println("Child Constructor"+this);
	}
	
	void f2() {
		System.out.println("Child class method");
	}

}
