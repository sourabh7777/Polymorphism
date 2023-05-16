package MethodOverloading;

public class DisplayOverLoading {
	
	int add(int a , int b) {
		int sum = a+b;
		return sum;
	}
	
	int add(int a , int b , int c) {
		int sum = a+b+c;
		return sum;
	}

	public static void main(String[] args) {
		DisplayOverLoading obj = new DisplayOverLoading();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));

	}

}
