public class Main {
    public static void main(String[] args) {
        LinkedList2<String> list = new LinkedList2<>();
        list.addFirst("Estrutura de dados 2");
        list.addFirst("Prog1");

        for (var s : list) {
            System.out.println(s);
        }

        System.out.println("Size of list = " + list.size());
    }
}
