package org.dsa.binarySearch;

public class NthRoot {

    static int nthRoot(int n, int m){
        for(int i=1;i<m;i++){
            int ans=1;
            for(int j=1;j<=n;j++){

                ans=ans*i;

            }
            if(ans==m) return i;
        }
        return -1;
    }
    static  int nthRootBinary(int n, int m){
        int low=1,high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=1;
            for(int i=1;i<=n;i++){
                ans=ans*mid;

            }
            if(ans==m) return mid;

            if(ans<m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(nthRoot(3,67));
        System.out.println(nthRootBinary(3,67));
    }
}
