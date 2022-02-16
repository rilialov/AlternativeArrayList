import java.util.*;

public class AlternativeArrayList<E> implements List<E> {
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

    //TODO доделать
    private Object[] grow() {
        return grow(quantity + 1);
    }
    //TODO доделать
    private Object[] grow(int minCapacity) {
        return objects = Arrays.copyOf(objects, newCapacity());
    }

    //TODO доделать
    private int newCapacity() {
        int oldCapacity = objects.length;
        return (oldCapacity * 3) / 2 + 1;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
