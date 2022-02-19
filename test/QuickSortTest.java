import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    AlternativeArrayList<String> list = new AlternativeArrayList<>();
    QuickSort<String> qc;

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
        qc = new QuickSort<>(list, stringCompare);
        //when
        AlternativeArrayList<String> list2 = qc.sort();
        //then
        assertEquals("blaster",list2.get(0));
        assertEquals("text",list2.get(6));
    }
}