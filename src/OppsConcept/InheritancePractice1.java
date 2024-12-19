package OppsConcept;

public class InheritancePractice1 extends InheritancePractice implements InheritancePractice2{
	int c;
	int d;
	
	InheritancePractice1(int c, int d){
	//	super();
		this.c=c;
		this.d=d;
	}

	@Override
	public void method1() {
		System.out.println("method1");
		
	}

	
}
