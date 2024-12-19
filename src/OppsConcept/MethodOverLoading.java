package OppsConcept;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading ov=new MethodOverLoading();
		ov.methodA(10, "20");
	}

	//method overloading emethod with same name , same returm type but differ in either lenght , type , order
	// applicable both for static or not not static
	
	public void methodA() {
		System.out.println("methodA not");
	}
	
	public static void methodA(int a, int v, int c) {
		System.out.println("methodA not");
	}
	
	
	public void methodA(int a) {
		System.out.println("methodA one");
	}
	
	public void methodA(String b,int a) {
		System.out.println("methodA one"+" "+a+b);
	}
	
	public void methodA(int a, String b) {
		System.out.println("methodA one");
	}
	
}
