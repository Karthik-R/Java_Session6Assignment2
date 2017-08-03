package javaSession6Assignment2;

import java.util.Scanner;

//user defined exception
class NegativeAgeException extends Exception{
	/**
	 * Default versionUID
	 */
	private static final long serialVersionUID = 1L;
	int a;
	NegativeAgeException(int b){
		if(b<0)
		a=b;
	}
	public String toString(){
		return("Age cannot be negative!, entered age is "+a);
	}
}

//main class
public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = input.nextInt();
		try{
			if(age<0){
				throw new NegativeAgeException(age);
			}else{
				System.out.println("Your age is "+age);
			}
			
		}catch(NegativeAgeException e){
			System.out.println(e);
		}
	}

}
