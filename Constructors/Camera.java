//package com.java.Constructors;
//
//public class Camera {
//	//fields
//	String cname;
//	int price;
//	String color;
//	
//	//constructor
//	public Camera(String cname, String Colour, int price) {
//		this.cname = cname;
//		this.color = Colour;
//		this.price = price;
//		
//		System.out.println("Camera Name : " +this.cname);
//		System.out.println("Camera color : " +this.color);
//		System.out.println("Camera Price : " +this.price);
//	}
//
//	public static void main(String[] args) {
//		
//		//object
//		Camera s = new Camera("Sony", "black", 500000);
////		System.out.println("Camera Name : " +s.cname);
////		System.out.println("Camera color : " +s.color);
////		System.out.println("Camera Price : " +s.price);
////		
//		System.out.println();
////		
//		Camera s1 = new Camera("canva", "white", 700000);
////		System.out.println("Camera Name : " +s1.cname);
////		System.out.println("Camera color : " +s1.color);
////		System.out.println("Camera Price : " +s1.price);
//		
//
//	}
//
//}

package com.java.Constructors;

public class Camera {
	//fields
	String cname;
	int price;
	String color;
	
	//constructor
	public Camera(String cname, String Colour, int price) {
		this.cname = cname;
		this.color = Colour;
		this.price = price;
	}
	
	public void print() {	
		System.out.println("Camera Name : " +cname);
		System.out.println("Camera color : " +color);
		System.out.println("Camera Price : " +price);
	}

	public static void main(String[] args) {
		
		//object
		Camera s = new Camera("Sony", "black", 500000);
//		System.out.println("Camera Name : " +s.cname);
//		System.out.println("Camera color : " +s.color);
//		System.out.println("Camera Price : " +s.price);
//		
		System.out.println();
//		
		Camera s1 = new Camera("canva", "white", 700000);
//		System.out.println("Camera Name : " +s1.cname);
//		System.out.println("Camera color : " +s1.color);
//		System.out.println("Camera Price : " +s1.price);
		
		s.print();
		System.out.println();
		s1.print();
		

	}

}
