package ConstructorChainig;

public class ClassInSameClassA {

	ClassInSameClassA(){
		this(10);
		System.out.println("empty");
	}
	
	ClassInSameClassA(int a){
		this(10,20);
		System.out.println("one");
	}
	
	ClassInSameClassA(int a, int b){
    	System.out.println("two");
  	}
	
    
    public static void main(String[] args) {
	//	ClassA a = new ClassA();
    	ClassInSameClassA a = new ClassInSameClassA(10);
	}
}
