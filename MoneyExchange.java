import java.util.*;
import java.io.*;
import java.util.Scanner;

public class MoneyExchange{
  public static void main(String[] args) throws FileNotFoundException{
  Scanner console= new Scanner(new File("USD.txt"));
	int x=0;
  do{
	 Scanner scanner=new Scanner(System.in);
	 Scanner opt=new Scanner(System.in);
	 
    System.out.println(" Hi! What currency would you like to exchange today, you can choose USD, EUR, GBP or JPY ?");
    String choice=scanner.nextLine();
    System.out.println(" Do you want to exchange it 1-USD, 2-EUR, 3-GBP, 4-JPY or 5-All?");  
	int currency=opt.nextInt();  
	System.out.println(" How much would you like to exchange today? ");    
    double amount= opt.nextDouble();
   // amount= new Scanner(System.in);
    if(choice.equals("USD")){
      exUSD(console,  currency, amount);
    }else if(choice.equals("EUR")){
      exEUR(console,  currency, amount);
    }else if(choice.equals("JPY")){
      exJPY(console,  currency, amount);
     }else if(choice.equals("GBP")){
      exGBP(console,  currency, amount);
    }else{
      System.out.println(" Please input a valid choice!");
    }
    
    System.out.println("Do you want exchange money again? Y or N");
      String go =opt.nextLine(); 
        if(go.equals("Y")){
          x=1;
        }else{
          x=0;
        }
    }while(x==1);
  }
   public static void exUSD(Scanner console, int currency, double amount){
 
   }

    public static void exEUR(Scanner console, int currency, double amount){
   
    }
    public static void exGBP(Scanner console, int currency, double amount){
      
    }

    public static void exJPY(Scanner console, int currency, double amount){
      
    }
}
  
    
