import static org.junit.jupiter.api.Assertions.*;

class AlternativeArrayListTest {

    @org.junit.jupiter.api.Test
    void size() {
        //given
        AlternativeArrayList<Integer> list = new AlternativeArrayList<>();
        //when
        list.add(8);
        //then
        assertEquals(1,list.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        //given
        AlternativeArrayList<Integer> list = new AlternativeArrayList<>();
        AlternativeArrayList<Integer> list2 = new AlternativeArrayList<>();
        //when
        list.add(8);
        //then
        assertFalse(list.isEmpty());
        assertTrue(list2.isEmpty());
    }


    @org.junit.jupiter.api.Test
    void add() {
        //given
        AlternativeArrayList<Integer> list = new AlternativeArrayList<>();
        //when
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3,100);
        //then
        assertEquals(5,list.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        //given
        AlternativeArrayList<Integer> list = new AlternativeArrayList<>();
        //when
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        //then
        assertEquals(3,list.get(2));
        assertEquals(8,list.get(4));
    }

    @org.junit.jupiter.api.Test
    void set() {
        //given
        AlternativeArrayList<Integer> list = new AlternativeArrayList<>();
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(5);
        //when
        list.set(2,55);
        //then
        assertEquals(55,list.get(2));
    }
}