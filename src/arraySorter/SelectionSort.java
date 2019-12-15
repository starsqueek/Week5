package arraySorter;

import java.util.ArrayList;

/**
 * SelectionSort is a class that sorts a given array using the selection sort method of sorting arrays of data.
 * @author Stephen Roberts
 * @version 15/12/19
 * @param <T>
 */
public class SelectionSort<T extends Comparable<? super T>> implements ArraySort<T> {

    /**
     * Sorts the data using selection sort, returns the array sorted.
     * @param array the array to be sorted.
     * @return
     */
    public T[] sort(T[] array) {
        ArrayList listsorted = new ArrayList();
        for(int sortedlist=0;sortedlist<array.length;sortedlist++) {
            int sortb = sortedlist;
            for (int sorta = sortedlist; sorta < (array.length); sorta++) {
                if (array[sorta].compareTo(array[sortb]) > 0) {
                    sortb = sorta;
                }
            }
            T tmp = array[sortedlist];
            array[sortedlist] = array[sortb];
            array[sortb] = tmp;
            listsorted.add(array[sortedlist]);
        }
        T[] listsort = (T[]) listsorted.toArray((T[]) new Comparable[listsorted.size()]);
        return listsort;
    }
}
