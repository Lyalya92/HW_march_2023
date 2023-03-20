package hw2.task1;

public interface MyLinkedList {
    void addAsFirst (int element);
    void addAsLast (int element);
    void add (int element, int index);

    int get (int index);
    int getFirst();
    int getLast();

    void delete (int index);
    void deleteFirst();
    void deleteLast();
}
