package Project;


import java.io.IOException;
import java.util.Scanner;
interface I
{
	public void mainpage();
}
abstract class A
{
	abstract public void choice();
}
public class Ecom extends A implements I{

	static
	{
		System.out.println("***************************************************");
		System.out.println("*                                                 *");
		System.out.println("*               Welcome to watch shop             *");
		System.out.println("*                                                 *");
		System.out.println("*       we have a large varity of watches         *");
		System.out.println("*                                                 *");
		System.out.println("*       //summer sale is going on Hurry Up//      *");
		System.out.println("*                                                 *");
		System.out.println("*       Before you proceed please do login        *");
		System.out.println("*       if you are new to this application plz    *");
		System.out.println("*                 sign up first                   *");
		System.out.println("***************************************************");
	}
	{
		System.out.println("====================================================");
	}
	
	public static void main(String[] args) {
		Ecom r=new Ecom();
		r.choice();
	}
	public void choice() {
		System.out.println("Plz choose the option from below");
		System.out.println("1.for sign up \n2.for login");
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		Signup_login s=new Signup_login();
		switch(op)
		{ 
		case 1:s.signup();
			break;
		case 2:s.login2();
			break;
		default: System.out.println("Invalid Input");
		choice();
		}
		Ecom r=new Ecom();
		r.mainpage();
	}
	public void mainpage(){
		
		System.out.println("plz select the products of your from below options");
		System.out.println("1.Watches");
		System.out.println("2.info about our application");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your chaoice");
		int s=sc.nextInt();
		Product r=new Product();
		switch(s) {
		case 1: r.watches();
		break;
		case 2:try {
				r.info();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		default:System.out.println("Enter Valid Input");
		mainpage();
		}
				
	}
}
