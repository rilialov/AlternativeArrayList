import java.util.*;

/**
 * Custom ArrayList class.
 * @author Rustem Ilialov
 */

public class AlternativeArrayList<E> implements CustomList<E> {

    /** Default initial capacity */
    private static final int DEFAULT_CAPACITY = 10;

    /** The number of elements contained in list */
    private int quantity;

    /** The array buffer into which the elements of the list are stored */
    private Object[] objects;

    /**
     * Constructs an empty list with the default initial capacity
     * @see AlternativeArrayList#AlternativeArrayList(int)
     */
    public AlternativeArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructs an empty list with the specified initial capacity.
     * @param capacity the initial capacity of the list
     */
    public AlternativeArrayList(int capacity) {
        if (capacity > 0) {
            objects = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
        }
    }

    /**
     * Appends the specified element to the end of this list
     * @param e element to be appended to this list
     * @return true
     */
    @Override
    public boolean add(E e) {
        add(e, objects, quantity);
        return true;
    }

    /**
     * This helper method for check array capacity and grow if it need
     */
    private void add(E e, Object[] objects, int q) {
        if (q == objects.length) {
            objects = grow();
        }
        objects[q] = e;
        quantity = q + 1;
    }

    /**
     * Inserts the specified element at the specified position in this list
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException
     */
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

    /**
     * Method for check the array have this index
     * @param index index that be checked
     * @throws IndexOutOfBoundsException
     */
    private void rangeCheck(int index) {
        if (index > quantity || index < 0)
            throw new IndexOutOfBoundsException(index);
    }

    /**
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return quantity;
    }

    /**
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return quantity == 0;
    }

    /**
     * Increases the capacity
     */
    private Object[] grow() {
        return objects = Arrays.copyOf(objects, (objects.length * 3) / 2 + 1);
    }

    /**
     * Returns the element at the specified position in this list
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    @Override
    public E get(int index) {
        Objects.checkIndex(index, quantity);
        return (E) objects[index];
    }

    /**
     * Replaces the element at the specified position in this list with the specified element
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException
     */
    @Override
    public E set(int index, E element) {
        Objects.checkIndex(index, quantity);
        E oldValue = (E) objects[index];
        objects[index] = element;
        return oldValue;
    }
}
