public interface CustomList<E> {

    boolean add(E e);

    void add(int index, E element);

    int size();

    boolean isEmpty();

    E get(int index);

    E set(int index, E element);

}