import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        LinkedList2<Integer> list = new LinkedList2<>();

        var sc = new Scanner(System.in);
        var line = " ";

        while (!line.isEmpty()) {
            System.out.print("Type some int: ");
            line = sc.nextLine();
            if (!line.isEmpty()){
                try {
                    list.addFirst(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    System.out.println("PLEASE, type some int...");
                }
            }
        }

        for (var i : list) {
            System.out.println(i);
        }

        System.out.println("Size of list = " + list.size());

        sc.close();
    }

}
