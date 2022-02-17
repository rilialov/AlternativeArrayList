import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlternativeArrayList<Integer> list = new AlternativeArrayList<>();
        print(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(3,100);
        list.set(4,55);
        print(list);

        AlternativeArrayList<String> list2 = new AlternativeArrayList<>();
        list2.add("text");
        list2.add("text2");
        list2.add("text3");
        list2.add("bla");
        list2.add("bla-bla");
        list2.set(1,"test");
        print(list2);
    }

    public static void print(List list) {
        if (list.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
