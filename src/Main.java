import java.util.ArrayList;
interface Stack<T>{
    void push(T item);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}
class ArrayStack<T> implements Stack<T>{

    final int INITIAL_SUZE = 128;
    ArrayList<T> items;
    int size;
    public ArrayStack(){
        this.items = new ArrayList<T>();
        this.items.ensureCapacity(INITIAL_SUZE);
        this.size = 0;
    }

    @Override
    public void push(T item) {
        this.items.add(this.size,item);
        this.size += 1;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new RuntimeException("empty stack");
        }
        this.size--;
        T item = this.items.get(this.size);
        this.items.remove(this.size);
        return item;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}