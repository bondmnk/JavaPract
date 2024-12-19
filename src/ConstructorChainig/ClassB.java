package ConstructorChainig;

public class ClassB extends ClassA{

	
	ClassB(){
		System.out.println("empty child");
	}
	

   ClassB(int a){
		//super();
	//by default empty super() statement added in each child class constructor
	super(10);
	
	System.out.println("one child");
	}
	

ClassB(int a , int b){
	System.out.println("two child");
}
	
	public static void main(String[] args) {
		ClassB ref=new ClassB();
		
	}
}
