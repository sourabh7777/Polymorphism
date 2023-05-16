package MethodOverriding;


public class ChildClass extends ParentClass{
	
	public void display() {
		System.out.println("Ths is child class display method");
	}
	
	public void show() {
		System.out.println("This is child class show method");	
	}
	

	public static void main(String[] args) {
		
		
		//Using Child class object
		ChildClass obj1 = new ChildClass();
		obj1.display();        
		obj1.show();  
		
		
		
		//Using Parent class Object
		ParentClass obj2 = new ParentClass();
		obj2.disp();         
		obj2.show();
		obj2.display();
		
		//Child Class Object referring to parent class object reference variable
		ParentClass obj3 = new ChildClass();
		obj3.display();    
		obj3.show();    
		obj3.disp();    
		
				

	}

}
