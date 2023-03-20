package hw2.task2;

import java.util.Arrays;

public class CustomArrayList implements MyArrayList {
    private static final int DEFAULT_CAPACITY = 8;
    private int size = 0;
    private int elements[];

    public CustomArrayList() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int capacity) {
        elements = new int[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add (int element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }

    @Override
    public int indexOf(int element) {
        for (int i =0; i < size; i++) {
            if (elements[i] == element) return i;
        }
        return -1;
    }

    protected void ensureCapacity() {
        if (elements.length < size + 1) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    @Override
    public void add(int element, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index " + index + " out of bounds");
        }
        ensureCapacity();
        for(int i = size; i > index; i--) {
            elements[i] = elements[i-1];
        }

        elements[index] = element;
        size++;
    }


    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index " + index + " out of bounds");
        }

        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }

    @Override
    public int get(int index) {
        if (index <0 || index >= size) {
            throw new IllegalArgumentException("Index " + index + " out of bounds");
        }

        return elements[index];

    }

    @Override
    public boolean contains(int element) {
        for (int i =0; i < size; i++) {
            if (elements[i] == element) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < size; i++) {
            result = result + elements[i] + " ";
        }
        result += "]";

        return result;
    }
}
