package de.jakob.lists;

public class Josephus {

    public static void main(String[] args) {
        CyclicList<String> liste = new CyclicList<>();

        for (int i = 0; i < 5; i++) {
            liste.add(Integer.toString(i));
        }

        liste.print();

    }

}
