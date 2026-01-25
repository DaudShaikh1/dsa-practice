package org.dsa.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaySearch {
    public static void main(String[] args) {
//        int[] arr= {1,2,3,3,4,5,7};
//        int target=7;
//        System.out.println("is target present?- "+callBinarySearch(arr,target));
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,3,4,5,7));
        int target=-7;
        System.out.println("is target present?- "+listBinarySearch(list,target));
    }
    public static String listBinarySearch(List<Integer> arr,int target){
        int low=0;
        int high=arr.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==target){
                return "YES "+mid;
            } else if (arr.get(mid)<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return "NO";
    }
    public static String callBinarySearch(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return "YES "+mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return "NO";
    }
}
