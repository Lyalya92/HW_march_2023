package hw2.task1;

public class CustomOneWayLinkedList implements MyLinkedList{

    protected class Node {
        protected int value;
        protected Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    protected Node head;

    public CustomOneWayLinkedList() {

    }

    @Override
    public int getFirst() {
        return head != null ? head.value : null;
    }

    @Override
    public int getLast() {
        Node lastNode = getLastNode();
        return lastNode != null ? lastNode.value : null;
    }

    @Override
    public void addAsFirst(int element) {
        if (head == null) {
            head = new Node(element);
            return;
        }
        head = new Node(element, head);
    }

    @Override
    public void addAsLast(int element) {
        if (head == null) {
            head = new Node(element);
            return;
        }
        Node lastNode = getLastNode();
        lastNode.next = new Node(element);
    }

    protected Node getLastNode() {
        return head != null ? getNode(getLastNodeIndex()) :null;
    }

    protected int getLastNodeIndex() {
        int counter = 0;
        if (head == null) {
            throw  new IllegalArgumentException("List is empty");
        }
        Node last = head;
        while (last.next != null){
            last = last.next;
            counter++;
        }
        return counter;
    }

    protected Node getNode(int index) {
        if (head == null) {
            throw new IllegalArgumentException("Index " + index + " out of bounds");
        }
        int counter = 0;
        Node currentNode = head;
        while (counter != index && currentNode.next != null) {
            currentNode = currentNode.next;
            counter++;
        }
        if (counter != index) {
            throw new IllegalArgumentException("Index " + index + " out of bounds");
        }

        return currentNode;
    }

    @Override
    public void add(int element, int index) {
        if (index == 0) {
            addAsFirst(element);
        }
        Node node = getNode(index - 1);
        Node newNextNode = node.next;
        node.next = new Node(element, newNextNode);
    }

    @Override
    public int get(int index) {
        Node node = getNode(index);
        return node != null ? node.value : null;
    }

    @Override
    public void delete(int index) {
        if (index == 0) {
            if (head == null) {
                throw  new IllegalArgumentException("Index " + index + " out of bounds");
            }
            head = head.next;
            return;
        }

        Node node = getNode(index - 1);
        Node nodeForRemove = node.next;
        if (nodeForRemove == null) {
            throw  new IllegalArgumentException("Index " + index + " out of bounds");

        }
        Node newNextNode = nodeForRemove.next;
        node.next = newNextNode;

    }

    @Override
    public void deleteFirst() {
        if (head == null) {
            throw  new IllegalArgumentException("List is empty");
        }
        head = head.next;
    }

    @Override
    public void deleteLast() {
        if (head == null) {
            throw  new IllegalArgumentException("List is empty");
        }
        int index = getLastNodeIndex();
        delete(index);
    }
}
