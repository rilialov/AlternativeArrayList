import java.util.Comparator;

/**
 * Custom QuickSort class.
 * @author Rustem Ilialov
 */

public class QuickSort<E> {

    /**
     * @param list list for sort
     * @param comparator sort comparator
     * @return sorted list
     */
    public AlternativeArrayList<E> sort(AlternativeArrayList<E> list, Comparator<E> comparator) {
        recursiveSort(0, list.size()-1, list, comparator);
        return list;
    }

    /**
     * Recursive method that realize quick sort algorithm
     * @param left index of first element
     * @param right index of last element
     * @param list list for sort
     * @param comparator sort comparator
     */
    private void recursiveSort(int left, int right, AlternativeArrayList<E> list, Comparator<E> comparator) {
        E pivot = list.get(list.size()/2);
        int leftPtr = left;
        int rightPtr = right;

        if (rightPtr > leftPtr) {
            while (leftPtr <= rightPtr) {
                while(leftPtr < right && comparator.compare(list.get(leftPtr), pivot) < 0) {
                    leftPtr += 1;
                }
                while (rightPtr > left && comparator.compare(list.get(rightPtr), pivot) > 0) {
                    rightPtr -= 1;
                }
                if (leftPtr <= rightPtr){
                    swap(leftPtr, rightPtr, list);
                    leftPtr +=1;
                    rightPtr -=1;
                }
            }
            if (left < rightPtr){
                recursiveSort(left, rightPtr, list, comparator);
            }
            if (leftPtr < right){
                recursiveSort(left, rightPtr, list, comparator);
            }
        }
    }

    /**
     * Method what swap specified elements at the specified positions
     * @param index1 index of first element
     * @param index2 index of second element
     * @param list list for sort
     */
     private void swap(int index1, int index2, AlternativeArrayList<E> list) {
        E temp;
        temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp);
    }
}