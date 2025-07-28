package BridgeLabz_SIPP_Training.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class SimpleReverseList {

    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        ArrayList<Integer> reversedArrayList = new ArrayList<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedArrayList.add(arrayList.get(i));
        }
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        // LinkedList 
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("\nOriginal LinkedList: " + linkedList);
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reversedLinkedList.add(linkedList.get(i));
        }
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
    }
}

