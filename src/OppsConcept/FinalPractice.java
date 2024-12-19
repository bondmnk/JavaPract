package OppsConcept;

public final class FinalPractice {

	 final int a =10;
	 final static int b=10;
	 //final variable can not be modified
	//global final variable have to intilize at the time of declation else we get compile time error
	
	
	public static void main(String[] args) {
		
		final int c;
		//local final varible can be intilized before using them
		
	}

	//final method can be inherited but not overrriden and  final class can not be inherited or extendable
       final	public void mnk() {
		System.out.println("mnk");
	}
  
}
