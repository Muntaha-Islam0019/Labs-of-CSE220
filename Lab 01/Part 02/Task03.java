import java.util.Scanner;
public class Task03{
    public static void main(String[]args){
        
        try {
            Scanner sc=new Scanner(System.in);
            int x,n=sc.nextInt();
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        } catch (ArithmeticException e) { 
            System.out.println ("Sorry, you can't " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Sorry, index " + e.getMessage() + " does not exist.");
        }finally {
            System.out.println ("THE END");
        }
    }
}
