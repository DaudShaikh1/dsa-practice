package org.dsa.bitwise;

public class CountingBits {
    public static void main(String[] args) {
        int n=8;
        int res[]= getBitCount(n);
        for(int i=0;i<=n;i++)
        System.out.println(res[i]);
    }

    static int[] getBitCount(int n){
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++){
            ans[i]=ans[i&(i-1)]+1;
        }
        return ans;
    }
}
