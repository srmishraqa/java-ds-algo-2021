package dsnalg.list.linkedList;

class Node {
    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList {

    private int size;
    private Node start;

    public LinkedList() {
        size = 0;
        start = null;
    }

    public LinkedList(int size, Node start) {
        this.size = size;
        this.start = start;
    }

    public boolean isEmpty() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getListSize() {
        return size;
    }

    public void viewLinkedList() {

        Node t;

        if (isEmpty() == true) {
            System.out.println();
        } else {
            t = start;
            for (int i = 1; i <= size; i++) {
                System.out.print(" " + t.getData());
                t = t.getNext();
            }
        }
    }

    public void insertAtFirst(int value) {
        Node n;
        n = new Node();
        n.setData(value);
        n.setNext(start);
        start = n;
        size++;
    }

    public void insertAtLast(int value) {
        Node n, t;
        n = new Node();
        n.setData(value);
        t = start;
        if (t == null) {
            start = n;
        } else {
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }

    public void insertAtPosition(int value, int position) {
        if (position == 1) {
            insertAtFirst(value);
        } else if (position == size + 1) {
            insertAtLast(value);
        } else if (position > 1 && position <= size) {
            Node t = start;
            Node n = new Node(value, null);
            for (int i = 1; i < position - 1; i++) {
                t = t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;

        } else {
            System.out.println("Insertion at position " + position + " is not possible");
        }

    }

    public void deleteFirst() {
        if (start == null) {
            return;
        } else {
            start = start.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (start == null) {
            return;
        } else if (size == 1) {
            start = null;
            size--;
        } else {

            Node t;
            t = start;
            for (int i = 1; i < size - 1; i++) {
                t = t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            return;
        } else if (position == 1) {
            deleteFirst();
        } else if (position == size) {
            deleteLast();
        } else {
            Node t, t1;
            t = start;
            for (int i = 1; i < position - 1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtFirst(10);
        linkedList.insertAtFirst(20);
        linkedList.insertAtPosition(30, 2);
        linkedList.viewLinkedList();
        //System.out.println(linkedList.getListSize());

    }
}

