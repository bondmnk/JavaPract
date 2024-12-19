package ArrayTheory;

public class HeterogenousArry {

	public static void main(String[] args) {
	
	Object [] hetero =	new Object [4];
	hetero[0]=new Integer(100);
	hetero[1]=new Integer(101);
	hetero[2]=new Integer(102);
	hetero[3]=10;
	hetero[3]=100;

	for(int i=0; i<hetero.length; i++) {
		System.out.println(hetero[i]);
	}
	}

	//lenght of array is fixed;
	//we can store only homogenous values ,
	//we dont have reddy made methods like remove(), replace(), iterator(), listIterator() etc
	//for these reasons we go for collection framwork
}
