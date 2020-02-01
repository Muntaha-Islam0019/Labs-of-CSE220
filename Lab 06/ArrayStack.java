public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
    
    public void push(Object e) throws StackOverflowException {
        
        if (size != data.length) {
            data[size] = e;
            size++;
        } else {
            throw new StackOverflowException();
        }
    }
    
    public Object pop() throws StackUnderflowException {
        if (!isEmpty()) {
            Object popped = data[--size];
            return popped;
        } else {
            throw new StackUnderflowException();
        }
    }
    
    public Object peek() throws StackUnderflowException {
        
        if (!isEmpty()) {
            return data[size-1];
        } else {
            throw new StackUnderflowException();
        }
    }
    
    public String toString() {
        
        String str = "[ ";
        
        if (!isEmpty()) {
            
            for (int i = size - 1; i >= 0; i--) {
                str += (data[i] + " ");
            }
            
        } else {
            str += "Empty Stack ";
        }
        
        str += "]";
        return str;
    }
    
    public Object[] toArray() {
        
        Object arr [] = new Object[size];
        
        for (int i = size-1, j = 0; (i >= 0 && (j < arr.length)); i--, j++) {
            arr[j] = data[i];
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