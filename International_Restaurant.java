package International_Food;
// import Scanner
import java.util.Scanner;

public class International_Restaurant{
	// User Input
static Scanner  sc=new Scanner(System.in); 
static int ch ;
static int quantity;
static int total;

public void  Allfood()
// International_Restaurant Food Menu First Display 
{
System.out.println("* * * * *  Please Welcome to International_Restaurant * * * * * * ");
System.out.println("----------------------------------------------------------------");
System.out.println("               Food Items                                 No   ");
System.out.println("----------------------------------------------------------------");
System.out.println("You Want to Indian Food Please Enter Number----------------1 ");
System.out.println("You Want to Chines Food Please Enter Number----------------2 ");
System.out.println("You Want to Amreican Food Please Enter Number--------------3 ");
System.out.println("You Want to Italian Food Please Enter Number---------------4 ");
System.out.println("Exit Enter Number------------------------------------------5 ");
System.out.println("----------------------------------------------------------------");
}

public void menu()
{
	
	//indian food 
int	Tamil_Nadu_Biryani_And_Masala_vadai = 800;
int Hyderabiryani = 850;
int White_Rice_Rasam = 500;
int Vegetable_Biryani = 900;

// While Loop
	while(true) {
		System.out.println();
		System.out.println("Enter your Choice :");
		ch = sc.nextInt();
		// Switch 
		switch(ch)
		{
		case 1:
			// Indian Food Details Menu
			System.out.println(" WelCome to Indian Food ");
			System.out.println("You Want to Tamil Nadu Biryani & Masala vadai Please Enter Number  1 ");
			System.out.println("You Want to Hyderabiryani  Please Enter Number   2 ");
			System.out.println("You Want to White Rice Rasam Please Enter Number  3 ");
			System.out.println("You Want to Vegetable Biryani Please Enter Number   4 ");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();
			
		switch(ch) {
		case 1:
			 System.out.println("You have selected Tamil Nadu Biryani & Masala vadai:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Tamil_Nadu_Biryani_And_Masala_vadai;
			 break;

		case 2:
			 System.out.println("You have selected Hyderabiryani:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Hyderabiryani;
			 break;
		
		case 3:
			 System.out.println("You have selected Rice Rasam:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*White_Rice_Rasam;
			 break;
		
		case 4:
			 System.out.println("You have selected Vegetable Biryani:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Vegetable_Biryani;
			 break;
		}
		System.out.println();
		 System.out.println("Do yo wish to order anything else Yes/No: ");
		String again=sc.next();
		 if(again.equalsIgnoreCase("Yes"))
		 {
			 Allfood();
		 }
	     else if(again.equalsIgnoreCase("NO"))
	     {
	        generateBill();
	        System.exit(1);
	     }
	     else
		 {
	       System.out.println("Invalid choice:");
	     }	
		 
		}
		 //Chines Food
		 int kung_pao_cheicken=1200;
		 int sweet_sour_pork=950;
		 int Mapo_tofu=660;
		 int Spring_Rolle=400;
		 
		switch(ch) { 
		case 2:
			// Chiness Food Details Menu
			System.out.println(" WelCome to Chines Food ");
			System.out.println("You Want to kung_pao_cheicken Please Enter Number  1 ");
			System.out.println("You Want to sweet_sour_pork  Please Enter Number   2 ");
			System.out.println("You Want to Mapo_tofu Please Enter Number  3 ");
			System.out.println("You Want to Spring_Rolle Please Enter Number   4 ");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();
			
		switch(ch)
		{
		case 1:
			 System.out.println("You have selected kung_pao_cheicken:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*kung_pao_cheicken ;
			 break;

		case 2:
			 System.out.println("You have selected sweet_sour_pork:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*sweet_sour_pork;
			 break;
		
		case 3:
			 System.out.println("You have selected Mapo_tofu:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Mapo_tofu;
			 break;
		
		case 4:
			 System.out.println("You have selected Spring_Rolle:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Spring_Rolle;
			 break;
		}	
		
		System.out.println();
		 System.out.println("Do yo wish to order anything else Yes/No: ");
		String again=sc.next();
		// Conditional Statemant
		 if(again.equalsIgnoreCase("Yes"))
		 {
			 Allfood();
		 }
	     else if(again.equalsIgnoreCase("NO"))
	     {
	        generateBill();
	        System.exit(1);
	     }
	     else
		 {
	       System.out.println("Invalid choice:");
	     }	
		 
		}
		 
		// American Food
		
		 int Bun_Burger=900;
		 int Cheese_cake=770;
		 int KFC=889;
		 int Hot_Dogs=880;
		 
		switch(ch) { 
		case 3:
			// Amrican Food Details Menu
			System.out.println(" WelCome to American Food ");
			System.out.println("You Want to Bun_Burger Please Enter Number  1 ");
			System.out.println("You Want to Cheese_cake  Please Enter Number   2 ");
			System.out.println("You Want to KFC Please Enter Number  3 ");
			System.out.println("You Want to  Hot_Dogs Please Enter Number   4 ");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();
			
		switch(ch)
		{
		case 1:
			 System.out.println("You have selected Bun_Burger:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Bun_Burger ;
			 break;
		
		case 2:
			 System.out.println("You have selected Cheese_cake:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Cheese_cake;
			 break;
	
		case 3:
			 System.out.println("You have selected KFC:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*KFC;
			 break;

		case 4:
			 System.out.println("You have selected  Hot_Dogs:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity* Hot_Dogs;
			 break;
		}	
		
		System.out.println();
		 System.out.println("Do yo wish to order anything else Yes/No: ");
		String again=sc.next();
		 if(again.equalsIgnoreCase("Yes"))
		 {
			 Allfood();
		 }
	     else if(again.equalsIgnoreCase("NO"))
	     {
	        generateBill();
	        System.exit(1);
	     }
	     else
		 {
	       System.out.println("Invalid choice:");
	     }	
		 
		} 
		
		// Italian
		
		int Spaghetti_Carbonara=2000;
		 int Napoletana_Pizza=999;
		 int Risotto=370;
		 int Arancini=440;
		 
		switch(ch) { 
		case 4:
			// Italian Food Details Menu
			System.out.println(" WelCome to Italian Food ");
			System.out.println("You Want to Spaghetti_Carbonara Please Enter Number  1 ");
			System.out.println("You Want to Napoletana_Pizza  Please Enter Number   2 ");
			System.out.println("You Want to Risotto Please Enter Number  3 ");
			System.out.println("You Want to  Arancini Please Enter Number   4 ");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();
			
		switch(ch)
		{
		case 1:
			 System.out.println("You have selected Spaghetti_Carbonara:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Spaghetti_Carbonara ;
			 break;
		
		
		
		case 2:
			 System.out.println("You have selected Napoletana_Pizza:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Napoletana_Pizza;
			 break;
		
		
	
		case 3:
			 System.out.println("You have selected Risotto:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity*Risotto;
			 break;
				
		case 4:
			 System.out.println("You have selected  Arancini:");
			 System.out.println();
			 System.out.println("select desired quantiy:");
			 quantity=sc.nextInt();
			 total=quantity* Arancini;
			 break;
		}	
		
		System.out.println();
		 System.out.println("Do yo wish to order anything else Yes/No: ");
		String again=sc.next();
		 if(again.equalsIgnoreCase("Yes"))
		 {
			 Allfood();
		 }
	     else if(again.equalsIgnoreCase("NO"))
	     {
	        generateBill();
	        System.exit(1);
	     }
	     else
		 {
	       System.out.println("Invalid choice:");
	     }	
		 
		} 	
	// Exit	
		switch(ch) {
		case 5:
			System.out.println("Thank Your For Visiting International_Restaurant");		
		 break;
		 }
		break;
	 }
}

// Bill Genrating 

	private void generateBill() {
	// TODO Auto-generated method 
		System.out.println();
		 System.out.println("*****ThankYou For ordering******");
		 System.out.println("***your Bill is:"+total+"*******");
		 System.out.println("****************");	
}	
//     Main Method Call
public static void main(String args[]){

	// Object
International_Restaurant food = new International_Restaurant();
// Method
food.Allfood();
food.menu();
}
}



