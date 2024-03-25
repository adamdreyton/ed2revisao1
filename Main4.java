
public class Main4 {
    public static void main(String[] args) {
        LinkedList2<Integer> list = new LinkedList2<>();

        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addLast(10);
        list.addLast(12);
        list.addLast(13);
        list.addFirst(15);
        
        for (var i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        list.removeFirst();
        list.removeLast();
        list.removeLast();
        list.removeFirst();

        for (var i : list) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "Size of list = " + list.size());

    }
}
