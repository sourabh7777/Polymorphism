package MethodOverloading;

public class DisplayOverloading2 {
	
	public float add(int a , float b) {
		System.out.println("add method with argument(int,float) is called");
		return (a+b);
	}
	public float add(float a , int b) {
		System.out.println("add method with argument(float,int) is called");
		return (a+b);
	}

	public static void main(String[] args) {
		DisplayOverloading2 obj = new DisplayOverloading2();
		
		System.out.println(obj.add(1,2.2f));
		System.out.println(obj.add(1.2f, 3));

	}

}
