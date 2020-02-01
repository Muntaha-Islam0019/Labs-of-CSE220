class queueUsingList {

    private LinkedList lst;
    private int size;

    queueUsingList() {
        this.size = 0;
        lst = new LinkedList();
    }

    void enqueue(Object item) {
        lst.add(item);
        this.size = this.size + 1;
    }

    Object dequeue() {
        Object item = lst.remove();
        this.size = this.size - 1;
        return item;
    }

    int size() {
        return this.size;
    }
}
