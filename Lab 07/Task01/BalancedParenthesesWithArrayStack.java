import java.util.Scanner;

public class BalancedParenthesesWithArrayStack {
    private static boolean isMatchingPair(Object character1, Object character2) {
        if (character1.equals('(') && character2.equals(')'))
            return true;
        else if (character1.equals('{') && character2.equals('}'))
            return true;
        else return (character1.equals('[') && character2.equals(']'));
    }

    private static boolean areParenthesesBalanced(char[] exp) {
        stack st = new stack();
        stack in = new stack();

        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
                try {
                    st.push(exp[i]);
                    in.push(i + 1);
                } catch (StackOverflowException e) {
                    System.out.println("Stack full.\n" + e);
                }
            } else if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
                if (st.isEmpty()) {
                    System.out.println("This expression is NOT correct.\nError at character # " + (i + 1) + ". '" + exp[i] + "'- not opened.");
                    return false;
                } else {
                    try {
                        if (!isMatchingPair(st.peek(), exp[i])) {
                            System.out.println("This expression is NOT correct.\nError at character # " + in.pop() + ". '" + st.pop() + "'- not closed.");
                            return false;
                        } else {
                            st.pop();
                            in.pop();
                        }
                    } catch (StackUnderflowException e) {
                        System.out.println("Stack empty.\n" + e);
                    }
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            try {
                System.out.println("This expression is NOT correct.\nError at character # " + in.pop() + ". '" + st.pop() + "'- not closed.");
            } catch (StackUnderflowException e) {
                System.out.println("Stack empty.\n" + e);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an expression: ");
        String str = sc.nextLine();

        char[] exp = str.toCharArray();

        boolean check = areParenthesesBalanced(exp);

        if (check)
            System.out.println("This expression is correct.");
    }
}
