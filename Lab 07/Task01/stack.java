class stack {
    private int top = -1;
    private Object[] items = new Object[100];
    private int size = 0;

    void push(Object x) throws StackOverflowException {
        if (top == 99) {
            throw new StackOverflowException();
        } else {
            items[++top] = x;
        }

        size++;
    }

    Object pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException();
        } else {
            Object element = items[top];
            top--;
            size--;
            return element;
        }

    }

    Object peek() throws StackUnderflowException {
        if (top == -1) throw new StackUnderflowException();
        else return items[size - 1];
    }

    boolean isEmpty() {
        return (top == -1);
    }
}