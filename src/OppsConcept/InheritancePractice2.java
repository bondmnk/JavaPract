package OppsConcept;

public interface InheritancePractice2 {

	//we can only public static final variable
	
	int x=10;
	int y=20;
	
	//if method should be non static then should definatlly abstract , So any class implementing to interface it 
	//should override all the abstract method of interface
	void method1();
	
	//we can have static methods but not inheritted to child not overriden	
	public static void method2() {
		System.out.println("method2");
		System.out.println(x);
	}
	
//we can not have constructor
	
//	InheritancePractice2(){
//		
//	}
	
}
