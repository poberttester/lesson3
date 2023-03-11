package com.company;

public class Main {

    public static void main(String[] args) {

        // 2.
        GetArrayList arr = new GetArrayList();
        arr.setArr(2);
        System.out.println(arr.getArr());

        // 3.
        arr.showMin();
        arr.showMax();
        arr.showAvg();

    }
}
