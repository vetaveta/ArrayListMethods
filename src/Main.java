

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myStringArrayList = new MyArrayList();
        myStringArrayList.add("ACA");
        myStringArrayList.add("JAVA");
        myStringArrayList.add("DISQO");

        for (int i = 0; i <= 10; i++) {
            myStringArrayList.add("Test " + i);
            System.out.println(myStringArrayList.get(i));
        }

        System.out.println(myStringArrayList.get(0));

        long start = System.currentTimeMillis();
        myStringArrayList.remove(100);
        long end = System.currentTimeMillis();

        System.out.println("remove tooks  " + (end - start));

        System.out.println(myStringArrayList.size());
        boolean isEmpty = myStringArrayList.isEmpty();
        System.out.println(isEmpty);

        boolean contains = myStringArrayList.contains("JAVA");
        System.out.println(contains);

    }
}



