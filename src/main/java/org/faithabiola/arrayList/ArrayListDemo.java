package org.faithabiola.arrayList;

import java.util.Arrays;

public class ArrayListDemo {

    private int[] array;
    private int index;

    public ArrayListDemo(int initialSize) {
        array = new int[initialSize];
    }

    //get
    public int[] get() {
        return array;
    }

    //add to array
    public void add(int element) {

        if (index == array.length) {
            int[] newArray = new int[1 + index];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray; //Reassigning the value of array with newArray
            /** int age = 25;
             int newAge = 29;
             age = newAge;
             */
            array[index] = element;
            index++;
        } else {
            array[index] = element;
            index++;
        }

    }

    //delete from the array
    public void delete(int idx) {
        if (idx < index && idx >= 0) {
            int[] newArray = new int[index - 1];
            for (int i = 0, j = 0; i < index; i++) {
                if (idx == i)
                    continue;
                newArray[j] = array[i];
                j++;
            }
            array = newArray;
            index--;
        }

    }

    //find from the array
    public int find(int idx) {
        int result = -1;
        if (idx < index && idx >= 0) {
            for (int i = 0, j = 0; i < index; i++) {
                if (idx == i)
                    result = array[i];
            }
        }
        return result;
    }

    // array contains an element
    public boolean contains(int element) {
        for (int i = 0; i < index; i++) {
            if (element == array[i])
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
