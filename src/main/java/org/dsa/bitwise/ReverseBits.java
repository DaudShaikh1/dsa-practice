package org.dsa.bitwise;

public class ReverseBits {
    public static void main(String[] args) {
        int n=43261596;
        System.out.println("Before: "+Integer.toBinaryString(n).replace(' ','0'));
        System.out.println("After: "+Integer.toBinaryString(reverseBits(n)));
    }
    public static int reverseBits(int n){
        //1- string reverse
//        String binary=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0'); //000..1010
//        String ans=new StringBuilder(binary).reverse().toString(); //0101000..000
//        return (int) Long.parseLong(ans,2);

        //2. extract each bit
        int reversed=0;
//        for(int i=0;i<32;i++){
//            reversed=(reversed<<1) | (n&1);
//            n>>=1;
//        }
        // 2.b
        for(int i=0;i<32;i++){
            reversed<<=1;
            reversed|=((n>>i)&1);
        }

        return reversed;
    }
}
