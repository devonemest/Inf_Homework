package com.company;

public class Main {

    public static void main(String[] args) {

        MyList list = new MyList();
        list.add(10);
        list.add(15);
        list.add(61);
        list.add(78);
        list.add(1);
        list.add(30);
        list.add(41);
        System.out.println(list.toString());
            System.out.println(list.kol());
            System.out.println(list.indexAt(4));
            System.out.println(list.givePozition(list.indexAt(2)));
            System.out.println(list.givePozition(list.indexAt(3)));
        list.sort();
        System.out.println(list.toString());

    }
}

