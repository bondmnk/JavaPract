package OppsConcept;

public class EncapsilationPrac {

	int a;
	int b;
	String mnk;
	
	EncapsilationPrac(int a, int b ,String mnk){
		this.a=a;
		this.b=b;
		this.mnk=mnk;
	}
	
	public static void main(String[] args) {
		
		EncapsilationPrac pra= new EncapsilationPrac(10,20,"hello");
		pra.mmm();
		System.out.println(pra.a);
		System.out.println(pra.b);
		
	}

	public void mmm() {
		 a=100;
	}
}
