package com.problems.jianZhiOffer;

/**
 * Created by koujx on 2016/5/10.
 */
public class ProductArray {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        int mul = 1;
        int zero = 0;
        int index = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                zero++;
                index = i;
            }
        }
        if(zero>1) return B;
        else if(zero==1){
            for(int i=0;i<A.length;i++){
                if(i!=index){
                    mul*=A[i];
                }
            }
            B[index] = mul;
            return B;
        }else{
            for(int i=0;i<A.length;i++){
                mul*=A[i];
            }
            for(int i=0;i<B.length;i++){
                B[i] = (int) ((double)mul*Math.pow(A[i],-1));
            }
            return B;
        }
    }
}
