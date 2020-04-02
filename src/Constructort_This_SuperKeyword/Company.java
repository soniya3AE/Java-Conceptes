package Constructort_This_SuperKeyword;

public class Company extends Employee{

	//Using the this keyword and as well calling default parameterized  constructor of parent class employee using super keyword
	String name;
	int age;
	
	public Company(String name , int age) {
		super();
		this.name = name;
		this.age  = age;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		Company c = new Company("Soniya", 45);
	}

}
