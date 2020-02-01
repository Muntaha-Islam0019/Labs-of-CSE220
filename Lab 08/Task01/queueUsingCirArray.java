public class queueUsingCirArray {

    public Object[] array;
    private int front, rear, capacity, size;

    public queueUsingCirArray(int capacity) {

        this.capacity = capacity;

        this.front = this.size = 0;
        this.rear = capacity - 1;

        array = new Object[capacity];
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public boolean isEmpty() {
        return (size == capacity);
    }

    public void enqueue(Object item) {
        if (isFull())
            return;

        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }

    public Object dequeue() {

        if (isEmpty())
            return null;

        Object item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    public int size() {
        return this.size;
    }
}
