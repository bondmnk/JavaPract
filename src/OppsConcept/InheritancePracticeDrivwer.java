package OppsConcept;

public class InheritancePracticeDrivwer {

	public static void main(String[] args) {
		//up casting after upcasting we can only call the members of parent class
		//implicitly done by the compilor
		InheritancePractice Ip = new InheritancePractice1(10,20);
		
		//explicitly done by programeer
		//after downcasting we can access both members of child and parent class
		
	
		InheritancePractice1 ref=(InheritancePractice1)Ip;
		ref.c=2020;
		System.out.println(ref.c);
		
     //instanceof is operatror used check parent has refrence of child object.
		InheritancePractice ref2=new InheritancePractice(10,20,"ndj");
		System.out.println(ref2 instanceof InheritancePractice1);
		
		
		ref.method1();
		
		
	}

}
