package org.javademo;

public class Constructor {

	
	public Constructor() {
		this(100, "Javaclass");
		System.out.println("Default const"); 
		
	}
	
	
	public Constructor(int a, String b) {
		this("Manikandan",8056697928l);
		System.out.println(a);
		System.out.println(b);
	}
	
	public Constructor(String name, long phone) {
		System.out.println(name);
		System.out.println(phone);
	}
	
	
	public static void main(String[] args) {
		Constructor c= new Constructor();
		Constructor c1= new Constructor(100,"Javaclass");
	}
	
	
	
	
	
}
