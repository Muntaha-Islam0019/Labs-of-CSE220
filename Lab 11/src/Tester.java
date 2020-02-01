public class Tester {

    // Driver method
    public static void main(String[] args) {

        Tree tree = new Tree(19);

        tree.addElement(47);
        tree.addElement(67);
        tree.addElement(9);
        tree.addElement(10);

        /*Task 03*/
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        /*Task 04*/
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        /*Task 05*/
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();

        /*Task 01*/
        System.out.println("\nThe tree's height is: " + tree.treesHeightFinder());

        /*Ignore this part, I did it for clearing my own conceptual problems.*/
        System.out.println("Here, height of 19 is: " + tree.nodesHeightFinder(tree.root) +
                " and height of 47 is: " + tree.nodesHeightFinder(tree.root.right));

        /*Task 02*/
        System.out.println("Here, level of the Node on roots' left: " + tree.levelFinder(tree.root.left) +
                " and the level of roots' right childs' right child: " + tree.levelFinder(tree.root.right.right));

        /*Task 06*/
        Tree treeForCheckingEquivalence = new Tree(19);

        treeForCheckingEquivalence.addElement(47);
        treeForCheckingEquivalence.addElement(67);
        treeForCheckingEquivalence.addElement(9);
        treeForCheckingEquivalence.addElement(10);
        treeForCheckingEquivalence.addElement(31);

        System.out.println("New tree and previous tree are equivalent: " +
                tree.checkEquivalence(treeForCheckingEquivalence.root, tree.root));

        /*Task 07*/
        Node newTreesRoot = tree.copyTree(tree.root);
        System.out.print("Printing new tree in pre-order: ");
        tree.printPreorder(newTreesRoot);
    }
}