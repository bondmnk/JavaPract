package ConstructorChainig;

public class ClassA  {

	ClassA(){
		//this(10);
		System.out.println("empty parent");
	}
	
	
	ClassA(int a){
//		this();
	System.out.println("one parent");
	}
	

	ClassA(int a , int b){
	System.out.println("two parent");
}
	
}
