package arraySorter;

import java.util.ArrayList;

/**
 * QuickSort is a class that runs a quick-sort sorting function.
 * @author Stephen Roberts
 * @version 15/12/19
 * @param <T>
 */
public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {
    private int totalint;

    /**
     * Sort sorts the array and returns it sorted.
     * @param array the array to be sorted.
     * @return
     */
    public T[] sort(T[] array) {
        if (array.length >= 1) {
            ArrayList pre0_list = new ArrayList();
            ArrayList post0_list = new ArrayList();
            for (int nextToCompare = 1;nextToCompare < array.length;nextToCompare++){
                if (array[nextToCompare].compareTo(array[0]) > 0) {
                    post0_list.add(array[nextToCompare]);
                }
                else {
                    pre0_list.add(array[nextToCompare]);
                }
            }

            T[] pre0 = (T[]) pre0_list.toArray((T[]) new Comparable[pre0_list.size()]);
            T[] post0 = (T[]) post0_list.toArray((T[]) new Comparable[post0_list.size()]);

            pre0 = sort(pre0);
            post0 = sort(post0);

        T[] mergearray = (T[]) new Comparable[array.length];
        totalint = 0;
        if(pre0.length == 0){
            //
        }
        else {
            for (int preint = 0;preint < pre0.length;preint++){
                mergearray[preint] = pre0[preint];
                totalint = preint + 1;
            }
        }

        mergearray[totalint] = array[0];
        totalint++;

            if(post0.length == 0){
                //
            }
            else {
                for (int postint = 0;postint < post0.length;postint++){
                    mergearray[totalint+postint] = post0[postint];
                }
            }

            return mergearray;
        }
        else {
            return array;
        }


    }}
