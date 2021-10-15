package demo.block.examples;

public class MultiLevelTest {
	
	static{
		System.out.println("Main static block");
	}
	
	{
		System.out.println("Main non-static block");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.f1();
		c.f2();
		System.out.println("HashCode : "+c.hashCode());
		System.out.println("Hello, I am Main");
		new MultiLevelTest();
	}

}
