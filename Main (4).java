package firstproject;

import java.util.Scanner;

public class UserInputPersonalInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a name : ");
		String name = sc.next();
		
		System.out.println("Enter a gender : ");
		String gender = sc.next();
		
		System.out.println("Enter a age :");
		int age = sc.nextInt();
		
		System.out.println(" enter a address : ");
		String address = sc.next();
		
		System.out.println("Enter a phone number : ");
		long phoneno= sc.nextLong();
		
		System.out.println("-----------------------------------");
		
		System.out.println(" name : "+name);
		System.out.println("gender : "+ gender);
		System.out.println("age : "+age);
		System.out.println("address : "+address);
		System.out.println("phoneno : "+ phoneno);
		
	}

}
