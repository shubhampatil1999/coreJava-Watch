package Project;
import java.util.*;

public class Pay {
	
		static Scanner sc=new Scanner(System.in);
		public static void upi()
		{
			System.out.println("================================================================================");
			System.out.println("Plz provide your upi id");
			String uid=sc.next();
			System.out.println("plz enter your pin");
			int pin=sc.nextInt();
			int otp=(int)(10000*Math.random());
			System.out.println("your otp is:"+otp);
			System.out.println("Enter your otp");
			int otp2=sc.nextInt();
			if(otp==otp2)
			{
				System.out.println("your payment is successful");
				greet();
				System.out.println("================================================================================");
			}
			else {
				System.out.println("wrong otp");
				Product.watches();
				System.out.println("================================================================================");
			}
			
		}
		
		public static void card()
		{
			System.out.println("================================================================================");
			System.out.println("plz provide your card number 10 digit");
			long c=sc.nextInt();
			if(c<10000000000L && c>999999999L)
			{
				c=c;
			}
			else
			{
				System.out.println("Invalid card number");
				card();
			}
			System.out.println("plz eneter card expiry date");
			System.out.println("enter in the format:dd/mm/yy");
			String date=sc.next();
			System.out.println("plz enter card cvv");
			int otp=(int)(10000*Math.random());
			System.out.println("your otp is:"+otp);
			System.out.println("Enter your otp");
			int otp2=sc.nextInt();
			if(otp==otp2)
			{
				System.out.println("your payment is successful");
				greet();
				System.out.println("================================================================================");
			}
			else {
				System.out.println("wrong otp");
				Product.watches();
				System.out.println("================================================================================");
			}
			
		}
		
		
		public static void cod()
		{
			System.out.println("================================================================================");
			System.out.println("plz provide mobile number");
			long no=sc.nextLong();
			int otp=(int)(10000*Math.random());
			System.out.println("your otp is:"+otp);
			System.out.println("Enter your otp");
			int otp2=sc.nextInt();
			if(otp==otp2)
			{
				System.out.println("your payment is successful");
				greet();
				System.out.println("================================================================================");
			}
			else {
				System.out.println("wrong otp");
				Product.watches();
				System.out.println("================================================================================");
			}
			
			
			
		}

		public static void address()
		{
			System.out.println("================================================================================");
			System.out.println("enter your name");
			String name=sc.next();
			System.out.println("Enter your adress");
			String address=sc.next();
			System.out.println("Select your mode of payment");
			System.out.println("1.upi, 2.card, 3.COD");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:upi();
			break;
			case 2:card();
			break;
			case 3:cod();
			break;
			default:System.out.println("Invalid choice");
			address();
			
			}
		}
		public static void greet()
		{
			System.out.println("================================================================================");
			System.out.println("<<Your order is placed successfully>>");
			System.out.println("Thanks for choosing Watch For Me");
			System.out.println("Do you want to buy anything else: 'y' for yes 'n' for no");
			char next=sc.next().charAt(0);
			System.out.println("================================================================================");
			Ecom c=new Ecom();
			switch(next)
			{
			case 'y':
				c.mainpage ();
				break;
			case 'n':
				System.exit(0);
				break;
			default:System.out.println("invald choice");
			c.mainpage();
			}
			
		}
}
