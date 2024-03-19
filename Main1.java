import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        LinkedList2<String> list = new LinkedList2<>();

        var sc = new Scanner(System.in);
        var line = " ";

        while (!line.isEmpty()) {
            System.out.print("Type some pharse: ");
            line = sc.nextLine();
            if (!line.isEmpty())
                list.addFirst(line);
        }

        for (var str : list) {
            System.out.println(str);
        }

        System.out.println("Size of list = " + list.size());

        sc.close();
    }
}
