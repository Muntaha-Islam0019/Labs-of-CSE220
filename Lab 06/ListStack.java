public class ListStack implements Stack{
    int size;
    Node top;
    
    
    public ListStack(){
        size = 0;
        top = null;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
    
    public void push(Object e) {
        
        Node newNode = new Node(e, null);
        Node temp = top;
        top = newNode;
        top.next = temp;
        
        size++;
    }
    
    public Object pop() throws StackUnderflowException {
        
        if (!isEmpty()) {
            Object popped = top.val;
            top = top.next;
            
            size--;
            
            return popped;
        } else {
            throw new StackUnderflowException();
        }
    }
    
    public Object peek() throws StackUnderflowException {
        
        if (!isEmpty()) {
            return top.val;
        } else {
            throw new StackUnderflowException();
        }
    }
    
    public String toString() {
        
        String str = "[ ";
        
        if (!isEmpty()) {
            
            for (Node n = top; n != null; n = n.next) {
                str += (n.val + " ");
            }
        } else {
            str += "Empty Stack ";
        }
        
        str += "]";
        return str;
    }
    
    public Object[] toArray() {
        
        Object arr [] = new Object[size];
        
        Node n = top;
        
        for (int i = 0; ((n != null) && (i < arr.length)); n = n.next, i++) {
            arr[i] = n.val;
        }
        
        return arr;
    }
    
    public int search(Object e) {
        
        Object tempArr [] = toArray();
        
        int index = 0;
        
        for (Object o: tempArr) {
            
            if (o.equals(e)) {
                return index;
            }
            
            index++;
        }
        
        return -1;
    }
}