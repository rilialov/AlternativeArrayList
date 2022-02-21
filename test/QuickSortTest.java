import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    AlternativeArrayList<String> list = new AlternativeArrayList<>();
    QuickSort<String> qs;

    @Test
    void sort() {
        //given
        list.add("text");
        list.add("part");
        list.add("test");
        list.add("big");
        list.add("egg");
        list.add("faster");
        list.add("blaster");
        list.add("something");
        Comparator<String> stringCompare = Comparator.comparing((String x) -> x);
        qs = new QuickSort<>();
        //when
        AlternativeArrayList<String> list2 = qs.sort(list, stringCompare);
        //then
        assertEquals("blaster",list2.get(0));
        assertEquals("text",list2.get(6));
    }
}