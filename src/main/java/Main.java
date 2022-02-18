public class Main {
    public static void main(String[] args) {

        AlternativeArrayList<String> list2 = new AlternativeArrayList<>();
        list2.add("text");
        list2.add("text2");
        list2.add("text3");
        list2.add("bla");
        list2.add("bla-bla");
        list2.set(1,"test");
        print(list2);
    }

    public static void print(CustomList list) {
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
