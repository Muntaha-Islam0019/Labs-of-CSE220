import java.util.Scanner;
public class Task04{
    public static void main(String[]args){
        
        try {
            Scanner sc=new Scanner(System.in);
            int x,n=sc.nextInt();
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        } catch (Exception e) { 
            System.out.println ("Sorry, that's an error.");
        } finally {
            System.out.println ("THE END");
        }
    }
}
