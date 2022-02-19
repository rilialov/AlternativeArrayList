import java.util.Comparator;

public class QuickSort<E> {
    private final AlternativeArrayList<E> list;
    private final Comparator<E> comparator;
    private final int quantity;

    public QuickSort(AlternativeArrayList<E> list, Comparator<E> comparator) {
        this.list = list;
        this.comparator = comparator;
        quantity = list.size();
    }

    public AlternativeArrayList<E> sort() {
        recursiveSort(0, quantity-1);
        return list;
    }

    private void recursiveSort(int left, int right) {
        E pivot = list.get(quantity/2);
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
                    swap(leftPtr, rightPtr);
                    leftPtr +=1;
                    rightPtr -=1;
                }
            }
            if (left < rightPtr){
                recursiveSort(left, rightPtr);
            }
            if (leftPtr < right){
                recursiveSort(leftPtr,right);
            }
        }
    }

     private void swap(int index1, int index2) {
        E temp;
        temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp);
    }
}