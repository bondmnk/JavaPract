package OppsConcept;

public class MethodOverRidingB extends MethodOverRidingA {

	public void methodA() {
		System.out.println("methodA in cjild class");
	}
	
	public static void main(String[] args) {
		MethodOverRidingB ref=new MethodOverRidingB();
		ref.methodA();	
		
		MethodOverRidingA ref1=new MethodOverRidingB();
		ref1.methodA();
	}

	
	
	
	//for methods overridding Is -A relationship is manddatory
	//Both Child and parent class should have same method with same name , same return type and should be non static
	//but implemetaion might diffrer
	//method overriding dipends on object created
}
