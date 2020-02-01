import java.util.Scanner;

public class Tester {

    /*private static int add(linkedList lst) {
        if(lst.countNode() == 1) return (int)lst.head.element;
        else {
            linkedList newLst = new linkedList(lst.head.next);
            return (int)lst.head.element + add(newLst);
        }
    }*/

    private static int add(Node head) {
        if(head.next == null) return (int)head.element;
        else return (int) head.element + add(head.next);
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

        /*System.out.println("Summation of values: " + add(lst));*/
        System.out.println("Summation of values: " + add(lst.head));
    }
}
