package lesson4;

public class MyLinkedQueue<T> {
    private final MyLinkedList<T> stack = new MyLinkedList<>();

    public void insert(T item) {
        int index = Math.max(index(item), 0);
        stack.insert(index, item);
    }

    public boolean delete(T item) {
        return stack.delete(item);
    }

    public T peek() {
        return stack.getLast();
    }

    public int size() {
        return stack.size();
    }

    public int index(T item) {
        return stack.indexOf(item);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String toString(){
        return stack.toString();
    }
}
