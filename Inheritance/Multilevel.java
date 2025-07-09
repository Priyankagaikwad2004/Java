package Inheritance;

class One{
	public void print1() {
		System.out.println("Class A");
	}
}

class Two extends One{
	public void print2() {
		System.out.println("Class B");
	}
}

class Three extends Two{
	public void print3() {
		System.out.println("Class C");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three c = new Three();
		c.print1();
		c.print2();
		c.print3();
	}

}
