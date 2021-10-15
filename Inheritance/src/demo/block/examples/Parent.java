package demo.block.examples;

public class Parent {
	
	static {
		System.out.println("Parent static block");
	}
	
	{
		System.out.println("Parent non-static block");
	}
	
	Parent() {
		System.out.println("Parent Constructor"+this);
	}
	
	void f1()
	{
		System.out.println("Parent class method");
	}

}
