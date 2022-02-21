package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
     ArrayList<Integer> arr = new ArrayList<>();
     Collections.addAll(arr,3,6,1,23);
     for (int i = 0; i<arr.size(); i++){
         if (i==0){
             System.out.print(arr.get(i)+" is first,");
         }
         else if (i==arr.size() - 1){
             System.out.print(arr.get(i)+" is last.");
         }
         else {
             System.out.print(arr.get(i)+" is after "+ arr.get(i-1) + " and below " +arr.get(i+1)+ ", ");
         }
     }
    }
}
