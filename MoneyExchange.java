import java.util.*;
import java.io.*;

public class MoneyExchange{
  public static vois main(String[] args) throws FileNotFoundException{
  Scanner console= new Scanner(new File("USD.txt"));

  while(true){
    System.out.println(" Hi! What currency would you like to exchange today, you can choose USD, EUR or JPY ?");
    Scanner scanner=new Scanner(System.in);
    System.out.println(" Do you want to exchange it 1-USD, 2-EUR, 3-JPY or 4-All?");  
    int currency= new Scanner(System.in);
    System.out.println(" How much would you like to exchange today? ");    
    double amount= new Scanner(System.in);
    String choice=scanner.nextLine();
    if(choice.equals("USD")){
      exUSD(console,  currency, amount);
    }else if(choice.equals("EUR")){
      exEUR(console,  currency, amount);
    }else if(choice.equals("JPY")){
      exJPY(console,  currency, amount);
    }else{
      System.out.println(" Please input a valid choice!")
    }
    
    System.out.println("Do you want exchange money again? Y or N");
      Scanner go=new Scanner(System.in);
        if(go.equals("Y")){
          go=true;
        }else{
          go=false;
        }
        return go;
    }
  }
   public static void exUSD(Scanner console, int currency, double amount){
 
   }

    public static void exEUR(Scanner console, int currency, double amount){
   
    }

    public static void exJPY(Scanner console, int currency, double amount){
      
    }


  
    
