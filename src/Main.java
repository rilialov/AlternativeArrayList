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
        print(list);
    }

    public static void print(AlternativeArrayList<Integer> list) {
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
