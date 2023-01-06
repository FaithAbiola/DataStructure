package org.faithabiola;

import org.faithabiola.arrayList.ArrayListDemo;

public class Main {
    public static void main(String[] args) {
        ArrayListDemo myArray = new ArrayListDemo(3);

        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(40);
        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(40);

        System.out.println(myArray);
        myArray.delete(4);
        System.out.println(myArray);

        int find = myArray.find(0);
        System.out.println(find);

        boolean contain = myArray.contains(40);
        System.out.println(contain);
        contain = myArray.contains(15);
        System.out.println(contain);


    }
}