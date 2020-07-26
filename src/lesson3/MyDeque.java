package lesson3;

import java.util.EmptyStackException;

public class MyDeque<T> {
    private final int DEFAULT_CAPACITY = 10;
    private final T[] list;
    private int size = 0;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        for (int i = end - 1; i >= 0; i--) {
            list[i + 1] = list[i];
        }
        list[begin] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T removeLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = list[begin];
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }

    public T removeRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        end--;
        if (end <= 0) {
            end = size - 1;
        }
        T value = list[end];
        size--;
        list[end] = null;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
