package de.jakob.lists;

public class CyclicList<T>{

    protected class Node<T>{

        T data;
        Node next = null;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    Node<T> anfang = null;

    public CyclicList() {
    }

    public void add(T newData){
        Node<T> temp = new Node<>(newData, null);
        if (anfang == null){
            temp.next = temp;
            anfang = temp;
        } else {
            temp.next = anfang.next;
            anfang.next = temp;
            anfang = temp;
        }
    }

    public void print() {
        Node<T> start = anfang;
        do{
            System.out.println("Knoten: " + start.data + " Nächster Knoten: " + start.next.data);
            start = start.next;
        } while (start != anfang);
    }
}
