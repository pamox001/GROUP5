import java.util.*;
import java.io.*;
import java.util.Scanner;

public class MoneyExchange{
  public static void main(String[] args) throws FileNotFoundException{
  Scanner console= new Scanner(new File("USD.txt"));
	int x=0;
//  do{
	 Scanner scanner=new Scanner(System.in);
	 Scanner opt=new Scanner(System.in);
	 
	System.out.println(" WELCOME!");
	System.out.println("What currency would you like to exchange today, you can choose USD, EUR, GBP or JPY ?");
    String choice=scanner.nextLine().toUpperCase();
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
    /* UNTIL WE FIURE OUT THE REST
    System.out.println("Do you want exchange money again? Y or N");
      String go =opt.nextLine(); 
        if(go.equals("Y")){
          x=1;
        }else{
          x=0;
        }
    }while(x==1); */
  }
   public static void exUSD(Scanner console, int currency, double amount){
	double p;
	double n;
	double d;
	while (console.hasNext()) {
		String coin = console.next();
		double count= console.nextDouble();
		if(coin.equals("EUR")){
			p=(amount*count);	//0.91	
		}else if (coin.equals("GBP")) {
			n = (amount*count); //0.78
		} else if (coin.equals("JPN")) {
			d =(amount*count); //142.48
		}
		if(currency==2){
		System.out.println("USD to EUR: "+ p);
		}else if(currency==3){
		System.out.println("USD to GBP: "+ n);
		}else if(currency==4){
		System.out.println("USD to JPY: "+ d);
		} else {
		System.out.println("USD to EUR: "+ p+"  GBP: "+ n+"  JPY: "+d);
		}
	}
   }

    public static void exEUR(Scanner console, int currency, double amount){
   	double p;
	double n;
	double d;
	double x;
	while (console.hasNext()) {
		String coin = console.next();
		double count= console.nextDouble();
		if(coin.equals("EUR")){
			x=(1/count);
			p=(amount*x);	//0.91	
			if (coin.equals("GBP")){
				n = (amount*count*x); //0.78
			} else if (coin.equals("JPN")) {
				d =(amount*count*x); //142.48
			}
		}
		if(currency==1){
		System.out.println("EUR to USD: "+ p);
		}else if(currency==3){
		System.out.println("EUR to GBP: "+ n);
		}else if(currency==4){
		System.out.println("EUR to JPY: "+ d);
		} else {
		System.out.println("EUR to USD: "+ p+"  GBP: "+ n+"  JPY: "+d);
		}
	}
    }
    public static void exGBP(Scanner console, int currency, double amount){
    	double p;
	double n;
	double d;
	double x;
	while (console.hasNext()) {
		String coin = console.next();
		double count= console.nextDouble();
		if(coin.equals("EUR")){
			x=(1/count);
			p=(amount*x);	//0.91	
			if (coin.equals("GBP")){
				n = (amount*count*x); //0.78
			} else if (coin.equals("JPN")) {
				d =(amount*count*x); //142.48
			}
		}	
		if(currency==1){
		System.out.println("GBP to USD: "+ p);
		}else if(currency==2){
		System.out.println("GBP to EUR: "+ n);
		}else if(currency==4){
		System.out.println("GBP to JPY: "+ d);
		} else {
		System.out.println("GBP to USD: "+ p+"  EUR: "+ n+"  JPY: "+d);
		}
	}  
    }

    public static void exJPY(Scanner console, int currency, double amount){
  	double p;
	double n;
	double d;
	while (console.hasNext()) {
		String coin = console.next();
		double count= console.nextDouble();
		if(coin.equals("EUR")){
			x=(1/count);
			p=(amount*x);	//0.91	
			if (coin.equals("GBP")){
				n = (amount*count*x); //0.78
			} else if (coin.equals("JPN")) {
				d =(amount*count*x); //142.48
			}
		}	
		if(currency==1){
		System.out.println("JPY to USD: "+ p);
		}else if(currency==2){
		System.out.println("JPY to EUR: "+ n);
		}else if(currency==3){
		System.out.println("JPY to GBP: "+ d);
		} else {
		System.out.println("JPY to USD: "+ p+"  EUR: "+ n+"  GBP: "+d);
		}
	}    
    }
}
  
    
