public class Tester {
    // Driver method
    public static void main(String[] args) {

        Tree tree = new Tree(19);

        tree.addElement(47);
        tree.addElement(67);
        tree.addElement(9);
        tree.addElement(10);

        System.out.println("The tree contains 50: " + tree.search(50));

        System.out.print("After sorting the tree: ");
        tree.printSorted();
        System.out.println();
    }
}
