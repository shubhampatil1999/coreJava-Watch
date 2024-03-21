package Project;

import java.util.Scanner;

public class Signup_login {
	static Scanner sc=new Scanner(System.in);
	public static void login(String email,String pass1) {
		System.out.println("Enter your email:");
		String email1=sc.next();
		if(email1.contains("@gamil.com"))
		{
			email1=email1;
		}
		else
		{
			email1=email1.concat("@gamil.com");
		}
		System.out.println("enter your password:");
		String pass2=sc.next();
		if(email1.equals(email) && pass1.equals(pass2))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("<<failed>>");
			login( email, pass1);
		}
	}
	public static void signup() {
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("enter your email:");
		String email=sc.next();
		if(email.contains("@gamil.com"))
		{
			email=email;
		}
		else
		{
			email=email.concat("@gamil.com");
		}
		System.out.println(email);
		System.out.println("Enter the contact number:");
		long no=sc.nextLong();
		if(no<10000000000L && no>999999999L)
		{
			no=no;
		}
		else
		{
			System.out.println("Invalid number");
			signup();
		}
		System.out.println("Enter the password:");
		String pass=sc.next();
		System.out.println("Enter your password again:");
		String pass1=sc.next();
		if(pass.equals(pass1))
		{
			System.out.println("<<Sign up successfull>>");
			System.out.println("Account created Successfully");
			login(email,pass1);
		}
		else
		{
			signup();
		}
	}
	public static void login2() {
		System.out.println("Enter your email:");
		String email1=sc.next();
		System.out.println("Enter your password:");
		String pass2=sc.next();
		System.out.println("Enter your password again:");
		String pass1=sc.next();
		if(pass2.equals(pass1))
		{
			System.out.println("<<Login successfull>>");
		}else
		{
			login2();
		}
	}
}