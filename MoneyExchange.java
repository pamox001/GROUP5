import java.util.*;
import java.io.*;
import java.util.Scanner;

public class MoneyExchange{
  public static void main(String[] args) throws FileNotFoundException{
	int x=0;
	int repeat=1;
	/*
	EUR=0.91
	GBP=0.78
	JPN=142.48 */
//  do{ 
	System.out.println(" WELCOME! /n");
	
	do{
		//Scanner console= new Scanner(new File("USD.txt"));
		Scanner scanner=new Scanner(System.in);
		Scanner opt=new Scanner(System.in);
	 
	System.out.println(" What currency would you like to exchange today, \n you can choose USD, EUR, GBP or JPY ?");
    String choice=scanner.next();

 if (choice.equals("USD") || choice.equals("EUR") || choice.equals("GBP") || choice.equals("JPY")) {
    /*USe .= for the strings
     * ix so that all string to capetal
		if(choice=="USD"|choice=="EUR"|choice=="GBP"|choice=="JPY"){
		      System.out.println(" Please input a valid choice!");
		      repeat=1;
		}else{ */
			System.out.println(" Do you want to exchange it to 1-USD, 2-EUR, 3-GBP, 4-JPY or 5-All?");  
			int currency=opt.nextInt();  
			System.out.println(" How much would you like to exchange today? ");    
			double amount= opt.nextDouble();
		   // amount= new Scanner(System.in);
		   
		   
			if(choice.equals("USD")){
				
			  exUSD(currency, amount);
			}else if(choice.equals("EUR")){
			  exEUR(currency, amount);
			}else if(choice.equals("JPY")){
			  exJPY(currency, amount);
			 }else if(choice.equals("GBP")){
			  exGBP(currency, amount);
			}
			
			System.out.println(" \n Do you want exchange money again? Y or N");
			String go=opt.next(); 
				if(go.contains("N")){
					break;
				}
		}else{
			System.out.println("ERROR: Please input a valid choice! \n");
		}

			
		
    }while(true);
  }
   public static void exUSD(int currency, double amount){
  	double p=0.00;
	double n=0.00;
	double d=0.00;
	double count= 0.00;
	
		

		//if(coin.equals("EUR")){
			count=0.91;
			p=(amount*count);	//0.91	
		//}else if (coin.equals("GBP")) {
			count=0.78;
			n = (amount*count); //0.78
		//} else if (coin.equals("JPN")) {
			count=142.48;
			d =(amount*count); //142.48
		//}
		if(currency==2){
		System.out.println("USD to EUR: "+ p);
		}else if(currency==3){
		System.out.println("USD to GBP: "+ n);
		}else if(currency==4){
		System.out.println("USD to JPY: "+ d);
			} else if(currency==5){
		System.out.println("USD to EUR: "+ p+"  GBP: "+ n+"  JPY: "+d);
		}
	//}
   }

    public static void exEUR(int currency, double amount){
  	double p=0.00;
	double n=0.00;
	double d=0.00;
	double x=0.00;
	double count= 0.00;
	//while (console.hasNext()) {
		//String coin = console.next();
		//double count= console.nextDouble();
		//if(coin.equals("EUR")){
			count=0.91;
			x=(1.00/count);
			p=(amount*x);	//1.10	
			//if (coin.equals("GBP")){
			count=0.78;
				n = (amount*count*x); //0.86
			//} else if (coin.equals("JPN")) {
			count=142.48;
				d =(amount*count*x); //156.74
			//}
		//}
		if(currency==1){
		System.out.println("EUR to USD: "+ p);
		}else if(currency==3){
		System.out.println("EUR to GBP: "+ n);
		}else if(currency==4){
		System.out.println("EUR to JPY: "+ d);
			} else if(currency==5){
		System.out.println("EUR to USD: "+ p+"  GBP: "+ n+"  JPY: "+d);
		}
	//}
    }
    public static void exGBP(int currency, double amount){
  	double p=0.00;
	double n=0.00;
	double d=0.00;
	double x=0.00;
	double count= 0.00;

	//while (console.hasNext()) {
		//String coin = console.next();
		//double count= console.nextDouble();
		//if(coin.equals("GBP")){
			count=0.78;
			x=(1.00/count);
			p=(amount*x);	//1.27	
			//if (coin.equals("EUR")){
			count=0.91;
				n = (amount*count*x); //1.16
				count=142.48;
			//} else if (coin.equals("JPY")) {
				d =(amount*count*x); //182.85
			//}
		//}	
		if(currency==1){
		System.out.println("GBP to USD: "+ p);
		}else if(currency==2){
		System.out.println("GBP to EUR: "+ n);
		}else if(currency==4){
		System.out.println("GBP to JPY: "+ d);
		} else if(currency==5){
		System.out.println("GBP to USD: "+ p+"  EUR: "+ n+"  JPY: "+d);
		}  
    }

    public static void exJPY(int currency, double amount){
  	double p=0.00;
	double n=0.00;
	double d=0.00;
	double x=0.00;
	double count= 0.00;

	//while (console.hasNext()) {
	//	String coin = console.next();
	//	double count= console.nextDouble();
	//		if(coin.equals("JPY")){
	count=142.48;
				x=(1.00/count);
				p=(amount*x);	//0.007
				//if (coin.equals("EUR")){
				count=0.91;
					n = (amount*count*x); //0.0064
				//} else if (coin.equals("GBP")) {
				count=0.78;
					d =(amount*count*x); //0.0055
				//}
			//}
		//}	
			if(currency==1){
			System.out.println("JPY to USD: "+ p);
			}else if(currency==2){
			System.out.println("JPY to EUR: "+ n);
			}else if(currency==3){
			System.out.println("JPY to GBP: "+ d);
			} else if(currency==5){
			System.out.println("JPY to USD: "+ p+"  EUR: "+ n+"  GBP: "+d);
			}    
    }
}
  
