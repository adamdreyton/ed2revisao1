import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList2<Item> implements Iterable<Item> {
    private Node first;
    private int n;

    private class LinkedIterator implements Iterator<Item> {
        private Node current;

        public LinkedIterator() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext())
                throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;

            return item;
        }
    }

    private class Node {
        private Item item;
        private Node next;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            first = first.next;
            n--;
        }
    }

    public void addFirst(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        n++;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            Node beforeLast = null;
            Node last = first;

            while (last.next != null) {
                beforeLast = last;
                last = last.next;
            }

            beforeLast.next = null;
            n--;
        }
    }


    public void addLast(Item item) {
        if (isEmpty())
            addFirst(item);
        else {
            Node beforeLast = null;
            Node last = first;

            while (last != null) {
                beforeLast = last;
                last = last.next;
            }

            Node newNode = new Node();
            newNode.item = item;
            beforeLast.next = newNode;
            n++;
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public LinkedList2() {
        first = null;
        n = 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator();
    }
}
