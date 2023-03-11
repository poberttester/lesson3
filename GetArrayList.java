package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class GetArrayList {

    private ArrayList arr = new ArrayList(Arrays.asList(2, 4, 5, 6, 7, 8, 9 ,10 ,12 ,13, 14 ,15));


    public ArrayList getArr() {;
        return arr;
    }

    public void setArr(int num) {

        for (Iterator<Integer> iterator = arr.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();

            if (number % num == 0) {
                iterator.remove();
            }

            this.arr = arr;
        }
    }

    public void showMin(){
        int min = (int) arr.get(0);

        for (Iterator<Integer> iterator = arr.iterator(); iterator.hasNext();) {
            Integer n = iterator.next();

            if (n < min){
                min = n;
            }
        }
        System.out.println("Min is: " + min);
    }

    public void showMax(){
        int max = (int) arr.get(0);

        for (Iterator<Integer> iterator = arr.iterator(); iterator.hasNext();) {
            Integer n = iterator.next();

            if (n > max){
                max = n;
            }
        }
        System.out.println("Max is: " + max);
    }

    public void showAvg(){
        double average, summ = 0;

        for (Iterator<Integer> iterator = arr.iterator(); iterator.hasNext();) {
            Integer n = iterator.next();
            summ = summ + n;
        }
        average = Math.round(summ/(arr.size()+1));
        System.out.println("Average is: " + average);
    }


}
