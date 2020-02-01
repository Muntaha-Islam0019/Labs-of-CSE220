import java.util.Scanner;

public class Tester {

    private static void print(linkedList lst) {
        if(lst.countNode() == 1) System.out.println(lst.head.element);
        else {
            linkedList newLst = new linkedList(lst.head.next);
            print(newLst);
            System.out.println(lst.head.element);
        }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of your linked list.");
        int size = sc.nextInt();

        System.out.println("Please enter values for your linked list.");
        Object [] arr = new Object[size];

        int index = 0;
        while(size > 0) {
            arr[index] = sc.nextInt();
            index++;
            size--;
        }

        linkedList lst  = new linkedList(arr);

        System.out.println("Printing all values reversely:");
        print(lst);
    }
}
