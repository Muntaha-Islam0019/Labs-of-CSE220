public class stack {
    private int size;
    private Node top;

    stack() {
        size = 0;
        top = null;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void push(Object e) {

        Node newNode = new Node(e, null);
        Node temp = top;
        top = newNode;
        top.next = temp;

        size++;
    }

    Object pop() throws StackUnderflowException {

        if (!isEmpty()) {
            Object popped = top.val;
            top = top.next;

            size--;

            return popped;
        } else {
            throw new StackUnderflowException();
        }
    }

    Object peek() throws StackUnderflowException {

        if (!isEmpty()) {
            return top.val;
        } else {
            throw new StackUnderflowException();
        }
    }

    public String toString() {

        StringBuilder str = new StringBuilder("[ ");

        if (!isEmpty()) {

            for (Node n = top; n != null; n = n.next) {
                str.append(n.val).append(" ");
            }
        } else {
            str.append("Empty Stack ");
        }

        str.append("]");
        return str.toString();
    }
}