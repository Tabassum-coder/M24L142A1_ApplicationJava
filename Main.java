//activity to understand the use of finally
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println("enter two numbers");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
            System.out.println(x+ "/"+ y +" = "+z);
        }
        catch(ArithmeticException ae){
            System.out.println("---catch block----");
            System.out.println(ae.toString());
        }
        finally{
            System.out.println("---finally block----");
            System.out.println("Application designed and developed by");
            System.out.println(" team @ Codingal");
            sc.close();
        }
        System.out.println("Done");
    }
}
