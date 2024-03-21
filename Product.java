package Project;
import java.io.*;
import java.util.*;



public class Product {
	static Scanner sc=new Scanner(System.in);
	int id;
	String Brand_Name;
	String Colour;
	double Price;
	
	public Product(int id,double Price,String Brand_Name,String Colour) {
		this.Price=Price;
		this.id=id;
		this.Colour=Colour;
		this.Brand_Name=Brand_Name;
	}
	
	Product(){
		System.out.println("we have only watches");
	}
	@Override
	public String toString()
	{
		return id+" "+Price +" "+Brand_Name+" "+ Colour;
	}
	public void info()throws IOException{
		FileInputStream fs=new FileInputStream("C:\\books\\New Text Document.txt");
		int num=fs.read();
		while(num!=-1) {
			System.out.print((char)num);
			num=fs.read();
		}
		fs.close();
		Ecom e = new Ecom();
		e.mainpage();
		System.out.println();
	}
	public static void watches() {
		ArrayList l=new ArrayList();
		l.add(new Product (101,1000,"samart watch","Premium look and high durability with Aluminum Alloy case & Corning Gorilla Glass 3, 7kg Tension Resistant;3.3cm (1.3 inch) TFT-LCD Touchscreen with Auto-Brightness adjustment. Adjustable length : 164-208mm\r\n"
				+ "360x360 pixels resolution with up to 600 nits Brightness;Continous Heart Rate Monitor & Blood Oxygen (SpO2) Monitor.\r\n"
				+ "Smart Notifications - displays incoming call alerts and other notifications on your wrist;Smart Controls - Controls your music and clicks pictures on-the-go.\r\n"
				+ "IP68 Water Resistant with 16 Sport Modes;Fast Charging - Charge 2 hours and enjoy up to 15-days Battery Runtime; Magnetic Charging Base for Hassle-free Charging;1 Year Manufacturer Warranty\r\n"
				+ "Band Material Type: Silicone; Wireless Communication Technology: Bluetooth; Included Components: Charger; Human Interface Input: Touch Screen; Connectivity Technology: Wireless; Material Type: Metal"));
		l.add(new Product(102,5000,"analog watch","Dial Color: Black, Case Shape: Round\r\n"
				+ "Band Color: Black, Band Material: Resin\r\n"
				+ "Watch Movement Type: Quartz, Watch Display Type: Analog-Digital\r\n"
				+ "Case Material: Resin, Case Diameter: 52.5 millimeters\r\n"
				+ "Water Resistance Depth: 50 meters\r\n"
				+ "Warranty type:Manufacturer; 2 Years Domestic Warranty\r\n"
				+ "Remove plastic at crown to start the watch\r\n"
				+ "Recommended for customers looking for a large dial sized watches"));
		System.out.println("Chose youer watches by entering id \n 101 for Smart watch \n 102 for Analog");
		int n=sc.nextInt();
		switch(n) {
		case 101:{
			System.out.println("================================================================================");
			System.out.println(l.get(0));
			System.out.println("this are the product details");
			System.out.println("================================================================================");
			System.out.println("do you want to buy this product y for yes and n for no");
			char c=sc.next().charAt(0);
			if(c=='y')
			{
				Pay.address();
			}
			else {
				watches();
			}
			break;
		}
		case 102:{
			System.out.println("================================================================================");
			System.out.println(l.get(1));
			System.out.println("this are the product details");
			System.out.println("==================================================");
			System.out.println("do you want to buy this product");
			System.out.println("do you want to buy this product y for yes and n for no");
			char c=sc.next().charAt(0);
			if(c=='y')
			{
				Pay.address();
			}
			else {
				watches();
			}
			break;
		}
		default:
			System.out.println("invalid item");
			watches();
			
		}
	}
}

