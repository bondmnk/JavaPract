package OppsConcept;

public class DataHidingPractice {

	private	int a;
		int b;
		String mnk;
		
		DataHidingPractice(int a, int b ,String mnk){
			this.a=a;
			this.b=b;
			this.mnk=mnk;
		}
		

		public int geta() {
			return a;
		}
		
		public void seta(int a) {
			this.a=a;
		}
		
		public void mmm() {
			 a=100;
		}

	

}
