import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList2<Item> implements Iterable<Item>{
    private Node first;
    private int n;

    private class LinkedIterator implements Iterator<Item>{
        private Node current;

        public LinkedIterator(){
            current = first;
        }

        public boolean hasNext(){
            return current != null;
        }

        @Override
        public Item next() {
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            
            return item;
        }
    }

    private class Node {
        private Item item;
        private Node next;
    }

    public void addFirst(Item item){
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        n++; 
    }

    public void addLast(Item item){

    }

    public int size(){
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
