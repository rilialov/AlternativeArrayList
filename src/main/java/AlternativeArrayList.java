import java.util.*;

public class AlternativeArrayList<E> implements CustomList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private int quantity;

    private Object[] objects;

    public AlternativeArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public AlternativeArrayList(int capacity) {
        if (capacity > 0) {
            objects = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
        }
    }

    @Override
    public boolean add(E e) {
        add(e, objects, quantity);
        return true;
    }

    private void add(E e, Object[] objects, int q) {
        if (q == objects.length) {
            objects = grow();
        }
        objects[q] = e;
        quantity = q + 1;
    }

    @Override
    public void add(int index, E element) {
        rangeCheck(index);
        final int size = quantity;
        Object[] objectsCopy = objects;
        if (quantity == objects.length) {
            objects = grow();
        }
        System.arraycopy(objectsCopy, index, objectsCopy, index + 1, size - index);
        objectsCopy[index] = element;
        quantity = size + 1;
    }

    private void rangeCheck(int index) {
        if (index > quantity || index < 0)
            throw new IndexOutOfBoundsException(index);
    }

    @Override
    public int size() {
        return quantity;
    }

    @Override
    public boolean isEmpty() {
        return quantity == 0;
    }

    private Object[] grow() {
        return objects = Arrays.copyOf(objects, (objects.length * 3) / 2 + 1);
    }

    @Override
    public E get(int index) {
        return (E) objects[index];
    }

    @Override
    public E set(int index, E element) {
        Objects.checkIndex(index, quantity);
        E oldValue = (E) objects[index];
        objects[index] = element;
        return oldValue;
    }
}
